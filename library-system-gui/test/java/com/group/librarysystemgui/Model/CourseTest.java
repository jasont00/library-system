package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CourseTest {

	@Test
	void CreateCourseTest() {
		Course c = new Course("Software Design", "EECS3311");
		assertEquals("Software Design", c.getName());
	}
	
	@Test
	void CourseTextbookListTest() {
		ArrayList<Textbook> txtbooks = new ArrayList<Textbook>();
		Textbook txtbook = new Textbook("Design Patterns", 19.99);
		txtbooks.add(txtbook);
		Course c = new Course("Software Design", txtbooks);
		
		assertEquals("Design Patterns", c.getTextbooks().get(0).getName());
	}

	@Test
	void CourseGetTextbookTest() {
		ArrayList<Textbook> txtbooks = new ArrayList<Textbook>();
		Course c = new Course("Software Design", txtbooks);
		
		assertEquals(txtbooks, c.getTextbooks());
	}
	
	@Test
	void CourseGetTextbookEmptyTest() {
		Course c = new Course("Software Design", "EECS3311");
		
		assertEquals(0, c.getTextbooks().size());
	}
	
	@Test
	void CourseAddTextbookTest() {
		ArrayList<Textbook> txtbooks = new ArrayList<Textbook>();
		Textbook txtbook = new Textbook("Design Patterns", 19.99);
		txtbooks.add(txtbook);
		Course c = new Course("Software Design", txtbooks);
		
		c.addTextbook(txtbook);
		
		assertEquals(txtbook, c.getTextbooks().get(0));
	}

	@Test
	void CoursePrintDetailsTest() {
		Course c = new Course("Software Design", "EECS3311");
		
		assertEquals("Name: Software Design Code: EECS3311", c.printDetails());
	}
	
	@Test
	void CourseSetNameTest() {
		Course c = new Course("Algorithms", "EECS3311");
		c.setName("Software Design");
		
		assertEquals("Software Design", c.getName());
	}
	
	@Test
	void CourseSetCodeTest() {
		Course c = new Course("Software Design", "EECS3101");
		c.setCode("EECS3311");
		
		assertEquals("EECS3311", c.getCode());
	}
	
	@Test
	void CourseSetTextbooksTest() {
		Course c = new Course("Software Design", "EECS3101");
		ArrayList<Textbook> txtbooks = new ArrayList<Textbook>();
		Textbook txtbook = new Textbook("Design Patterns", 19.99);
		txtbooks.add(txtbook);
		
		c.setTextbooks(txtbooks);
		assertEquals(txtbooks, c.getTextbooks());
	}
	
	@Test
	void CourseSetTextbooksNullTest() {
		Course c = new Course("Software Design", "EECS3101");
		ArrayList<Textbook> txtbooks = null;
		
		c.setTextbooks(txtbooks);
		assertEquals(null, c.getTextbooks());
	}
}
