package library;

public class ExternalItem {
	
	double discount;
	double price; 

	// constructor takes discount (0-1) and original price before discount
	public ExternalItem(double d, double p) {
		discount = d;
		price = p;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount; 
	}

	// returns discounted price
	public double getPrice() {
		return this.price * this.discount;
	}
}



/*
