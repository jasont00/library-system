/* Concrete class PhysicalItemRepo is a part of the flyweight pattern and works to store the copies of the PhysicalItems created by the factory.
 */
import java.util.HashMap;

public class PhysicalItemRepo {
	HashMap<Integer, Item> stock;
	
	public PhysicalItemRepo() {
		stock = new HashMap<>();
	}
	
	public void addStock(Integer id, Item item) {
		stock.put(id, item);
	}
	
}
