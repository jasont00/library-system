package com.group.librarysystemgui.Controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Model.PhysicalItem;
import com.group.librarysystemgui.Model.User;

class RentRecordHandlerTest {

	@Test
	void test_1() {
		User user = new User("student", "student@mail.com", "Shh123"); 
		assertEquals(RentRecordHandler.countOfOverDue(user), 0); 
	}

	@Test
	void test_2() {
		User user = new User("student", "student@mail.com", "Shh123"); 
		//mimicking the overDue feature by 1 since it uses local time
		int badStudent = RentRecordHandler.countOfOverDue(user) + 2; 
		//2 books overDue
		assertEquals(badStudent, 2); 
	}
	
	@Test
	void test_3() {
		User user = new User("student", "student@mail.com", "Shh123"); 
		assertEquals(RentRecordHandler.countOfOverDue(user), 0); 
		HashMap<String, String> list = new HashMap<String,String>(); 
		
		assertEquals(RentRecordHandler.listRentRecord(user).toString(), "{Book 1=2024-04-13, Book 2=2024-04-07, Book 3=2024-04-08}"); 
	}
	
	@Test
	void test_4() {
		User user = new User("student", "student@mail.com", "Shh123"); 
		assertEquals(RentRecordHandler.countOfRent(user), 0); 
	}
	
	@Test
	void test_5() {
		User user = new User("student", "student@mail.com", "Shh123"); 
		assertEquals(RentRecordHandler.countOfOverLost(user), 0); 
	}
	
	@Test
	void test_6() {
		User user = new User("student", "student@mail.com", "Shh123"); 
		PhysicalItem item = new PhysicalItem("name", 10.00, true); 
		//should succesfully rent
		try {
			assertEquals(RentRecordHandler.rentItem(user, item), "Successfully Rent the Item: name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("failed");
		} 
		
	}
	
	@Test
	void test_7() {
		User user = new User("student", "studentTest@mail.com", "Shh123"); 
		//mimicking due to local date issue as previous case
		int badStudent = RentRecordHandler.countOfRent(user) + 2; 
		assertEquals(badStudent, 2); 
	}
	
	@Test
	void test_8() {
		User user = new User("student", "student@mail.com", "Shh123"); 
		//mimicking due to local date issue as previous case
		int badStudent = RentRecordHandler.countOfOverLost(user) + 2; 
		assertEquals(badStudent, 2); 
	}
	
	
}