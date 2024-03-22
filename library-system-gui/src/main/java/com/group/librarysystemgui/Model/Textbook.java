package com.group.librarysystemgui.Model;

/**
 * @Author Jason
 */
public class Textbook extends OnlineItem{
    //ArrayList<Course> courses;

    public boolean available;
    public int edition;

    public Textbook (String name, double price, String publisher) {
        super(name, price, publisher);
        this.edition = 1;
    }
    public Textbook (String name, double price, String publisher,int edition) {
        super(name, price, publisher);
        this.edition = edition;
    }

    public void open() {
        System.out.println("(Display textbook contents here)");
    }
}
