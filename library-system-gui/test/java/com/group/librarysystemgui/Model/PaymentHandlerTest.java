package com.group.librarysystemgui.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaymentHandlerTest {

	@Test
	void test_1() {
		Double hello = 1.1;
		
		try {
			hello = PaymentHandler.getPrice("book1", "1.1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("unsure"); 
		} 
		
		//price is 10 --> 0 discount since it is outside the range
		assertEquals(hello, 10);
	}
	
	@Test
	void test_2() {
		Double hello = null ;
		try {
			hello = PaymentHandler.getPrice("book1", "0.4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("unsure"); 
		} 
		//40% off 10 = 6
		assertEquals(hello, 6); 
	}
	
	@Test
	void test_3() {
		Double hello = null ;
		try {
			hello = PaymentHandler.getPrice("doesnotexist", "0.4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertEquals("fails", "fails");
		} 
	}
	
	@Test
	void test_4() {
		Double hello = null ;
		try {
			hello = PaymentHandler.getPrice("book1", "-1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("unsure"); 
		} 
		//no discount
		assertEquals(hello, 10); 
	}
	
	//only has 4 test cases since it is a very simple class
	
	
}
