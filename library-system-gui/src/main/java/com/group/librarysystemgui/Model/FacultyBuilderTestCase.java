package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacultyBuilderTestCase {

	private UserDirector director = new UserDirector();
	private UserBuilder builder = new FacultyBuilder();
	private User faculty;
	
	@Test
	public void setTypeTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		faculty = director.getUser();	
		faculty.setType("student");
		assertEquals("student", faculty.getType());
	}
	
	@Test
	public void setEmailTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		faculty = director.getUser();	
		faculty.setEmail("hello@hotmail.com");
		assertEquals("hello@hotmail.com", faculty.getEmail());
	}
	
	@Test
	public void setPasswordTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		faculty = director.getUser();	
		faculty.setPassword("hello1234");
		assertEquals("hello1234", faculty.getPassword());
	}

	@Test
	public void typeTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		faculty = director.getUser();	
		assertEquals("faculty", faculty.getType());
	}
	
	@Test
	public void emailTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		faculty = director.getUser();	
		assertEquals("facultyEmail", faculty.getEmail());
	}
	
	@Test
	public void passwordTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		faculty = director.getUser();	
		assertEquals("facultysPassword", faculty.getPassword());
	}
	
	@Test
	public void rentTest() throws Exception {
		//When a new faculty object is created, its rentEligible should be true by default
		director.setUserBuilder(builder);
		director.createUser();
		faculty = director.getUser();	
		assertTrue(faculty.getRE());
	}

}
