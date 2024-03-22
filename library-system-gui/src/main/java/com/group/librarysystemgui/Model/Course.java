package com.group.librarysystemgui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason
 */
public class Course {
    String name;
    String code;
    ArrayList<Textbook> textbooks;

    public Course(String n, String c) {
        name = n;
        code = c;
        textbooks = new ArrayList<Textbook>();
    }

    public Course(String n, ArrayList<Textbook> textbookList) {
        name = n;
        textbooks = textbookList;
        for(Textbook book:textbookList){
            TextBookTracker.getInstance().addTextbook(book);
        }
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void addTextbook(Textbook t) {
        textbooks.add(t);
    }

    public void printDetails() {
        System.out.println("Name: " + name + " Code: " + code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }
}

