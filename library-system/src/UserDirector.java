package librarysystem;

class UserDirector {
	private AbstractUser abstractUser;
	
	public void setAbstractUser(AbstractUser au) {
		abstractUser = au;
	}
	
	public User getUser() {
		return abstractUser.getUser();
	}
	
	public void createUser(String t, String e, String p) {
		abstractUser.createNewUser();
		abstractUser.buildType(t);
		abstractUser.buildEmail(e);
		abstractUser.buildPassword(p);
	}
}
