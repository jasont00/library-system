package librarysystem;

public abstract class UserBuilder {
	protected User user;
	
	public void createNewUser() {
		user = new User(); 
	}
	
	public abstract void buildType();
	
	public abstract void buildEmail() throws Exception;;
	
	public abstract void buildPassword();

	public User getUser() {
		return user;
	}
	
}
