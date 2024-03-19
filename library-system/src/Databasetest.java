package librarysystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Databasetest {

	@Test
	void test() throws Exception {
		String path = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\user.csv";
		Database maintain = new Database();
		PaymentHandler handle = PaymentHandler.getPaymentHandler();
		maintain.load(path);
		for(Item u: maintain.items){
			System.out.println(u.toString());
		}
		
		Item newUser = new PhysicalItem("gatsby", "book",19.99,false);
		maintain.items.add(newUser);
		
		maintain.update(path);
		System.out.println(maintain.search(path, "gatsby","search"));
		Assert.assertEquals("Search result: User [name=gatsby, id=1, type=book, price=19.99]",maintain.search(path, "gatsby","search"));
		Assert.assertEquals(19.99,handle.getPrice("gatsby"),0);
		System.out.println(handle.getPrice("gatsby"));
		System.out.println(handle.checkstock(path,"gatsby"));

	}

}
