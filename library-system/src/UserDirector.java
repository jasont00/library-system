class UserDirector {
	private AbstractUser abstractUser;
	
	public void setAbstractUser(AbstractUser au) {
		abstractUser = au;
	}
	
	public User getUser() {
		return abstractUser.getUser();
	}
	
	public void createUser() {
		abstractUser.buildType();
		abstractUser.buildEmail();
		abstractUser.buildPassword();
	}
}
