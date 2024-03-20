package librarysystem;

import java.util.ArrayList;
import java.util.List;

class User {
	
	private String type = "";
	private String email = "";
	private String password = "";
	public boolean rentEligible;
	List<Item> rentedItems = new ArrayList<>();
	List<Newsletter> subscriptions = new ArrayList<>();
	public List<Item> purchasedItems = new ArrayList<>();
	
	public void viewTextbooks() {
		// TODO Auto-generated method stub
		
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
	
	@Override
	public void rentItem(Item i) {
		rentedItems.add(i);
	}
	
	@Override
	public void subscribe(Newsletter n) {
		subscriptions.add(n);
	}

	@Override
	public void cancel(Newsletter n) {
		subscriptions.remove(n);
	}

	public void requestItem(String s) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void purchase(Item i) {
		purchasedItems.add(i);
		PaymentHandler.getPaymentHandler.getPrice(i.getName);
	}
}
