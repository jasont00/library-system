package com.group.librarysystemgui.Model;


/* Abstract class describing an Item object. It defines several attributes which are inherited by all subclasses of Item.
 *
 *Zaki: added getters and setters as well as an empty constructor which is needed for the database class
 */
public class Item {
    static int IDS = 0;
    int id = 0;
    String name;
    String type;
    double price;

    // Req.7
    boolean availableToRent;
    String locationinLibiary;
    String placetoPurchase;

    public Item(String name, String type, double price) {
        id = ++IDS;
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public Item(String name, String type, double price,String locaton,String purchase) {
        this(name,type,price);
        this.locationinLibiary = locaton;
        this.placetoPurchase = purchase;
    }
    public Item() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getAvailableToRent(){
        return availableToRent;
    }
    public void setAvailableToRent(Boolean availableToRent){
        this.availableToRent = availableToRent;
    }
}