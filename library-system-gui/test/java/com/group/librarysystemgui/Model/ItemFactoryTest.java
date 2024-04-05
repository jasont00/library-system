package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.Model.ItemFactory;

class ItemFactoryTest {

	@Test
	void CreateOnlineItemTest() throws Exception {
		Item item = ItemFactory.getItem("onlineitem", "A Book", 0.0, "Publisher A", false);
		assertEquals("onlineitem", item.getType());
	}


	@Test
	void CreatePhysicalItemTest() throws Exception {
		Item item = ItemFactory.getItem("physicalitem", "A Physical Book", 19.99, "Publisher A", true);
		assertEquals("physicalitem", item.getType());
	}
	
	
	@Test
	void CreateCDTest() throws Exception {
		Item item = ItemFactory.getItem("cd", "A Disk", 0.0, "", true);
		assertEquals("cd", item.getType());
	}
	
	@Test
	void CreateMagazineTest() throws Exception {
		Item item = ItemFactory.getItem("magazine", "The View", 0.0, "", true);
		assertEquals("magazine", item.getType());
	}
	
	@Test
	void CreateTextbookTest() throws Exception {
		Item item = ItemFactory.getItem("textbook", "Design Pattern", 0.0, "Publisher A", true);
		assertEquals("textbook", item.getType());
	}
	
	@Test
	void CreateTextbookEditionTest() throws Exception {
		Item item = ItemFactory.getItem("textbook", "Design Pattern %3", 0.0, "Publisher A", true);
		assertEquals("textbook", item.getType());
	}
	
	@Test
	void CreateNewsletterTest() throws Exception {
		Item item = ItemFactory.getItem("newsletter", "The Daily", 0.99, "Publisher B", true);
		assertEquals("newsletter", item.getType());
	}
	
	@Test
	void CreateOnlineBookTest() throws Exception {
		Item item = ItemFactory.getItem("onlinebook", "A Book Or Something", 0.0, "Publisher A", true);
		assertEquals("onlinebook", item.getType());
	}
	
	@Test
	void CreateInvalidItemTest() throws Exception {
		Item item = ItemFactory.getItem("donut", "Ordinary Glazed", 0.0, "Tim Hortons", true);
		assertEquals(null, item);
	}

	@Test
	void Create20PhysicalItemsTest() throws Exception {
		Item item = ItemFactory.getItem("physicalitem", "A Physical Book1", 19.99, "Publisher A", true);
		for (int i = 0; i < 21; i++) {
			item = ItemFactory.getItem("physicalitem", "A Physical Book1", 19.99, "Publisher A", true);
		}
		assertEquals(null, item);
	}
	
	@Test
	void Create20CDsTest() throws Exception {
		Item item1 = ItemFactory.getItem("cd", "Disk1", 0.0, "", true);
		for (int i = 0; i < 21; i++) {
			item1 = ItemFactory.getItem("cd", "Disk1", 0.0, "", true);
		}
		assertEquals(null, item1);

	}
	
	@Test
	void Create20MagazinesTest() throws Exception {
		Item item = ItemFactory.getItem("magazine", "The View1", 0.0, "", true);
		for (int i = 0; i < 21; i++) {
			item = ItemFactory.getItem("magazine", "The View1", 0.0, "", true);
		}
		assertEquals(null, item);
	}
	
	
	@Test
	void SaveItemTest() throws Exception {
		ItemFactory.saveItem("onlineitem", "Online Book 2", 0.0, "", false);
		ItemFactory IF = new ItemFactory();
	}
}
