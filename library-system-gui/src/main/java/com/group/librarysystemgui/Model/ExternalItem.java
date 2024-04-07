package com.group.librarysystemgui.Model;

public class ExternalItem {

    double discount;
    double price;

    // constructor takes discount (0-1) and original price before discount
    // if the given discount is greater than 1, it automatically assigns discount as 1.
    public ExternalItem(double d, double p) {
        this.discount = 0<d && d<1 ? d : 0 ;
        price = p; 
    }
    public void setDiscount(double d) {
    	this.discount = 0<d && d<1 ? d : 0 ;
    }
 
    // returns discounted price
    public double getPrice() {
        return this.price - (this.price * this.discount); 
    }

}

