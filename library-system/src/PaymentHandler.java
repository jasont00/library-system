package librarysystem;

public class PaymentHandler{
	private static PaymentHandler instance;
	public PaymentHandler(String s) {
		super();
	}
	private PaymentHandler() {
	}
	
	public static PaymentHandler getPaymentHandler() {
		if(instance==null) {
			instance = new PaymentHandler();
		}
		return instance;
	}
	
	public double getPrice(String name) throws  Exception {
		String path = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\item.csv";
		Double price = Double.valueOf(Database.getDatabase().search(path, name, "pay"));
		return price;
	}
	
	
	
	
}
