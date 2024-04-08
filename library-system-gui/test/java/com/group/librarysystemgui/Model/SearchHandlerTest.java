package com.group.librarysystemgui.Controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Model.PhysicalItem;
import com.group.librarysystemgui.Model.PhysicalItemRepo;
import com.group.librarysystemgui.Model.Textbook;

class SearchHandlerTest {

	@Test
	void test_1() {		
		List<Textbook> similar = new ArrayList<>(); 
		similar = SearchHandler.searchSimilarBooks("book"); 
		List<Textbook> search = SearchHandler.search("book1"); 
		//the value that exists in the csv file
		assertEquals(search.toString(), "[Physical Item [name=Book1, id=7, type=textbook, price=10.0]]" ); 
	} 
	
	@Test
	void test_2() {
		List<Textbook> similar = new ArrayList<>(); 
		similar = SearchHandler.searchSimilarBooks("book"); 
		assertEquals(similar.toString(), "[Physical Item [name=Book1, id=7, type=textbook, price=10.0], Physical Item [name=Book2, id=8, type=textbook, price=20.0]]"); 
	}
	
	@Test
	void test_3() {
		List<Textbook> search = SearchHandler.search("thisBookDoesNotExist"); 
		assertEquals(search.toString(), "[]"); 	
	}
	
	@Test
	void test_4() {
		//testing to catch the exception 
		PhysicalItem item = new PhysicalItem(); 
		PhysicalItemRepo repo = new PhysicalItemRepo(); 
		PhysicalItemRepo.addItem(item);
		item.setName(null);
		List<Textbook> search = SearchHandler.search(item.getName()); 
		assertEquals("[]", search.toString()); 
	}
	
	@Test
	void test_5() {
		//no similar books
			List<Textbook> search = new ArrayList<>(); 
			search = SearchHandler.search("bookNoSimilar");
			assertEquals(search.toString(), "[]"); 	
	}
	
	@Test
	void test_6(){
		//testing similar
		List<Textbook> similar = new ArrayList<>(); 
		similar = SearchHandler.searchSimilarBooks("bookN"); 
		assertEquals(similar.toString(), "[Physical Item [name=Book1, id=7, type=textbook, price=10.0], Physical Item [name=Book2, id=8, type=textbook, price=20.0]]"); 
	}
	

	@Test
	void test_7() {
		//no similar books
			List<Textbook> search = new ArrayList<>(); 
			search = SearchHandler.search("NoSimilar");
			assertEquals(search.toString(), "[]"); 	
	}
	

	@Test
	void test_8() {
		//no similar books
			List<Textbook> search = new ArrayList<>(); 
			search = SearchHandler.search("bookNoSimilar");
			assertEquals(search.toString(), "[]"); 	
	}
	

	@Test
	void test_9() {
		//testing if it goes out of bounds
			List<Textbook> search = new ArrayList<>(); 
			search = SearchHandler.search("TestingHowLOngTheStringForThisBOokCanBe");
			assertEquals(search.toString(), "[]"); 	
	}
	@Test
	void test_10() {
		//testing if it goes out of bounds
			List<Textbook> search = new ArrayList<>(); 
			search = SearchHandler.search(null);
			assertEquals(search.toString(), "[]"); 	
	}
	
} 
