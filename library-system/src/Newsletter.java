package librarysystem;

public class Newsletter extends OnlineItem {
	// price may want to be handled differently for this class (subscription vs. purchasing price)
	
	public Newsletter (String name, double price, String publisher) {
		super(name, "newsletter", price, publisher);
	}
	public Newsletter (String name, String type, double price, String publisher) {
		super(name, "newsletter", price, publisher);
	}
	
	public void open() {
		//TODO: empty method
	}
}
