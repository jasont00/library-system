package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Objects;

class UserTestCase {

	private UserDirector director = new UserDirector();
	private UserBuilder builder = new basicUserBuilder();
	private UserBuilder builder2 = new StudentBuilder();
	private User user;
	private User student;
	
	@BeforeEach
	public void setUp() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();
		
		director.setUserBuilder(builder2);
		director.createUser();
		student = director.getUser();	
	}
	
	@Test
	public void setTest(){	
		user.setType("student");
		assertEquals("student", user.getType());
	}
	
	@Test
	public void passwordTest(){	
		user.setPassword("hi123");
		assertEquals("hi123",user.getPassword());
	}
	
	@Test
	public void setRentTest(){
		user.setRentEligible(true);
		assertTrue(user.getRE());	
	}
	
	@Test
	public void rentTest() throws Exception{
		PhysicalItem item1 = new PhysicalItem("book1", 20, true);
        item1.setRented(true);
        String result1 = user.rentItem(item1);
        assertEquals("This item is already rented", result1);

        PhysicalItem item2 = new PhysicalItem("book2", 20, true);
        String result2 = user.rentItem(item2);
        assertTrue(result2.startsWith("Successfully Rent the Item"));
        assertTrue(user.rentedItems.containsKey(item2));

	}
	
	@Test
	public void unRentTest() throws Exception {
		PhysicalItem item3 = new PhysicalItem("book3", 20, false);
        String result3 = user.rentItem(item3);
        assertEquals("This item is not rentable", result3);
        
        user.unRentItem(item3);
        assertFalse(user.rentedItems.containsKey(item3));
	}
	
	@Test
	public void subscriptionTest() throws Exception{	
		 Newsletter news1 = new Newsletter("aliens", 3, "The New York Times");
		 user.subscribe(news1);
		 assertTrue(user.subscriptions.contains(news1));
		 
		 user.cancel(news1);
		 assertFalse(user.subscriptions.contains(news1));
		 
		 assertEquals(user.subscriptions, user.listSubscription());
	}
	
	@Test
	public void viewTextbookTest() {
		Textbook book1 = new Textbook("Math", 20);
		Textbook book2 = new Textbook("Science", 20);
		book1.setName("Math");
		book2.setName("Science");
		
		student.ownedItems.add(book1);
		student.ownedItems.add(book2);

		//Testing to see that the student can view the textbook
	    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));	
	    student.viewTextbooks();
	    String output = outputStream.toString().trim().replaceAll("\\r\\n", "\n");   
	    System.setOut(System.out);   
	    assertEquals("Math\nScience", output);
	    
	    //Testing to see that the user can't view the textbook
	    outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));	
	    user.viewTextbooks();
	    output = outputStream.toString().trim().replaceAll("\\r\\n", "\n");   
	    System.setOut(System.out);   
	    assertEquals("Cannot view textbook", output);
	}
	
	@Test
	public void notificationTest() {
		assertEquals(user.notificationList, user.getNotificationList());
	}
	
	@Test
	public void countTest() {
		assertEquals(user.rentedItems.size(), user.countRentSize());
		assertTrue(user.checkPrivileges());
		assertEquals(user.countOverDue()*50, user.calculatePenalty());
		assertEquals(0, user.countLost());
		assertEquals(0, user.countOverDue());
	}
	
	@Test
	public void viewCoursesTest() {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));	
	    student.viewCourses();
	    String output = outputStream.toString().trim().replaceAll("\\r\\n", "\n");   
	    System.setOut(System.out);   
	    assertEquals(student.courses, student.getCourses());	
	    assertEquals("Cannot view courses", output);	
	    
	}
}
