package librarysystem;

class UserDirector {
	private UserBuilder userBuilder;
	
	public void setUserBuilder(UserBuilder ub) {
		userBuilder = ub;
	}
	
	public User getUser() {
		return userBuilder.getUser();
	}
	
	public void createUser() {
		userBuilder.createNewUser();
		userBuilder.buildType();
		userBuilder.buildEmail();
		userBuilder.buildPassword();
	}
}
