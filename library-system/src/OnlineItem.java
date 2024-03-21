package librarysystem;

/* Concrete class OnlineItem extends the Item class and represents a digital item stored in the system.
 */
public class OnlineItem extends Item{
	String publisher;
	
	public OnlineItem(String name, String type, Double price, String publisher) {
		super(name, type, price);
		this.publisher = publisher;
	}
	
	public void open() {
		// This method should display the book contents
		System.out.println("(Display book contents here)");
	}
	
	@Override
	public String toString() {
		return "PhysicalItem [name=" + name + ", id=" + id + ", type=" + type + ", price=" + price +", publisher="+publisher+ "]";
	}
}
