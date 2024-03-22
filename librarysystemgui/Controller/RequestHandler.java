package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.ItemFactory;

public class RequestHandler {

    public static void requestBook(String bookname,boolean highPriority){
        if(highPriority){
            try {
                ItemFactory.saveItem("textbook",bookname,0.0,"N/A",false);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
