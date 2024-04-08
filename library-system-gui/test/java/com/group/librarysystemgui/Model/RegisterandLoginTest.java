package com.group.librarysystemgui.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.group.librarysystemgui.Controller.RegisterAndLoginController;

class RegisterandLoginTest {

	//REGISTRATION CONTROLLER
	
		@Test
		void RegisterTestI() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(false,r.register("Student", "email@gmail.com", "Pass11"));
		}
		
		@Test
		void RegisterTestII() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(true,r.register("Student", "theemail@gmail.com", "Pass11"));
		}
		@Test
		void RegisterTestIII() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(false,r.register("Student", "theemail@gmail.com", "Pass"));
		}
		
		@Test
		void LoginTestI() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(true,r.login("theemail@gmail.com", "Pass11"));
		}
		@Test
		void LoginTestII() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(false,r.login("theeeeeeeeeeeemail@gmail.com", "Pass11"));
		}
		@Test
		void LoginTestIII() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(false,r.login("theemail@gmail.com", "Pass"));
		}
		
		@Test
		void VerifyTestI() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(false,r.verifyEmail("theemail@gmail.com"));
		}
		@Test
		void VerifyTestII() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(true,r.verifyEmail("theasdemail@gmail.com"));
		}
		
		@Test
		void PWTestI() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(false,r.checkStrongPW("theemail@gmail.com"));
		}
		@Test
		void PWTestII() throws Exception{
			Database data = Database.getDatabase();
			RegisterAndLoginController r = new RegisterAndLoginController();
			Assert.assertEquals(true,r.checkStrongPW("PAss123"));
		}

}
