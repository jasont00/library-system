class User {
	
	private String type = "";
	private String email = "";
	private String password = "";

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
