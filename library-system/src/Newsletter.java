package librarysystem;

public class Newsletter extends OnlineItem {
	// price represents the subscription price (per month)
	// some external features that are outside the scope of this course should be added here to accomodate viewing the newsletter through the external "interface"
	
	public Newsletter (String name, double price, String publisher)throws Exception {
		super(name, "newsletter", price, publisher);
	}
	public Newsletter (String name, String type, double price, String publisher) throws Exception{
		super(name, "newsletter", price, publisher);
	}
	
	public void open() {
		// This method should open up the newsletter through the associated interface.
		System.out.println("(Open up newsletter interface and display Newsletter contents here)");
	}
}
