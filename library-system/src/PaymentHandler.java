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
		Double price = Double.valueOf(Database.getDatabase().search(name, "pay"));
		return price;
	}

	
}
