package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExternalItemTest {

	@Test
	//tests the normal constructor
	void ExternalItem_1() {
		ExternalItem item = new ExternalItem(0, 100.00); 		
		assertEquals(item.discount, 0);
		assertEquals(item.price, 100.00);
	}
	
	@Test
	//tests the return when changing the discount
	void ExternalItem_2() {
		ExternalItem item = new ExternalItem(0, 100.00); 	
		item.setDiscount(0.4);
		assertEquals(item.discount, 0.4);
		assertEquals(item.getPrice(), 60);
		}
	
	@Test
	//tests invalid discount number (not between 0.01- 1)
	void ExternalItem_3() {
		ExternalItem item = new ExternalItem(0, 100.00); 	
		item.setDiscount(99);
		assertEquals(item.discount, 0);
		assertEquals(item.getPrice(), 100);
	}
	
	@Test
	//tests invalid discount number when creating externalItem
	void ExternalItem_4() {
		ExternalItem item = new ExternalItem(1.1, 100.00); 	
		assertEquals(item.discount, 0);
		assertEquals(item.getPrice(), 100);
	}
	
	@Test
	//
	void ExternalItem_5() {
		ExternalItem item = new ExternalItem(0, 100.00); 	
		item.setDiscount(0.4);
		assertEquals(item.discount, 0.4);
		assertEquals(item.getPrice(), 60);
	}
	
	@Test
	void ExternalItem_6() {
		ExternalItem item = new ExternalItem(0, 100.00); 	
		item.setDiscount(0.4);
		assertEquals(item.discount, 0.4);
		assertEquals(item.getPrice(), 60);
	}
	
	@Test
	void ExternalItem_7() {
		ExternalItem item = new ExternalItem(9, 40); 	
		item.setDiscount(-1);
		assertEquals(item.discount, 0.0);
		assertEquals(item.getPrice(), 40);
	}
	
	@Test
	void ExternalItem_8() {
		ExternalItem item = new ExternalItem(-1, 50); 	
		assertEquals(item.discount, 0);
		assertEquals(item.getPrice(), 50);
	}
	
	
	@Test
	void ExternalItem_9() {
		ExternalItem item = new ExternalItem(0.4, 60); 	
		assertEquals(item.discount, 0.4);
		assertEquals(item.getPrice(), 36);
	}
	
	@Test
	void ExternalItem_10() {
		ExternalItem item = new ExternalItem(0.0000001,88 ); 	
		assertEquals(item.discount, 0.0000001);
		assertEquals(item.getPrice(), 87.9999912);
	}


}
