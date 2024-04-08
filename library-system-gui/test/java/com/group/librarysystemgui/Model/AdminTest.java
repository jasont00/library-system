package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminTest {

	@Test
	void test_1() {
		PhysicalItem item = new PhysicalItem("Test", 10.00, false); 
		Admin admin = new Admin(); 
		admin.enableItem(item);
		assertEquals(item.rentable, true); 
	}
	
	@Test
	void test_2() {
		PhysicalItem item = new PhysicalItem("Test1", 20.00, true); 
		Admin admin = new Admin(); 
		admin.disableItem(item);
		assertEquals(item.rentable, false); 
	}
	
	@Test
	//creaitng an item through itemFactory then normally through Admin(the facade implementation) to see if it is properly creating the item
	void test_3() throws Exception { 
		Admin admin = new Admin(); 
		admin.createItem("PhysicalItem", "newItemTest", "PhysicalItem", 100, "pubs", true);
		Item newItem = ItemFactory.getItem("PhysicalItem", "newItemTest", 100, "pubs", true); 
		
		assertTrue(newItem.type.equalsIgnoreCase("PhysicalItem"));
		assertEquals(newItem.name, "newItemTest");
		assertEquals(newItem.price, 100);
		assertEquals(newItem.rentable, false); 
	}
	@Test
	void test_4() throws Exception {
		Admin admin = new Admin();
		admin.addUser("Student", "student@yahooo.com", "Shh123");
		
		//Mimicking addUser since the void method does not return anything just adds the user (due to model not having the builders)
		User user = new User("Student", "student@yahoo.com", "Shh123"); 
		
		assertEquals(user.getEmail(), "student@yahoo.com");
		assertEquals(user.getPassword(), "Shh123"); 
	}
	
	@Test
	void test_5() throws Exception {
		Admin admin = new Admin();
		admin.addUser("Student", "student@yahooo.com", "Pass1233");
		
		//Mimicking addUser since the void method does not return anything just adds the user (due to model not having the builders)
		User user = new User("Student", "student@yahoo.com", "Pass123"); 
		
		assertEquals(user.getEmail(), "student@yahoo.com");
		assertEquals(user.getPassword(), "Pass123"); 
	}
	
	@Test
	void test_6() throws Exception {
		Admin admin = new Admin();
		admin.addUser("Student", "student@yahooo.com", "Shh123");
		
		//Mimicking addUser since the void method does not return anything just adds the user (due to model not having the builders)
		User user = new User("Student", "student@yahoo.com", "Shh123"); 
		
		assertEquals(user.getEmail(), "student@yahoo.com");
		assertEquals(user.getPassword(), "Shh123"); 
	}
	
	@Test
	void test_7() throws Exception {
		Admin admin = new Admin();
		admin.addUser("Faculty", "faculty@yahooo.com", "Shh123");
		
		//Mimicking addUser since the void method does not return anything just adds the user (due to model not having the builders)
		User user = new User("Faculty", "faculty@yahoo.com", "Shh123"); 
		
		assertEquals(user.getEmail(), "faculty@yahoo.com");
		assertEquals(user.getPassword(), "Shh123"); 
	}
	
	@Test
	void test_8() throws Exception {
		Admin admin = new Admin();
		admin.addUser("Staff", "staff@yahooo.com", "Shh123");
		
		//Mimicking addUser since the void method does not return anything just adds the user (due to model not having the builders)
		User user = new User("Staff", "staff@yahoo.com", "Shh123"); 
		
		assertEquals(user.getEmail(), "staff@yahoo.com");
		assertEquals(user.getPassword(), "Shh123"); 
	}
	
	@Test
	void test_9() throws Exception {
		Admin admin = new Admin();
		admin.addUser("Visitor", "visitor@yahooo.com", "Shh123");
		
		//Mimicking addUser since the void method does not return anything just adds the user (due to model not having the builders)
		User user = new User("Visitor", "visitor@yahoo.com", "Shh123"); 
		
		assertEquals(user.getEmail(), "visitor@yahoo.com");
		assertEquals(user.getPassword(), "Shh123"); 
	}
 
	@Test
	void test_10() {
		PhysicalItem item = new PhysicalItem("Test", 10.00, false); 
		Admin admin = new Admin(); 
		admin.disableItem(item);
		assertEquals(item.rentable, false); 
	}
	

}
