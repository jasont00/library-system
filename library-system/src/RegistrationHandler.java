package librarysystem;

public class RegistrationHandler{

private static RegistrationHandler instance;
	
	private RegistrationHandler() {
	}
	
	public static RegistrationHandler getRegistrationHandler() {
		if(instance==null) {
			instance = new RegistrationHandler();
		}
		return instance;
	}
	
	public boolean verifyEmail(String email) {
		if(email.contains("@")) {
			return true;
		}
		return false;
	}
	public boolean checkStringPW(String pw) {
		
		return false;
	}
	
	public void createUser(String user) {
		
	}
}
