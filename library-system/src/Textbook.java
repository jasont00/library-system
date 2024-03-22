package librarysystem;

/* Concrete class Textbook extends OnlineItem and represents an online version of a textbook.
 * Attribute courses is a list that contain all the associated courses that use the textbook
 */

public class Textbook extends OnlineItem{
	public boolean available;
	public int edition;
	
	public Textbook (String name, double price, String publisher) throws Exception{
		super(name, "textbook", price, publisher);
	}
	public Textbook (String name, String type, double price, String publisher) throws Exception{
		super(name, "textbook", price, publisher);
	}
	
	public void open() {
		// This method should display the textbook contents
		System.out.println("(Display textbook contents here)");
	}
}
