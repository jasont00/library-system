package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Req2: List all of items
 * @viewclass RentView
 *
 * Req7: Add item
 * @viewclass ItemManagementView
 */
public class ItemHandler {

    /**
     * TODO
     * From Req2: List all of items so that user can rent them.
     * @return list of items.
     */
    public static List<Item> getAllItems(){
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Introduction to Java","Book",10));
        items.add(new Item("Fashion","Magazine",10));
        items.add(new Item("Tayor","CD",10));
        return items;
    }

    // TODO
    public static void addItem(String name, String type, String price, String location, String purchase) {
    }
}