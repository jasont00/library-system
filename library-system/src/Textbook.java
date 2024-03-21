package librarysystem;

/* Concrete class Textbook extends OnlineItem and represents an online version of a textbook.
 * Attribute courses is a list that contain all the associated courses that use the textbook
 */

public class Textbook extends OnlineItem{
	String name;
	String code;
	ArrayList<Textbook> textbooks;
	
	public Course(String n, String c) {
		name = n;
		code = c;
		
		textbooks = new ArrayList<Textbook>();
	}
	
	public ArrayList<Textbook> getTextbooks() {
		return textbooks;
	}
	
	public void addTextbook(Textbook t) {
		textbooks.add(t);
	}
}
