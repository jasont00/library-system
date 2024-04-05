package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.group.librarysystemgui.Model.PhysicalItem;

class PhysicalItemTest {

	@Test
	void PhysicalItemConstructorTest() {
		PhysicalItem book = new PhysicalItem("Design Patterns", 19.99, true);
		
		// Check if constructed properly
		assertEquals(true, book.getRentable());
		assertEquals(19.99, book.getPrice());
		assertEquals("Design Patterns", book.getName());
	}
	
	@Test
	void PhysicalItemUniquenessTest() {
		PhysicalItem book1 = new PhysicalItem("Design Patterns", 19.99, true);
		PhysicalItem book2 = new PhysicalItem("Design Patterns", 19.99, true);
		assertNotEquals(book1, book2);
		assertNotEquals(book1.getId(), book2.getId());
	}
	
	@Test
	void PhysicalItemEmptyConstructorTest() {
		PhysicalItem book = new PhysicalItem();
		
		//check if empty
		assertEquals(false, book.getRentable());
		assertEquals(null, book.getOwner());
	}
	
	@Test
	void PhysicalItemSetterTest() {
		PhysicalItem book = new PhysicalItem("Design Patterns", 19.99, true);
		
		// try setters
		book.setOwner("user@gmail.com");
		
		// check if changed correctly
		assertEquals("user@gmail.com", book.getOwner());
	}
	
	@Test
	void PhysicalItemToStringTest() {
		PhysicalItem book = new PhysicalItem("Design Patterns", 19.99, true);
		assertEquals("Physical Item [name=Design Patterns, id=" + book.getId() + ", type=physicalitem, price=19.99]", book.toString());
	}
	
	@Test
	void PhysicalItemSuperClassGettersTest() {
		PhysicalItem book = new PhysicalItem("Design Patterns", 19.99, true);
		assertEquals("physicalitem", book.getType());
		assertEquals(null, book.getPublisher());
	}
	
	@Test
	void PhysicalItemSuperClassSettersTest() {
		PhysicalItem book = new PhysicalItem("Design Patterns", 19.99, true);
		
		// use setters
		book.setPrice(1.0);
		book.setType("PhysicalItem");
		book.setName("Design Patterns Ed:4");
		
		assertEquals(1.0, book.getPrice());
		assertEquals("PhysicalItem", book.getType());
		assertEquals("Design Patterns Ed:4", book.getName());
	}
	
	@Test
	void PhysicalItemAttributesTest() {
		PhysicalItem book = new PhysicalItem("Design Patterns", 19.99, true);
		
		book.setRentable(true);
		book.setRented(true);
		book.setOwner("joe@email.com");
		
		assertEquals(true, book.getRentable());
		assertEquals(true, book.getRented());
		assertEquals("joe@email.com", book.getOwner());
	}
	
	@Test
	void PhysicalItemEmptyAttributeTest() {
		PhysicalItem book = new PhysicalItem("", 0, true);
		
		assertEquals("", book.getName());
		assertEquals(0, book.getPrice());
	}
	
	@Test
	void PhysicalItemNullAttributeTest() {
		PhysicalItem book = new PhysicalItem(null, -1, true);
		assertEquals(null, book.getName());
		assertEquals(-1, book.getPrice());
	}
	
}
