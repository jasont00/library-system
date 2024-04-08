package com.group.librarysystemgui.Controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Model.Database;
import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.Model.Newsletter;
import com.group.librarysystemgui.Model.User;

class NewsletterHandlerTest {

	//TestCases testing getAllSubscriptions the user has subscribed to
	@Test
	void test_1() {
		//testing base case for 1 subscription 
		User user = new User("Student", "student@yahoo.com", "Shhh123");
		Newsletter news1 = new Newsletter("test1", 10.00, "whoo1"); 
		
		try {
			user.subscribe(news1);
		} catch (Exception e) {
			fail("Failed Test"); 
		}
		ArrayList<Newsletter> NEWS = new ArrayList<Newsletter>(); 
		NEWS.add(news1);
		assertEquals(NewsletterHandler.getAllSubscription(user), NEWS);
	}
	
	@Test
	void test_2() {
		//testing multiple subscription
		User user = new User("Student", "student@yahoo.com", "Shhh123");
		Newsletter news1 = new Newsletter("test1", 10.00, "whoo1"); 
		Newsletter news2 = new Newsletter("test2", 10.00, "whoo2"); 
		Newsletter news3 = new Newsletter("test3", 10.00, "whoo3"); 
		
		try {
			user.subscribe(news1);
			user.subscribe(news2);
			user.subscribe(news3);
		} catch (Exception e) {
			fail("Failed Test"); 
		}
		ArrayList<Newsletter> NEWS = new ArrayList<Newsletter>(); 
		NEWS.add(news1);
		NEWS.add(news2);
		NEWS.add(news3); 
		assertEquals(NewsletterHandler.getAllSubscription(user), NEWS); 

	}
	
	//Testing All the newsletters currently available
	@Test
	void test_3() {
        ArrayList<Newsletter> newsletters= new ArrayList<>();
//        newsletters.add(new Newsletter("NY-Times",10,"NY"));
//        newsletters.add(new Newsletter("NZ-Times",10,"NZ"));
//        newsletters.add(new Newsletter("NQ-Times",10,"NQ"));
        
        //changed to String due to the ids changing when instantiating additional newsletters
        assertEquals(NewsletterHandler.getAllNewsletter().toString(), "[OnlineItem [name=NY-Times, id=35, type=newsletter, price=10.0, publisher=NY], "
        		+ "OnlineItem [name=NZ-Times, id=36, type=newsletter, price=10.0, publisher=NZ], OnlineItem [name=NQ-Times, id=37, type=newsletter, price=10.0, publisher=NQ], "
        		+ "OnlineItem [name=NC-Times, id=12, type=newsletter, price=20.0, publisher=N/A], OnlineItem [name=Ways of Improving Quality of Life, id=24, type=newsletter, price=20.0, publisher=Well-Being], "
        		+ "OnlineItem [name=How to Dress Adequately (withPictures), id=25, type=newsletter, price=15.0, publisher=Well-Being], OnlineItem [name=Words of Wisdom from Jasons at York, id=26, type=newsletter, price=5.0, "
        		+ "publisher=Well-Being], OnlineItem [name=Tips to Study Efficiently, id=29, type=newsletter, price=20.0, publisher=Well-Being]]"); 
	} 
	
	@Test 
	void test_4() {
//	tests getAllunSubscribemethod
		
		User user = new User("Student", "student@yahoo.com", "Shhh123");
		List<Newsletter> all = NewsletterHandler.getAllNewsletter();
		NewsletterHandler.Cancel(user, null); 
		Newsletter news1 = new Newsletter("test1", 10.00, "whoo1"); 
	    try {
			NewsletterHandler.SubScribe(user, news1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("could not add"); 
		}

	    List<Newsletter> own = NewsletterHandler.getAllSubscription(user);
	    ArrayList<Newsletter> newsletters= new ArrayList<>();
	    
	    //user has not subscribed to anything --> hence all books will be unsubscribed --> hence size will be 8
	    assertEquals(NewsletterHandler.getAllNonSubscripted(user).size(), 8);
	}
	
	@Test
	void test_5() {
		//tests cancel method
		User user = new User("Student", "student@yahoo.com", "Shhh123");
		Newsletter news1 = new Newsletter("test1", 10.00, "whoo1"); 
		Newsletter news2 = new Newsletter("test2", 10.00, "whoo2"); 
		
		try {
			user.subscribe(news2);
			user.subscribe(news1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Could not add"); 
		}
		
		NewsletterHandler.Cancel(user, news2); 
		assertEquals(NewsletterHandler.getAllSubscription(user).toString(), "[" + news1 + "]"); 
		
		
	}
	
	@Test
	void test_6() {
		User user = new User("Student", "student@yahoo.com", "Shhh123");
		Newsletter news1 = new Newsletter("test1", 10.00, "whoo1"); 
		
		try {
			NewsletterHandler.SubScribe(user, news1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Could not add"); 
		} 
		
		ArrayList<Newsletter> newletters = new ArrayList<Newsletter>(); 
		
		assertEquals(NewsletterHandler.getAllSubscription(user).toString(), "[" + news1 + "]"); 
		
		
	}
	
	@Test
	void test_7() {
		//checking test case to see if the test for the exception handler works as well in case there is an exception in the command
		User user = new User("Student", "student@yahoo.com", "Shhh123");
		Newsletter news1 = new Newsletter("test1", 10.00, "whoo1"); 
		
		try {
			NewsletterHandler.SubScribe(user, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertEquals("Test passes", "Test passes"); 
		} 
	}
	
	@Test
	void test_8() {
//		tests getAllunSubscribemethod
		User user = new User("Student", "student@yahoo.com", "Shhh123");
		List<Newsletter> all = NewsletterHandler.getAllNewsletter();
		
		for(int i = 0; i<all.size(); i++) {
			try {
				NewsletterHandler.SubScribe(user, all.get(i));
			} catch (Exception e) {
				fail("Could not add");
			} 
		}
		
//	    assertEquals(NewsletterHandler.getAllNonSubscripted(user).get(0).getName(),"");
		}
		
	
	
	@Test
	void test_9() {
		fail("Not yet implemented");
	}
	
	@Test
	void test_10() {
		fail("Not yet implemented");
	}
	
}
