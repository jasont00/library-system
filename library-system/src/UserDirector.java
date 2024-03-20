package librarysystem;

class UserDirector {
	private AbstractUser abstractUser;
	
	public void setAbstractUser(AbstractUser au) {
		abstractUser = au;
	}
	
	public User getUser() {
		return abstractUser.getUser();
	}
	
	public void createUser(UserBuilder u, String t, String e, String p) {
		u.buildType(t);
		u.buildEmail(e);
		u.buildPassword(p);
	}
}
