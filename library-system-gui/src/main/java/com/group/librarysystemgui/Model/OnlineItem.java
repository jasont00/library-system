package com.group.librarysystemgui.Model;

/**
 * @Author: Jason
 */
public class OnlineItem extends Item{
    String publisher;

    public OnlineItem(String name, String type, Double price, String publisher) {
        super(name, type, price);
        this.publisher = publisher;
    }

    public void open() {
        //TODO: empty method
    }

    public String getPublisher(){
        return publisher;
    }

}

