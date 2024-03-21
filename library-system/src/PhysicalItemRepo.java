package librarysystem;

import java.util.HashMap;

public class PhysicalItemRepo {
	static HashMap<Integer, PhysicalItem> inventory = new HashMap<Integer, PhysicalItem>();		// stores items by their ID
	static HashMap<String, Integer> itemOccurrences = new HashMap<String, Integer>();				// stores quantity of items with the same name
	
	public HashMap<Integer, Item> getInventory() {
		return stock;
	}
	
	public static void addItem(PhysicalItem item) {
		stock.put(item.getId(), item);
		
		String itemName = item.getName();
		itemOccurrences.put(itemName, itemOccurrences.getOrDefault(itemName, 0) + 1)
	}
	
	public static int countQuantity(String name) {		// should return the number of occurrences of an item in the inventory (if they have the same name)
		return itemOccurrences.getOrDefault(itemName, 0);
	}
	
}
