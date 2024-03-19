public class UserBuilder extends AbstractUser {
	public void buildType() {
		user.setType("User");
	}

	public void buildEmail() {
		user.setEmail("UserEmail");
	}

	public void buildPassword() {
		user.setPassword("UserPassword");
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
