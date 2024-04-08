package com.group.librarysystemgui.Controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Model.Course;
import com.group.librarysystemgui.Model.User;
import com.group.librarysystemgui.Model.TextBookTracker;

class TrackHandlerTest {
	//the courses were added manually to the user
	@Test
	void test_1() {
		User user = new User("Student", "student123@mail.com", "Shh123"); 
		Course c = new Course("Math", "Math123"); 
		Course c2 = new Course("Science", "science123"); 
		user.addCourse(c);
		user.addCourse(c2);
		//user has one course
		List<Course> course = new ArrayList<Course>(); 
		course = TrackHandler.trackCourse(user); 
		
		assertEquals(course.size(), 2); 
	}
	
	@Test
	void test_2() {
		User user = new User("student", "student123@mail.com", "Shh123"); 
		Course c = new Course("Math", "Math123"); 
		Course c2 = new Course("Science", "science123"); 
		assertEquals(TrackHandler.trackCourseTextBooks(user).toString(), "[Physical Item [name=Textbook1, id=3, type=textbook, price=10.0], Physical Item [name=Textbook2, id=4, type=textbook, price=10.0]]"); 
	}
	
	@Test
	//empty since nothing is being added
	void test_3() {
		User user = new User("student", "student123@mail.com", "Shh123"); 
		TrackHandler.trackUserBookNotification(user); 	
		assertEquals(TrackHandler.trackUserBookNotification(user).toString() , "[]");	
	}
	
	
	void test_4() {
		User user = new User("student", "student123@mail.com", "Shh123"); 
		TrackHandler.trackUserBookNotification(user); 	
		Course c = new Course("Math", "Math123"); 
//		TextBookSubject subject = new TextBookSubject();
//		TextBookSubject subject = new TextBookSubject("name", 10.00); 
		
//		user.addCourse(c); 
		assertEquals(TrackHandler.trackUserBookNotification(user).toString() , "[]");	
	}
	

}
