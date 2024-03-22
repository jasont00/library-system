package com.group.librarysystemgui.Model;

public class Admin {

    public void enableItem(PhysicalItem item) {
        item.rentable = true;
    }

    public void disableItem(PhysicalItem item) {
        item.rentable = false;
    }
    public void createItem(String ctype, String name, String type, double price, String publisher, boolean rentable) throws Exception {
        ItemFactory factory = new ItemFactory();
        factory.getItem(ctype, name, price, publisher, rentable);
    }
    public void addUser(String type, String email, String password)throws Exception {
        User user = new User(type,email,password);
    }
}
