package librarysystem;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class User {
	
	//Finish the methods view courses, and update.
	
	private String type = " ";
	private String email = " ";
	private String password = " ";
	Admin admin = new Admin();
	public boolean rentEligible;
	List<Item> ownedItems = new ArrayList<>();
//	List<PhysicalItem> rentedItems = new ArrayList<>();

	// Key is the item rented, Value is the duedate
	HashMap<PhysicalItem, LocalDate> rentedItems = new HashMap<>();

	/**
	 * - make a due date which is calculated using current date
	 * - send a warning when duedate-current date approaches a certain x (can be 3)
	 * - Add a 50cent fees each day for every number below 0 for dueDate-currentDate +
	 * - when dueDate-currentDate reaches 15 it is considered lost
	 * @return
	 */
	public int countOverDue(){
		int overdueCount = 0;
		final DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		for (Map.Entry<PhysicalItem, String> entry : rentedItems.entrySet()) {
			i.dueDate = LocalDate.parse(entry.getValue(), dtf);
			i.daysUntilDue = LocalDate.now().until(i.dueDate).getDays();
			if(i.daysUntilDue<0){
				overdueCount++;
			}
		}
		return overdueCount;
	}

	public int countLost(){
		int lostCount = 0;
		final DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		for (Map.Entry<PhysicalItem, String> entry : rentedItems.entrySet()) {
			i.dueDate = LocalDate.parse(entry.getValue(), dtf);
			i.daysUntilDue = LocalDate.now().until(i.dueDate).getDays();
			if(i.daysUntilDue<=-15){
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
	
	public void viewTextbooks() { //Only Student and Faculty type can use this method
		// TODO Auto-generated method stub
	}
	
	public void viewCourses() { //Only Faculty type can use this
		// TODO Auto-generated method stub
	}

	public void setType(String s) {
		this.type = s;
	}

	public void setEmail(String s) throws Exception {
		if(RegistrationHandler.getRegistrationHandler().verifyEmail(s)) {
			this.email = s;
		}
	}

	public void setPassword(String s) {
		if(RegistrationHandler.getRegistrationHandler().checkStrongPW(s)) {
			this.password = s;
		}
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
	
	public void rentItem(PhysicalItem i, User user) {
        if(i.getRentable() == true && user.rentedItems.size()<10 ) {
            rentedItems.add(i, i.dueDate);
        }
        else if (i.getRentable() == false){
            System.out.println("This item is not rentable");
        }
        else {
            System.out.println("You have too many books!"); 
        }
    }
	
	public void subscribe(Newsletter n) {
		ownedItems.add(n);
	}

	public void cancel(Newsletter n) {
		ownedItems.remove(n);
	}

	public void requestItem(Item i) {
		admin.createItem(i);
	}
	
	public void purchase(Item i) {
		ownedItems.add(i);
		PaymentHandler.getPaymentHandler().getPrice(i.getName);
	}
	
	public void update(TextbookSubject t) { //Only Faculty type can use this method
		// TODO Auto-generated method stub
	}
	
}
