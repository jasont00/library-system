package librarysystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Databasetest {

	@Test
	void test() throws Exception {
		String path = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\item.csv";
		String path2 = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\user.csv";

		Database maintain = Database.getDatabase();
		PaymentHandler handle = PaymentHandler.getPaymentHandler();
		ItemFactory fact = new ItemFactory();
		//UserBuilder build = new UserBuilder(use);
		fact.getItem("gatsby", "onlineitem", 19.99, "me", false);
		fact.getItem("titanic", "physicalitem", 19.99, "me", false);
		//direc.setAbstractUser(abs);
		AbstractUser abs = new UserBuilder();
		AbstractUser abst = new UserBuilder();
		UserDirector direc = new UserDirector();
		UserDirector direce = new UserDirector();

		direc.setAbstractUser(abs);
		direc.createUser();
		User use = direc.getUser();
		use.setEmail("email@gmail.com");
		use.setPassword("pass");
		use.setType("Student");
		maintain.updateuser(path2);
		direce.setAbstractUser(abst);
		direce.createUser();
		User usee = direce.getUser();
		usee.setEmail("email@gmail.com");
		usee.setPassword("Pass66");
		usee.setType("Student");
		System.out.println(use.getPassword());


		for(Item u: maintain.items){ 
			System.out.println(u.toString());
		}
		for(User u: maintain.users){
			System.out.println(u.toString());
		}
		
		
		maintain.updateitem(path);
		maintain.updateuser(path2);

		System.out.println(maintain.search(path, "gatsby","search"));
		//Assert.assertEquals("Search result: User [name=gatsby, id=1, type=book, price=19.99]",maintain.search(path, "gatsby","search"));
		Assert.assertEquals(19.99,handle.getPrice("gatsby"),0);
		System.out.println(PaymentHandler.getPaymentHandler().getPrice("gatsby"));
		System.out.println(maintain.checkstock(path,"gatsby"));

	}

}

