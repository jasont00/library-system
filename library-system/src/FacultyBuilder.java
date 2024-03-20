package librarysystem;

class FacultyBuilder extends UserDecorator {
	

	public void Courses() { //added bahaviour for decorator pattern
		// TODO Auto-generated method stub
		
	}
	
	public void viewTextbooks() { //added bahaviour for decorator pattern
		// TODO Auto-generated method stub
		
	}
	
	public void update(TextbookSubject t) { //added bahaviour for decorator pattern
		// TODO Auto-generated method stub
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Faculty Features");
	}
	
	public void buildType() {
		user.setType("faculty");
	}

	public void buildEmail() {
		user.setEmail("facultyEmail");
	}

	public void buildPassword() {
		user.setPassword("facultysPassword");
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
