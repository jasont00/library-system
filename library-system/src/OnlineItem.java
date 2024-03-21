package librarysystem;

/* Concrete class OnlineItem extends the Item class and represents a digital item stored in the system.
 */
public class OnlineItem extends Item{
	String publisher;
	
	public OnlineItem(String name, String type, Double price, String publisher)throws Exception {
		super(name, type, price);
		this.publisher = publisher;
		Database.getDatabase().loaditem(this);
		Database.getDatabase().updateitem();
	}
	
	public void open() {
		// This method should display the book contents
		System.out.println("(Display book contents here)");
	}
	
	public String getPublisher() {
		return publisher;
	}
	@Override
	public String toString() {
		return "OnlineItem [name=" + name + ", id=" + id + ", type=" + type + ", price=" + price +", publisher="+publisher+ "]";
	}
}
