package com.group.librarysystemgui.Model;

public class ItemFactory {
    public static Item getItem(String type, String name, double price, String publisher, boolean rentable) throws Exception {
        Item item ;
        if (type.equalsIgnoreCase("onlineitem")) {
            item = new OnlineItem(name,price,publisher);
        } else if (type.equalsIgnoreCase("physicalitem")) {
            if (PhysicalItemRepo.itemOccurrences.get(name) > 20) {	// if there's already 20 items with the same name, return void;
                System.out.println("There are already 20 copies of an item with the same name.");
                return null;
            }
            item = new PhysicalItem(name, price, rentable);
            PhysicalItemRepo.addItem((PhysicalItem) item);
        } else if(type.equalsIgnoreCase("cd")){
            if (PhysicalItemRepo.itemOccurrences.get(name) > 20) {	// if there's already 20 items with the same name, return void;
                System.out.println("There are already 20 copies of an item with the same name.");
                return null;
            }
            item = new CD(name, price, rentable);
            PhysicalItemRepo.addItem((PhysicalItem) item);
        } else if(type.equalsIgnoreCase("magazine")){
            if (PhysicalItemRepo.itemOccurrences.get(name) > 20) {	// if there's already 20 items with the same name, return void;
                System.out.println("There are already 20 copies of an item with the same name.");
                return null;
            }
            item = new Magazine(name, price, rentable);
            PhysicalItemRepo.addItem((PhysicalItem) item);
        } else if (type.equalsIgnoreCase("textbook")) {
            item = new Textbook(name, price, publisher);
        } else if (type.equalsIgnoreCase("newsletter")) {
            item = new Newsletter(name, price, publisher);
        } else {
            return null;
        }
        Database.getDatabase().loaditem(item);
        Database.getDatabase().updateitem();
        return item;
    }
}