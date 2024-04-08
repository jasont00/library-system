package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserDirectorTestCase {

	private UserDirector director = new UserDirector();
	private UserBuilder builder = new basicUserBuilder();
	private UserBuilder builder2 = new StudentBuilder();
	private UserBuilder builder3 = new FacultyBuilder();
	private User user;
	private User student;
	private User faculty;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		director.setUserBuilder(builder2);
		director.createUser();
		student = director.getUser();	
		
		director.setUserBuilder(builder3);
		director.createUser();
		faculty = director.getUser();	
	}
	
	@Test
	public void setBuilderTest() throws Exception {
		director.setUserBuilder(builder);
		assertEquals(director.getUserBuilder(), builder);
	}
	@Test
	public void createUserTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		user = director.getUser();	
		assertEquals(user.getType(), "user");
	}
	
	@Test
	public void setBuilder2Test() throws Exception {
		director.setUserBuilder(builder2);
		assertEquals(director.getUserBuilder(), builder2);
	}
	@Test
	public void createStudentTest() throws Exception {
		director.setUserBuilder(builder2);
		director.createUser();
		student = director.getUser();	
		assertEquals(student.getType(), "student");
	}
	
	@Test
	public void setBuilder3Test() throws Exception {
		director.setUserBuilder(builder3);
		assertEquals(director.getUserBuilder(), builder3);
	}
	@Test
	public void createFacultyTest() throws Exception {
		director.setUserBuilder(builder3);
		director.createUser();
		faculty = director.getUser();	
		assertEquals(faculty.getType(), "faculty");
	}
	
	@Test
	public void getUserTest() throws Exception {
		director.setUserBuilder(builder);
		director.createUser();
		assertEquals(director.userBuilder, director.getUserBuilder());
	}
	
	@Test
	public void getStudentTest() throws Exception {
		director.setUserBuilder(builder2);
		director.createUser();
		assertEquals(director.userBuilder, director.getUserBuilder());
	}
	
	@Test
	public void getFacultyTest() throws Exception {
		director.setUserBuilder(builder3);
		director.createUser();
		assertEquals(director.userBuilder, director.getUserBuilder());
	}
	
	@Test
	public void createTest() throws Exception {
		director.setUserBuilder(builder);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));	
	    director.createUser();
	    String output = outputStream.toString().trim().replaceAll("\\r\\n", "\n");   
	    System.setOut(System.out);   
	    assertEquals(student.courses, student.getCourses());	
	    assertEquals("Build complete", output);	
	}
	

}
