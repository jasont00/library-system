/* Concrete factory class responsible for creating the concrete subsclasses of the Item class.
 * *note: should publisher be universal for all items? should online items have ids?
 */
public class ItemFactory {
	public Item getItem(String name, String type, double price, String publisher, boolean rentable) {
		if (type.equalsIgnoreCase("onlineitem")) {
			return new OnlineItem(name, type, price, publisher);
		}
		else if (type.equalsIgnoreCase("physicalitem")) {
			return new PhysicalItem(name, type, price, rentable);
		}
		else if (type.equalsIgnoreCase("textbook")) {
			return new Textbook(name, type, price, publisher);
		}
		else if (type.equalsIgnoreCase("newsletter")) {
			return new Newsletter(name, type, price, publisher);
		}
		else {
			return null;
		}
	}
}
