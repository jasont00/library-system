package librarysystem;

/* Concrete class PhysicalItem extends Item and represents a physical item that is stored in the library.
 * Unique attribute rentable is a boolean that denotes whether or not the item is available or able to be rented. Admins are able to change this.
 * Zaki: added constructor for databse as well as a to string
 */
public class PhysicalItem extends Item{
	boolean rentable;
	boolean rented;
	
	public PhysicalItem(String name, String type, double price, boolean rentable) {
		super(name, type, price);
		this.rentable = rentable;
		rented = false;
		Database.getDatabase().loaditem(this);
		PhysicalItemRepo.addItem(this);
	}
	
	public PhysicalItem() {
		super();
	}
	
	public boolean getRentable() {
		return rentable;
	}

	public void setRented(boolean b) {
		rented = b;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", type=" + type + ", price=" + price + "]";
	}
}
