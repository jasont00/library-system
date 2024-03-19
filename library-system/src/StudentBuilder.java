class StudentBuilder extends UserDecorator {
	
	public void buildType() {
		user.setType("Student");
	}

	public void buildEmail() {
		user.setEmail("StudentEmail");
	}

	public void buildPassword() {
		user.setPassword("StudentPassword");
	}

	@Override
	public void rentItem(Item i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subscribe(Newsletter n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel(Newsletter n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestItem(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchase(Item i) {
		// TODO Auto-generated method stub
		
	}
	
}
