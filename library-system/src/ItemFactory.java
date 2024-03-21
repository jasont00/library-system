package librarysystem;

import com.group.librarysystemgui.Model.Item;

/* Concrete factory class responsible for creating the concrete subsclasses of the Item class.
 * *note: should publisher be universal for all items? should online items have ids?
 */
public class ItemFactory { // c signifies the class
	public Item getItem(String c, String name, String type, double price, String publisher, boolean rentable) {
		
		if (c.equalsIgnoreCase("onlineitem")) {
			Item item = new OnlineItem(name, type, price, publisher);
			Database.getDatabase().loaditem(item);
			return item;
		}
		
		else if (c.equalsIgnoreCase("physicalitem")) {	// automatically stores the item in the physicalItemRepo
			Item item = new PhysicalItem(name, type, price, rentable);
			
			if (PhysicalItemRepo.itemOccurrences.get(item.getName()) > 20) {	// if there's already 20 items with the same name, return void;
				System.out.println("There are already 20 copies of an item with the same name.");
				return null;
			}
			
			else {
				PhysicalItemRepo.addItem(item.getId(), item);
				return item;
			}

		}
		
		else if (c.equalsIgnoreCase("textbook")) {
			return new Textbook(name, type, price, publisher);
		}
		
		else if (c.equalsIgnoreCase("newsletter")) {
			return new Newsletter(name, type, price, publisher);
		}
		
		else {
			return null;
		}
	}
}
