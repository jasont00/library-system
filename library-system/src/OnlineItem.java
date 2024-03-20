package librarysystem;

/* Concrete class OnlineItem extends the Item class and represents a digital item stored in the system.
 */
public class OnlineItem extends Item{
	String publisher;
	
	public OnlineItem(String name, String type, Double price, String publisher) {
		super(name, type, price);
		this.publisher = publisher;
		Database.getDatabase().loaditem(this);

	}
	
	public void open() {
		//TODO: empty method
	}
	@Override
	public String toString() {
		return "PhysicalItem [name=" + name + ", id=" + id + ", type=" + type + ", price=" + price +", publisher="+publisher+ "]";
	}
}
