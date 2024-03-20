package librarysystem;

class UserDirector {
	private AbstractUser abstractUser;
	
	public void setAbstractUser(AbstractUser au) {
		abstractUser = au;
	}
	
	public User getUser() {
		return abstractUser.getUser();
	}
	
	public void createUser() {
		abstractUser.createNewUser();
		abstractUser.buildType();
		abstractUser.buildEmail();
		abstractUser.buildPassword();
	}
}
