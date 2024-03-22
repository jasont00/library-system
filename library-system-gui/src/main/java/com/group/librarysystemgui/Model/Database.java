package com.group.librarysystemgui.Model;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Database {
    public ArrayList<Item> items = new ArrayList<Item>();
    public ArrayList<User> users = new ArrayList<User>();
    public static int IDS =0;
    public String itemDataPath = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\item.csv";
    public String userDataPath = "D:\\YORK\\EECS 3311\\CSV_Example (1)\\CSV_Example\\user.csv";

    private static Database instance;

    //contructors for the singleton pattern
    private Database() {
    }

    public static Database getDatabase() {
        if(instance==null) {
            instance = new Database();
            instance.loadItemData();
            instance.loadUserData();
        }
        return instance;
    }

    public void loadItemData(){
        CsvReader reader = null;
        try {
            reader = new CsvReader(itemDataPath);
            reader.readHeaders();
        } catch (IOException e) {
            return;
        }

        while(true){
            try {
                if (!reader.readRecord()) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                Item item = ItemFactory.getItem(reader.get("type"),reader.get("name"),Double.parseDouble(reader.get("price")),reader.get("publisher"),Boolean.parseBoolean(reader.get("rentable")));
                instance.items.add(item);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void loadUserData(){
        CsvReader reader = null;
        try {
            reader = new CsvReader(userDataPath);
            reader.readHeaders();
        } catch (IOException e) {
            return;
        }

        while(true){
            try {
                if (!reader.readRecord()) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                User user = new User(reader.get("type"),reader.get("email"),reader.get("password"));
                user.setRentEligible(Boolean.parseBoolean(reader.get("rent eligible")));
                instance.users.add(user);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    //adding an item to the arraylist
    public void loaditem(Item item){
        item.setId(++IDS);
        items.add(item);

    }
    //adding an user to the arraylist
    public void addUser(User user) throws Exception {
        users.add(user);
        updateuser();
    }

    //Searching within the database
    //either for just searching or for getting the price of an item
    public String search(String book,String func) throws Exception{
        CsvReader reader = new CsvReader(itemDataPath);
        CsvReader reader2 = new CsvReader(userDataPath);
        String result = " ";
        reader.readHeaders();
        reader2.readHeaders();

        //reading through the file and creating a string message of the info of the book
        if(func.equalsIgnoreCase("search")) {
            while(reader.readRecord()){
                if(reader.get("name").equalsIgnoreCase(book)) {
                    result = "Search result: User [name=" + reader.get("name") + ", id=" + Integer.valueOf(reader.get("id")) + ", type=" + reader.get("type") + ", price=" + Double.valueOf(reader.get("price"))+"]";
                    return result;
                }
            }
        }
        //getting the price of the book and searching for it using it's name
        else if(func.equalsIgnoreCase("pay")) {
            while(reader.readRecord()){
                if(reader.get("name").equalsIgnoreCase(book)) {
                    result = (reader.get("price"));
                    return result;
                }
            }
        }
        //finding if an email is already in the database
        else if(func.equalsIgnoreCase("email")) {
            while(reader2.readRecord()){
                if(reader2.get("email").equalsIgnoreCase(book)) {
                    result="false";
                    return result;
                }
            }
            return "true";
        }

        return "don't got it";
    }

 

    public void updateitem() throws Exception{
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(itemDataPath, false), ',');
            //this writes the headers into the file (name,id,email,password)
            csvOutput.write("name");
            csvOutput.write("id");
            csvOutput.write("type");
            csvOutput.write("price");
            csvOutput.write("publisher");
            csvOutput.write("rentable");

            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            //going through the arraylist and writing the info to the file
            for(Item u: items){
                if(u.getClass().equals(OnlineItem.class) || u.getClass().equals(Newsletter.class)|| u.getClass().equals(Textbook.class)) {
                    csvOutput.write(u.getName());
                    csvOutput.write(String.valueOf(u.getId()));
                    csvOutput.write(u.getType());
                    csvOutput.write(String.valueOf(u.getPrice()));
//                    csvOutput.write((u.getPublisher()));
                    csvOutput.write("N/A");
                    csvOutput.endRecord();
                }
                else if(u.getClass().equals(PhysicalItem.class)) {
                    csvOutput.write(u.getName());
                    csvOutput.write(String.valueOf(u.getId()));
                    csvOutput.write(u.getType());
                    csvOutput.write(String.valueOf(u.getPrice()));
                    csvOutput.write("N/A");
                    csvOutput.write(String.valueOf(u.getRentable()));
                    csvOutput.endRecord();
                }

            }
            csvOutput.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    ///basically the same thing as the updateitem one
    public void updateuser() throws Exception{
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(userDataPath, false), ',');
            //name,id,email,password
            csvOutput.write("type");
            csvOutput.write("email");
            csvOutput.write("password");
            csvOutput.write("rent eligible");

            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            for(User u: users){
                csvOutput.write(u.getType());
                csvOutput.write(u.getEmail());
                csvOutput.write(u.getPassword());
                csvOutput.write(String.valueOf(u.getRE()));
                csvOutput.endRecord();
            }
            csvOutput.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    //searches the csv for occurances of a book and sends back the amount of them
    public int checkstock(String name) throws IOException {
        CsvReader reader = new CsvReader(itemDataPath);
        int result=0;
        reader.readHeaders();

        while(reader.readRecord()){
            if(reader.get("name").equalsIgnoreCase("gatsby")) {
                result++;
            }
        }
        return result;
    }

}
