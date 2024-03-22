package com.group.librarysystemgui.Model;

public class ExternalItem {

    double discount;
    double price;

    // constructor takes discount (0-1) and original price before discount
    // if the given discount is greater than 1, it automatically assigns discount as 1.
    public ExternalItem(double d, double p) {
        this.discount = d<1 ? d : 1 ;
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

