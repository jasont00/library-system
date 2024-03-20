package librarysystem;

class StudentBuilder extends UserDecorator {
	
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
