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
		//TODO: empty method
	}
	
}
