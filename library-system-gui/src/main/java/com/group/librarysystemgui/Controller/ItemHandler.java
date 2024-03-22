package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.Database;
import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.Model.ItemFactory;

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
//        ArrayList<Item> items = new ArrayList<>();
        return Database.getDatabase().items;

//        try{
//            Item itemone = ItemFactory.getItem("textbook","Introduction to Java",10,"N/A",true);
//            items.add(itemone);
//        } catch (Exception e) {
//
//        }
//
//        try{
//            Item itemtwo = ItemFactory.getItem("magazine","Daily Fashion",10,"N/A",true);
//            items.add(itemtwo);
//        } catch (Exception e) {
//
//        }
//
//
//        try{
//            Item itemthree = ItemFactory.getItem("cd","taylor",10,"N/A",true);
//            items.add(itemthree);
//        } catch (Exception e) {
//
//        }
    }

    // TODO
    public static void addItem(String name, String type, String price, String location, String purchase) {
    }
}
