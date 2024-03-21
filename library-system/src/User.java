package librarysystem;

import java.util.ArrayList;
import java.util.List;

class User {
	
	//Finish the methods view textbook and view courses, and update.
	
	private String type = " ";
	private String email = " ";
	private String password = " ";
	Admin admin = new Admin();
	public boolean rentEligible;
	List<Item> OwnedItems = new ArrayList<>();
	
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
	
	public void rentItem(PhysicalItem i) {
		if(PhysicalItem.getRentable() == true) {
			OwnedItems.add(i);
		}
		else {
			System.out.println("This item is not rentable");
		}
	}
	
	public void subscribe(Newsletter n) {
		OwnedItems.add(n);
	}

	public void cancel(Newsletter n) {
		OwnedItems.remove(n);
	}

	public void requestItem(Item i) {
		admin.createItem(i);
	}
	
	public void purchase(Item i) {
		OwnedItems.add(i);
		PaymentHandler.getPaymentHandler().getPrice(i.getName);
	}
	
	public void update(TextbookSubject t) { //Only Faculty type can use this method
		// TODO Auto-generated method stub
	}
	
}
