package com.group.librarysystemgui.Model;

/**
 * @Author Jason
 */
public class Textbook extends OnlineItem{
    //ArrayList<Course> courses;

    public boolean available;
    public int edition;

    public Textbook (String name, double price, String publisher) {
        super(name, "textbook", price, publisher);
        this.edition = 1;
    }
    public Textbook (String name, double price, String publisher,int edition) {
        super(name, "textbook", price, publisher);
        this.edition = edition;
    }
    public Textbook (String name, String type, double price, String publisher) {
        super(name, "textbook", price, publisher);
    }

    public void open() {
        //TODO: empty method
    }
}
