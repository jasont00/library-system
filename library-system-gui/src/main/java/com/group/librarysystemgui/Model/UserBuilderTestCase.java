package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserBuilderTestCase {

	private UserDirector director = new UserDirector();
	private UserBuilder builder = new basicUserBuilder();
	private UserBuilder builder2 = new StudentBuilder();
	private UserBuilder builder3 = new FacultyBuilder();
	
	@Test
	public void getUserTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		assertEquals(builder.user, builder.getUser());
		
		director.setUserBuilder(builder2);
		director.createUser();
		assertEquals(builder2.user, builder2.getUser());
		
		director.setUserBuilder(builder3);
		director.createUser();
		assertEquals(builder3.user, builder3.getUser());
	}
	
	@Test
	public void createNewUserTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		assertEquals("user",director.getUserBuilder().user.getType());
	}
	
	@Test
	public void createNewStudentTest() throws Exception {
		director.setUserBuilder(builder2);
		director.createUser();
		assertEquals("student",director.getUserBuilder().user.getType());
	}
	
	@Test
	public void createNewFacultyTest() throws Exception {
		director.setUserBuilder(builder3);
		director.createUser();
		assertEquals("faculty",director.getUserBuilder().user.getType());
	}
	
	@Test
	public void createNewUserTest2() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		assertEquals("usersEmail",director.getUserBuilder().user.getEmail());
	}
	
	@Test
	public void createNewStudentTest2() throws Exception {
		director.setUserBuilder(builder2);
		director.createUser();
		assertEquals("studentsEmail",director.getUserBuilder().user.getEmail());
	}
	
	@Test
	public void createNewFacultyTest2() throws Exception {
		director.setUserBuilder(builder3);
		director.createUser();
		assertEquals("facultyEmail",director.getUserBuilder().user.getEmail());
	}
	
	@Test
	public void createNewUserTest3() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		assertEquals("usersPassword",director.getUserBuilder().user.getPassword());
	}
	
	@Test
	public void createNewStudentTest3() throws Exception {
		director.setUserBuilder(builder2);
		director.createUser();
		assertEquals("studentsPassword",director.getUserBuilder().user.getPassword());
	}
	
	@Test
	public void createNewFacultyTest3() throws Exception {
		director.setUserBuilder(builder3);
		director.createUser();
		assertEquals("facultysPassword",director.getUserBuilder().user.getPassword());
	}
}
