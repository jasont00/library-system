package com.group.librarysystemgui.Model;

/**
 * @Author: Jason
 */

/* Concrete class OnlineItem extends the Item class and represents a digital item stored in the system.
 */
public class OnlineItem extends Item{
    String publisher;

    public OnlineItem(String name, Double price, String publisher) {
        super(name, "onlineitem", price);
        this.publisher = publisher;
    }

    public void open() {
        // This method should display the book contents
        System.out.println("(Display book contents here)");
    }

    public String getPublisher() {
        return publisher;
    }
    @Override
    public String toString() {
        return "OnlineItem [name=" + name + ", id=" + id + ", type=" + type + ", price=" + price +", publisher="+publisher+ "]";
    }
}


