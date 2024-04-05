package com.group.librarysystemgui.Model;

import java.time.LocalDate;

/* Concrete class PhysicalItem extends Item and represents a physical item that is stored in the library.
 * Unique attribute rentable is a boolean that denotes whether or not the item is available or able to be rented. Admins are able to change this.
 * Zaki: added constructor for databse as well as a to string
 */
public class PhysicalItem extends Item{
    boolean rentable;
    boolean rented;
    LocalDate dueDate;
    long daysUntilDue;
    String owner;

    public PhysicalItem(String name, double price, boolean rentable) {
        super(name, "physicalitem", price);
        this.rentable = rentable;
    }

    public PhysicalItem() {
        super();
    }

    public boolean getRentable() {
        return rentable;
    }

    public void setRented(boolean b) {
        rented = b;
    }
    
    public boolean getRented() {
    	return rented;
    }

    public void setOwner(String email) {
    	this.owner = email;
    }
    public String getOwner() {
    	return owner;
    }
    @Override
    public String toString() {
        return "Physical Item [name=" + name + ", id=" + id + ", type=" + type + ", price=" + price + "]";
    }
}
