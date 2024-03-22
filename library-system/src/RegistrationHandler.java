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
	
	public boolean verifyEmail(String email) throws Exception {
		if(email.contains("@")) {
			if(Database.getDatabase().search(email, "email").equalsIgnoreCase("true")) {
				return true;
			}
		}
		return false;
	}
	public boolean checkStrongPW(String pw) {
		boolean hasupper=false;
		boolean hasnumber=false;
		if(pw.length()>=6) {
			for(int i=0;i<pw.length();i++) {
				if(Character.isUpperCase(pw.charAt(i))) {
					 hasupper=true;
				}
				else if(Character.isDigit(pw.charAt(i))) {
					 hasnumber=true;
				}
			}
			
		}
		if(hasnumber==true && hasupper==true) {
			return true;
		}
		return false;
	}
	
}
