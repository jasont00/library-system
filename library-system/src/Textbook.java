package librarysystem;

/* Concrete class Textbook extends OnlineItem and represents an online version of a textbook.
 * Attribute courses is a list that contain all the associated courses that use the textbook
 */
import java.util.ArrayList;
public class Textbook extends OnlineItem{
	ArrayList<Course> courses;
	public boolean available;
	
	public Textbook (String name, double price, String publisher) {
		super(name, "textbook", price, publisher);
	}
	public Textbook (String name, String type, double price, String publisher) {
		super(name, "textbook", price, publisher);
	}
	
	public void open() {
		// This method should display the textbook contents
		System.out.println("(Display textbook contents here)");
	}
}
