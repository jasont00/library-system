package com.group.librarysystemgui.Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class User implements TextBookObserver {

	//Finish the method update
	//Implement the cost of newsletters
	//Fully implement the duedate with item class.
	//update everything onto the class diagram on draw.io

	private String type = " ";
	private String email = " ";
	private String password = " ";
	Admin admin = new Admin();
	public boolean rentEligible;
	List<Item> ownedItems = new ArrayList<>();
	List<Course> courses = new ArrayList<>();
	List<Notification> notificationList = new ArrayList<>();


//	List<PhysicalItem> rentedItems = new ArrayList<>();

	// Key is the item rented, Value is the duedate
	HashMap<PhysicalItem, LocalDate> rentedItems = new HashMap<>();

	public User(String type,String email,String password){
		this.type = type;
		this.email = email;
		this.password = password;
		this.rentEligible = true;
	}

	/**
	 * - make a due date which is calculated using current date
	 * - send a warning when duedate-current date approaches a certain x (can be 3)
	 * - Add a 50cent fees each day for every number below 0 for dueDate-currentDate +
	 * - when dueDate-currentDate reaches 15 it is considered lost
	 * @return
	 */
	public int countOverDue(){
		int overdueCount = 0;
		for (Map.Entry<PhysicalItem, LocalDate> entry : rentedItems.entrySet()) {
			LocalDate dueDate = entry.getValue();
			long daysUntilDue = LocalDate.now().until(dueDate).getDays();
			if(daysUntilDue<0){
				overdueCount++;
			}
		}
		return overdueCount;
	}

	public int countLost(){
		int lostCount = 0;
		for (Map.Entry<PhysicalItem, LocalDate> entry : rentedItems.entrySet()) {
			LocalDate dueDate = entry.getValue();
			long daysUntilDue = LocalDate.now().until(dueDate).getDays();
			if(daysUntilDue<=-15){
				lostCount++;
			}
		}
		return lostCount;
	}

	public boolean checkPrivileges(){
		return countOverDue() <=3;
	}

	public double calculatePenalty(){
		return 50*countOverDue();
	}

	public void addCourse(Course c) { //Only student can add courses, textbooks from the course will be added to ownedItems list
		if(Objects.equals(this.type, "student")) {
			courses.add(c);
			ownedItems.addAll(c.getTextbooks());
		}
		else {
			System.out.println("Cannot add course");
		}
	}

	public void viewCourses() { //Only Faculty type can use this
		if(Objects.equals(this.type, "faculty")) {
			for(Course c : courses) {
				c.printDetails();
			}
		}
		else {
			System.out.println("Cannot view courses");
		}
	}

	public void viewTextbooks() { //Only Student and Faculty type can use this method
		if(Objects.equals(this.type, "student") || Objects.equals(this.type, "faculty")) {
			for(Item i : ownedItems) {
				if(i.getClass().equals(Textbook.class)) {
					System.out.println(i.getName());
				}
			}
		}
		else
		{
			System.out.println("Cannot view textbook");
		}
	}

	public void setType(String s) {
		this.type = s;
	}

	public void setEmail(String s) {
		this.email = s;
	}

	public void setPassword(String s) {
		this.password = s;
	}

	public String getType() {
		return this.type;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public boolean getRE() {
		return rentEligible;
	}

	public void rentItem(PhysicalItem i) {
		if(i.rented) {
			System.out.println("This item is already rented");
		}

		else if(i.getRentable() && rentedItems.size()<10 ) {
			LocalDate dueDate = LocalDate.now().plus(Period.ofMonths(1));
			rentedItems.put(i,dueDate);
			i.setRented(true);
		}
		else if (!i.getRentable()){
			System.out.println("This item is not rentable");
		}
		else {
			System.out.println("You have too many books!");
		}
	}

	public void unRentItem(PhysicalItem i) {
		rentedItems.remove(i);
	}

	public void subscribe(Newsletter n) {
		ownedItems.add(n);
	}

	public void cancel(Newsletter n) {
		ownedItems.remove(n);
	}

//	public void requestItem(String name, String type, String publisher, String price, boolean rentable) {
//		admin.createItem(name, type, publisher, price, rentable);
//	}

//	public void purchase(Item i)  throws Exception {
//		ownedItems.add(i);
//		PaymentHandler.getPaymentHandler().getPrice(i.getName());
//	}


	@Override
	public void update(TextBookSubject textBookSubject) {
		if(!this.type.equals("faculty")){
			// do nothing.
			return;
		}
		String content = textBookSubject.textbook.name +" is available now for Edition:" + textBookSubject.textbook.edition;
		this.notificationList.add(new Notification(this,"NewEdition",content));
	}

	public List<Notification> getNotificationList() {
		return notificationList;
	}

	public void setNotificationList(List<Notification> notificationList) {
		this.notificationList = notificationList;
	}
}