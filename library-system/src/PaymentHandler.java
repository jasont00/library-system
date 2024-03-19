package librarysystem;

public class PaymentHandler extends Database{
	private static PaymentHandler instance;
	
	private PaymentHandler() {
	}
	
	public static PaymentHandler getPaymentHandler() {
		if(instance==null) {
			instance = new PaymentHandler();
		}
		return instance;
	}
	
	public double getPrice(String name) throws Exception {
		String path = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\user.csv";
		Double price = Double.valueOf(search(path, name, "pay"));
		return price;
	}
	
}
