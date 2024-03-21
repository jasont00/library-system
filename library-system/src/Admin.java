package librarysystem;

public class Admin {
	
	public void enableItem(PhysicalItem item) {
		item.rentable = true; 
	}
	
	public void disableItem(PhysicalItem item) {
		item.rentable = false; 		
	}
	public void createItem(String ctype, String name, String type, double price, String publisher, boolean rentable) {	
		ItemFactory factory = new ItemFactory();
		factory.getItem(ctype, name, type, price, publisher, rentable); 
	}
	public void addUser(String type, String email, String password) {
		
		UserBuilder abs = new basicUserBuilder();
      		UserDirector direc = new UserDirector();
		direc.setUserBuilder(abs);
		direc.createUser();
		User use = direc.getUser();
		use.setEmail(email);
		use.setPassword(password);
		use.setType(type);
	}
}
