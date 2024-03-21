package librarysystem;

import java.util.ArrayList;

/* Class that represents a course and has a list of textbooks. Is associated with the Textbook class.
 */
public class Course {
	String name;
	String code;
	ArrayList<Textbook> textbooks;
	
	public Course(String n, String c) {
		name = n;
		code = c;
		
		textbooks = new ArrayList<String>();
	}
	
	public ArrayList<Textbook> getTextbooks() {
		return textbooks;
	}
	
}
