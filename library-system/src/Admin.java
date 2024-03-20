package library;

public class Admin {
	
	public void enableItem(PhysicalItem item) {
		item.rentable = true; 
	}
	
	public void disableItem(PhysicalItem item) {
		item.rentable = false; 		
	}
	public void createItem(Item item) {
		ItemFactory(item.name, item.type, item.price, item.publisher, item.boolean); 	
	}
	public void addUser(User user) {
		Database.users.add(user); 	
	}
}
