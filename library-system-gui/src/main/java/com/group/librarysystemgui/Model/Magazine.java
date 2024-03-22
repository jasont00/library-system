package com.group.librarysystemgui.Model;

public class Magazine extends PhysicalItem{

    public Magazine(String name, double price, boolean rentable) {
        super(name,price,rentable);
        super.setType("magazine");
    }
}
