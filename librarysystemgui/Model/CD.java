package com.group.librarysystemgui.Model;

public class CD extends PhysicalItem{
    public CD(String name, double price, boolean rentable) {
        super(name,price,rentable);
        super.setType("cd");
    }
}
