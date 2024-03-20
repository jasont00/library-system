package librarysystem;

public class UserBuilder extends AbstractUser {
	
	public UserBuilder(User u) {
		super(u);
	}
	
	public void assemble() {
		System.out.println("User Features");
	}
	
	public void viewTextbooks() {
		// TODO Auto-generated method stub
	}
	
	public void buildType(String t) {
		user.setType(t);
	}

	public void buildEmail(String e) {
		user.setEmail(e);
	}

	public void buildPassword(String p) {
		user.setPassword(p);
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

	@Override
	public void requestItem(String s) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void purchase(Item i) {
		purchasedItems.add(i);
		PaymentHandler.getPaymentHandler.getPrice(i.getName);
	}
}
