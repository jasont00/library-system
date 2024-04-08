package com.group.librarysystemgui.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RequestHandlerTestCase {

	@Test
	void requestBookTest1() throws Exception{
		RequestHandler.requestBook("math", true);
		RequestHandler.requestBook("science", false);     
	}
	
	@Test
	void requestBookTest2() throws Exception{
		RequestHandler.requestBook("physics", true);
		RequestHandler.requestBook("english", false);     
	}
	@Test
	void requestBookTest3() throws Exception{
		RequestHandler.requestBook("science", true);
		RequestHandler.requestBook("art", false);     
	}
	@Test
	void requestBookTest4() throws Exception {
		RequestHandler.requestBook("photography", true);
		RequestHandler.requestBook("anthropology", false);     
	}
	
	@Test
	void requestBookTest5() throws Exception{
		RequestHandler.requestBook("calculus", true);
		RequestHandler.requestBook("chemistry", false);     
	}
	
	@Test
	void requestBookTest6() throws Exception{
		RequestHandler.requestBook("calculus", true);
		RequestHandler.requestBook("chemistry", false);     
	}
	
	@Test
	void requestBookTest7() throws Exception{
		RequestHandler.requestBook("advancedFunctions", true);
		RequestHandler.requestBook("economy", false);     
	}
	
	@Test
	void requestBookTest8() throws Exception{
		RequestHandler.requestBook("geography", true);
		RequestHandler.requestBook("dance", false);     
	}
	
	@Test
	void requestBookTest9() throws Exception{
		RequestHandler.requestBook("algebra", true);
		RequestHandler.requestBook("music", false);     
	}
	
	@Test
	void requestBookTest10() throws Exception{
		RequestHandler.requestBook("health", true);
		RequestHandler.requestBook("history", false);     
	}
}
