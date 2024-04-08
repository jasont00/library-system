package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Controller.RegisterAndLoginController;

class DataBaseRegisterTest {

	//DATABASE Class
	@Test
	void Stocktest() throws Exception {
		Database data = Database.getDatabase();
		Assert.assertEquals(1,data.checkstock("Book1"),0);


	}
	@Test
	void Searchitemtest() throws Exception{
		Database data = Database.getDatabase();
		data.items.get(0).getId();
		Assert.assertEquals("Search result: User [name=Book1, id="+data.items.get(0).getId()+", type=textbook, price=10.0]",data.search("Book1","search"));

	}
	@Test
	void Searchitemfailtest() throws Exception{
		Database data = Database.getDatabase();
		data.items.get(0).getId();
		Assert.assertEquals("don't got it",data.search("scooby doo","search"));

	}
	@Test
	void Searchemailtest() throws Exception{
		Database data = Database.getDatabase();
		Assert.assertEquals("false",data.search("as@gmail.com","email"));

	}
	@Test
	void Searchpricetest() throws Exception{
		Database data = Database.getDatabase();
		Assert.assertEquals("10.0",data.search("Book1","pay"));
	}
	@Test
	void Searchpricefailtest() throws Exception{
		Database data = Database.getDatabase();
		Assert.assertEquals("don't got it",data.search("Jujutsu Kaisen","pay"));
	}

	@Test
	void Additemtest() throws Exception{
		Database data = Database.getDatabase();
		data.loaditem(ItemFactory.getItem("physicalitem", "naruto", 19.99, "me", false));
		Assert.assertEquals("19.99",data.search("naruto","pay"));
	}
	@Test
	void Addusertest() throws Exception{
		Database data = Database.getDatabase();
		User user = new User("student","zmail@gmail.com","Pass678");
		data.addUser(user);
		Assert.assertEquals(user,data.getUser("zmail@gmail.com"));
	}
	@Test
	void Addusertestii() throws Exception{
		Database data = Database.getDatabase();
		User user = new User("student","zmaail@gmail.com","Pass678");
		data.addUser(user);
		Assert.assertEquals(user,data.getUser("zmaail@gmail.com"));
	}
	@Test
	void Addusertestiii() throws Exception{
		Database data = Database.getDatabase();
		User user = new User("student","zmaaasdail@gmail.com","Pasadss678");
		Assert.assertNull(data.getUser("zmaaasdail@gmail.com"));
	}
	
	
	

}
