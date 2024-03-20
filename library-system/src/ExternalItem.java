package library;

public class ExternalItem {
	
	double discount = 1;
	double price; 
	
	public void setDiscount(double discount) {
		this.discount = discount; 
	}
	public void setExternalitemPrice(double price) {
		this.price = price*this.discount; 
	}


}



/*
