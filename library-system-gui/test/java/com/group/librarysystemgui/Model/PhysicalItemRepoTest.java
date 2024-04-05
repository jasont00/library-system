package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Model.PhysicalItem;
import com.group.librarysystemgui.Model.PhysicalItemRepo;

class PhysicalItemRepoTest {

	@Test
	void EmptyInventoryTest() {
		HashMap<Integer, PhysicalItem> inventory = PhysicalItemRepo.getInventory();
		
		assertEquals(null, inventory.get(999));
	}

	@Test
	void AddItemTest() {
		PhysicalItem book1 = new PhysicalItem("Design Patterns", 19.99, true);
		PhysicalItem book2 = new PhysicalItem("Design Patterns", 19.99, true);
		
		PhysicalItemRepo.addItem(book1);
		PhysicalItemRepo.addItem(book2);
		
		int id1 = book1.getId();
		int id2 = book2.getId();
		
		assertEquals(book1, PhysicalItemRepo.getInventory().get(id1));
		assertEquals(book2, PhysicalItemRepo.getInventory().get(id2));
	}
	
	@Test
	void countQuantityEmptyTest() {
		assertEquals(0, PhysicalItemRepo.countQuantity("Empty Book"));
	}
	
	@Test
	void countQuantityTest() {
		PhysicalItem book1 = new PhysicalItem("Quantity over Quality", 19.99, true);
		PhysicalItem book2 = new PhysicalItem("Quantity over Quality", 19.99, true);
		
		assertEquals(0, PhysicalItemRepo.countQuantity("Quantity over Quality"));
		
		PhysicalItemRepo.addItem(book1);
		PhysicalItemRepo.addItem(book2);
		
		assertEquals(2, PhysicalItemRepo.countQuantity("Quantity over Quality"));
	}
	
	@Test
	void getItemTest() {
		PhysicalItem book1 = new PhysicalItem("Return Me Please!", 19.99, true);
		
		PhysicalItemRepo.addItem(book1);
		
		int id = book1.getId();
		
		assertEquals(book1, PhysicalItemRepo.getInventory().get(id));
	}
	
	@Test
	void addNullItem() {
		PhysicalItem book = null;
		
		int size = PhysicalItemRepo.getInventory().size();
		
		assertEquals(size, PhysicalItemRepo.getInventory().size());
		
		PhysicalItemRepo.addItem(book);
		
		assertEquals(size, PhysicalItemRepo.getInventory().size());
		
	}
	
	@Test
	void consistencyInventoryTest() {
		HashMap<Integer, PhysicalItem> newInventory = new HashMap<Integer, PhysicalItem>();
		
		PhysicalItem book1 = new PhysicalItem("The Book", 19.99, true);
		int id1 = book1.getId();
		newInventory.put(id1, book1);
		PhysicalItemRepo.addItem(book1);
		
		PhysicalItem book2 = new PhysicalItem("The Book", 19.99, true);
		int id2 = book2.getId();
		newInventory.put(id2, book2);
		PhysicalItemRepo.addItem(book2);
		
		PhysicalItem book3 = new PhysicalItem("The Book", 19.99, true);
		int id3 = book3.getId();
		newInventory.put(id3, book3);
		PhysicalItemRepo.addItem(book3);
		
		HashMap<Integer, PhysicalItem> inventory = PhysicalItemRepo.getInventory();
		
		assertEquals(newInventory.get(id1), inventory.get(id1));
		assertEquals(newInventory.get(id2), inventory.get(id2));
		assertEquals(newInventory.get(id3), inventory.get(id3));
	}
	
	@Test
	void ReplaceItemTest() {
		PhysicalItem book1 = new PhysicalItem("The Book", 19.99, true);
		PhysicalItemRepo.getInventory().replace(3, book1);
		
		assertEquals(book1, PhysicalItemRepo.getInventory().get(3));
		
		PhysicalItemRepo PIR = new PhysicalItemRepo();
	}
	
	@Test
	void staticInstanceTest() {
		HashMap<Integer, PhysicalItem> inventory = PhysicalItemRepo.getInventory();
		
		PhysicalItem book1 = new PhysicalItem("A Book", 19.99, true);
		int id = book1.getId();
		inventory.put(id, book1);
		
		assertEquals(inventory, PhysicalItemRepo.getInventory());
		assertEquals(inventory.size(), PhysicalItemRepo.getInventory().size());
	}
	
	@Test
	void staticInstanceOccurrencesTest() {
		HashMap<Integer, PhysicalItem> inventory = PhysicalItemRepo.getInventory();
		
		int quantity = PhysicalItemRepo.countQuantity("A Book");
		
		PhysicalItem book1 = new PhysicalItem("A Book", 19.99, true);
		int id = book1.getId();
		inventory.put(id, book1);
		
		
		assertEquals(quantity, PhysicalItemRepo.countQuantity("A Book"));
	}
	
}
