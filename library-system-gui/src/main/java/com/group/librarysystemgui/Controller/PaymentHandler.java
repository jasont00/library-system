package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.Database;

public class PaymentHandler {
    public static Double getPrice(String name, String discount) throws  Exception {
        double d = Double.parseDouble(discount);
        if(d<0 || d>1){
            d = 0;
        } 
        Double price = Double.valueOf(Database.getDatabase().search(name, "pay"));
        price = price - (price*d);
        return price;
    }
    }
}
