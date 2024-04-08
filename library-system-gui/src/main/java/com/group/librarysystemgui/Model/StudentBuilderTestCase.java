package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StudentBuilderTestCase {

	private UserDirector director = new UserDirector();
	private UserBuilder builder = new StudentBuilder();
	private User student;
	
	@Test
	public void setTypeTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		student = director.getUser();	
		student.setType("user");
		assertEquals("user", student.getType());
	}
	
	@Test
	public void setEmailTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		student = director.getUser();	
		student.setEmail("hello@hotmail.com");
		assertEquals("hello@hotmail.com", student.getEmail());
	}
	
	@Test
	public void setPasswordTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		student = director.getUser();	
		student.setPassword("hello1234");
		assertEquals("hello1234", student.getPassword());
	}

	@Test
	public void typeTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		student = director.getUser();	
		assertEquals("student", student.getType());
	}
	
	@Test
	public void emailTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		student = director.getUser();	
		assertEquals("studentsEmail", student.getEmail());
	}
	
	@Test
	public void passwordTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		student = director.getUser();	
		assertEquals("studentsPassword", student.getPassword());
	}
	
	@Test
	public void rentTest() throws Exception {
		//When a new student object is created, its rentEligible should be true by default
		director.setUserBuilder(builder);
		director.createUser();
		student = director.getUser();	
		assertTrue(student.getRE());
	}

}
