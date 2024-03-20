package librarysystem;

class StudentBuilder extends UserDecorator {
	

	public void viewTextbooks() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Student Features");
	}
	
	public void buildType() {
		user.setType("student");
	}

	public void buildEmail() {
		user.setEmail("studentsEmail");
	}

	public void buildPassword() {
		user.setPassword("studentsPassword");
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
		PaymentHandler.getPaymentHandler().getPrice(i.getName);
	}
	
}
