package com.group.librarysystemgui.Model;

/**
 * @Author Jason
 */
public class Textbook extends PhysicalItem{
    //ArrayList<Course> courses;

    public boolean available;
    public int edition;

    public Textbook (String name, double price) {
        super(name, price,true);
        this.edition = 1;
        super.type="textbook";
    }
    public Textbook (String name, double price,int edition) {
        super(name, price,true);
        this.edition = edition;
        super.type="textbook";
    }

    public void open() {
        System.out.println("(Display textbook contents here)");
    }

    public String getPublisher(){
        return "N/A";
    }
}
