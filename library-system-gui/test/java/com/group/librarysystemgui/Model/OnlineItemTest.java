package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.Model.OnlineItem;
import com.group.librarysystemgui.Model.PhysicalItem;

class OnlineItemTest {

	@Test
	void OnlineItemConstructorTest() {
		OnlineItem book = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		
		// Check if constructed properly
		assertEquals("Design Patterns", book.getName());
		assertEquals("Publisher A", book.getPublisher());
	}
	
	@Test
	void OnlineItemGetterTest() {
		OnlineItem book = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		
		book.setPublisher("Publisher B");
		assertEquals("Publisher B", book.getPublisher());
	}
	
	@Test
	void OnlineItemOpenMethodTest() {
		OnlineItem book = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		
		assertEquals("(Display book contents here)", book.open());
	}
	
	@Test
	void OnlineItemVoidPublisherTest() {
		String s = null;
		OnlineItem book = new OnlineItem("Design Patterns", 0.0, s);
		
		assertEquals(null, book.getPublisher());
	}
	
	@Test
	void OnlineItemSuperClassAttributesTest() {
		OnlineItem book = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		
		assertEquals("onlineitem", book.getType());
		assertEquals(false, book.getRentable());
	}

	@Test
	void OnlineItemToStringTest() {
		OnlineItem book = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		assertEquals("OnlineItem [name=Design Patterns, id=" + book.getId() + ", type=onlineitem, price=0.0, publisher=Publisher A]", book.toString());
	}
	
	@Test
	void ItemSuperClassSettersTest() {
		Item book = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		
		book.setId(1);
		book.setName("Deliverable 3");
		book.setType("onlinebook");
		book.setRentable(false);
		book.setPrice(1.99);
		
		assertEquals(1, book.getId());
		assertEquals("Deliverable 3", book.getName());
		assertEquals("onlinebook", book.getType());
		assertEquals(false, book.getRentable());
		assertEquals(1.99, book.getPrice());
	}
	
	@Test
	void OnlineItemSuperClassInapplicableMethodsTest() {
		Item book = new PhysicalItem("Design Patterns", 0.0, false);
		Item book1 = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		
		assertEquals(null, book.getPublisher());
		assertEquals(null, book1.getOwner());
	}
	
	@Test
	void OnlineItemSetPublisherEmptyTest() {
		OnlineItem book = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		
		book.setPublisher("");
		
		assertEquals("", book.getPublisher());
	}
	
	@Test
	void OnlineItemEqualsTest() {
		OnlineItem book1 = new OnlineItem("Design Patterns", 0.0, "Publisher A");
		OnlineItem book2 = new OnlineItem("Design Patterns", 0.0, "Publisher A");
	
		assertEquals(book2.getPublisher(), book1.getPublisher());
		assertNotEquals(book1, book2);
	}
	
}
