package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class basicUserBuilderTestCase {

	private UserDirector director = new UserDirector();
	private UserBuilder builder = new basicUserBuilder();
	private User user;
	
	@Test
	public void setTypeTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		user.setType("student");
		assertEquals("student", user.getType());
	}
	
	@Test
	public void setEmailTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		user.setEmail("hello@hotmail.com");
		assertEquals("hello@hotmail.com", user.getEmail());
	}
	
	@Test
	public void setPasswordTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		user.setPassword("hello1234");
		assertEquals("hello1234", user.getPassword());
	}

	@Test
	public void typeTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		assertEquals("user", user.getType());
	}
	
	@Test
	public void emailTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		assertEquals("usersEmail", user.getEmail());
	}
	
	@Test
	public void passwordTest() throws Exception {	
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		assertEquals("usersPassword", user.getPassword());
	}
	
	@Test
	public void rentTest() throws Exception {
		//When a new user object is created, its rentEligible should be true by default
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		assertTrue(user.getRE());
	}


}
