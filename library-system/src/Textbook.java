/* Concrete class Textbook extends OnlineItem and represents an online version of a textbook.
 * Attribute courses is a list that contain all the associated courses that use the textbook
 */
public class Textbook extends OnlineItem{
	//ArrayList<Course> courses;
	
	public Textbook (String name, double price, String publisher) {
		super(name, "textbook", price, publisher);
	}
	public Textbook (String name, String type, double price, String publisher) {
		super(name, "textbook", price, publisher);
	}
	
	public void open() {
		//TODO: empty method
	}
}
