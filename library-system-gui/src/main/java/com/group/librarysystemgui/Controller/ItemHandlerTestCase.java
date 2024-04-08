package com.group.librarysystemgui.Controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.group.librarysystemgui.Model.*;

import org.junit.jupiter.api.Test;

class ItemHandlerTestCase {

	@Test
	public void getPhysicalItemsTest() {
		
		PhysicalItemRepo.inventory.clear();
		
		PhysicalItem item1 = new PhysicalItem("Laptop", 100, true);
        PhysicalItem item2 = new PhysicalItem("Book", 20, false);
        PhysicalItem item3 = new PhysicalItem("Phone", 80, true);
        
        PhysicalItemRepo.addItem(item1);
        PhysicalItemRepo.addItem(item2);
        PhysicalItemRepo.addItem(item3);

        List<PhysicalItem> result = ItemHandler.getAlPhysicallItems();
        assertEquals(2, result.size()); 
	}
	
	@Test
	public void getPhysicalItemsTest2() {
		
		PhysicalItemRepo.inventory.clear();
		
		PhysicalItem item1 = new PhysicalItem("Laptop", 100, true);
        PhysicalItem item2 = new PhysicalItem("Book", 20, true);
        PhysicalItem item3 = new PhysicalItem("Phone", 80, true);
        
        PhysicalItemRepo.addItem(item1);
        PhysicalItemRepo.addItem(item2);
        PhysicalItemRepo.addItem(item3);

        List<PhysicalItem> result = ItemHandler.getAlPhysicallItems();
        assertEquals(3, result.size()); 
	}
	
	@Test
	public void getPhysicalItemsTest3() {
		
		PhysicalItemRepo.inventory.clear();
		
		PhysicalItem item1 = new PhysicalItem("Laptop", 100, false);
        PhysicalItem item2 = new PhysicalItem("Book", 20, false);
        PhysicalItem item3 = new PhysicalItem("Phone", 80, true);
        
        PhysicalItemRepo.addItem(item1);
        PhysicalItemRepo.addItem(item2);
        PhysicalItemRepo.addItem(item3);

        List<PhysicalItem> result = ItemHandler.getAlPhysicallItems();
        assertEquals(1, result.size()); 
	}
	
	@Test
	public void getPhysicalItemsTest4() {
		
		PhysicalItemRepo.inventory.clear();
		
		PhysicalItem item1 = new PhysicalItem("Laptop", 100, false);
        
        PhysicalItemRepo.addItem(item1);

        List<PhysicalItem> result = ItemHandler.getAlPhysicallItems();
        assertEquals(0, result.size()); 
	}
	
	@Test
	public void getPhysicalItemsTest5() {
		
		PhysicalItemRepo.inventory.clear();
		
		PhysicalItem item1 = new PhysicalItem("Laptop", 100, true);
		
        PhysicalItemRepo.addItem(item1);


        List<PhysicalItem> result = ItemHandler.getAlPhysicallItems();
        assertEquals(1, result.size()); 
	}
	
	@Test
	public void getItemsTest() {
		assertEquals(Database.getDatabase().items, ItemHandler.getAllItems());
	}
	
	@Test
	public void getAllItemsTest() throws Exception {
		
		Database.getDatabase().items.clear();
		 
		PhysicalItem item1 = new PhysicalItem("Laptop", 10000, true);
		PhysicalItem item2 = new PhysicalItem("Book", 20, true);
		PhysicalItem item3 = new PhysicalItem("Phone", 800, true);
		 
		Database.getDatabase().loaditem(item1);
		Database.getDatabase().loaditem(item2);
		Database.getDatabase().loaditem(item3);
	
		List<Item> result = ItemHandler.getAllItems();
		System.out.println(result.size());
		assertEquals(3, result.size());
	}
	
	@Test
    public void testAddTextbookAndObserver() {
        ItemHandler.addItem("Mathtextbook", "Textbook", "60", "Canada", "yes");
        assertEquals(1, TextBookTracker.getInstance().getTextbooks().size());
    }
	
	@Test
    public void testAddTextbookAndObserver2() {
        ItemHandler.addItem("Physicstextbook", "Textbook", "80", "Canada", "yes");
        assertEquals(1, TextBookTracker.getInstance().getTextbooks().size());
    }
	
	@Test
    public void testAddTextbookAndObserver3() {
        ItemHandler.addItem("Sciencetextbook", "Textbook", "46", "Canada", "yes");
        assertEquals(1, TextBookTracker.getInstance().getTextbooks().size());
    }
	
}
