package librarysystem;

import java.util.ArrayList;
import java.util.List;

class User {
	
	//Finish the methods request, view textbook and courses, and update.
	
	private String type = " ";
	private String email = " ";
	private String password = " ";
	public boolean rentEligible;
	
	
	List<PhysicalItem> rentedItems = new ArrayList<>();
	List<Newsletter> subscriptions = new ArrayList<>();
	public List<Item> purchasedItems = new ArrayList<>();
	
	
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
			rentedItems.add(i);
		}
		else {
			System.out.println("This item is not rentable");
		}
	}
	
	public void subscribe(Newsletter n) {
		subscriptions.add(n);
	}

	public void cancel(Newsletter n) {
		subscriptions.remove(n);
	}

	public void requestItem(String s) {
		// TODO Auto-generated method stub
	}
	
	public void purchase(Item i) {
		purchasedItems.add(i);
		PaymentHandler.getPaymentHandler().getPrice(i.getName);
	}
	
	public void update(TextbookSubject t) { //Only Faculty type can use this method
		// TODO Auto-generated method stub
	}
	
}
