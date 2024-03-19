
/* Abstract class describing an Item object. It defines several attributes which are inherited by all subclasses of Item.
*
*Zaki: added getters and setters as well as an empty constructor which is needed for the database class
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
	public Item() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
