package librarysystem;

public class RegistrationHandler {

private static RegistrationHandler instance;
	
	private RegistrationHandler() {
	}
	
	public static RegistrationHandler getRegistrationHandler() {
		if(instance==null) {
			instance = new RegistrationHandler();
		}
		return instance;
	}
	
	public boolean verifyEmail() {
		return false;
	}
	public boolean checkStringPW() {
		return false;
	}
	
	public void createUser(String user) {
		
	}
}
