package librarysystem;

public class UserBuilder extends AbstractUser {
	

	public void assemble() {
		System.out.println("User Features");
	}
	
	public void viewTextbooks() {
		// TODO Auto-generated method stub
	}
	
	public void buildType() {
		user.setType("user");
	}

	public void buildEmail() {
		user.setEmail("usersEmail");
	}

	public void buildPassword() {
		user.setPassword("usersPassword");
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
	public void purchase(Item i) throws Exception {
		purchasedItems.add(i);
		PaymentHandler.getPaymentHandler().getPrice(i.getName());
	}
}
