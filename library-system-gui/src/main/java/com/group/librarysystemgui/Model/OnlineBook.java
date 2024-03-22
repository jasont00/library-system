package com.group.librarysystemgui.Model;
public class OnlineBook extends OnlineItem{
    public boolean available;
    public int edition;

    public OnlineBook (String name, double price, String publisher) throws Exception{
        super(name,  price, publisher);
        super.setType("onlinebook");
    }
    public OnlineBook (String name, String type, double price, String publisher) throws Exception{
        super(name,  price, publisher);
        super.setType("onlinebook");
    }

    public void open() {
        // This method should display the textbook contents
        System.out.println("(Display textbook contents here)");
    }
}
