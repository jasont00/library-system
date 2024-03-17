
/* Abstract class describing an Item object. It defines several attributes which are inherited by all subclasses of Item.
 */
public abstract class Item {
	static int IDS = 0;
	int id = 0;
	String name;
	String type;
	double price;
	
	public Item(String name, String type, double price) {
		id = ++IDS;
		this.name = name;
		this.type = type;
		this.price = price;
	}
}