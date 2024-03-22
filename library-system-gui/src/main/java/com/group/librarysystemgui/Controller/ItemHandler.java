package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.*;

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
    public static List<PhysicalItem> getAlPhysicallItems(){
        return (List<PhysicalItem>) PhysicalItemRepo.inventory.values();
    }


    public static List<Item> getAllItems(){
        return Database.getDatabase().items;
    }


    // TODO
    public static void addItem(String name, String type, String price, String location, String purchase) {
        try {
            Item item = ItemFactory.saveItem(type,name, Double.parseDouble(price),"N/A",true);
            if(type.equals("textbook") && name.contains("%")){
                name = name.split("%")[0];
                TextBookTracker.getInstance().addTextbook((Textbook) item);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
