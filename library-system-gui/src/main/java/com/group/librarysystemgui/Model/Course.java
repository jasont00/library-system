package com.group.librarysystemgui.Model;

import java.util.ArrayList;

/**
 * @Author Jason
 */
public class Course {
    String name;
    String code;
    ArrayList<String> textbooks;

    public Course(String n, String c) {
        name = n;
        code = c;

        textbooks = new ArrayList<String>();
    }

    public ArrayList<String> getTextbooks() {
        return textbooks;
    }

    public String getName(){
        return this.name;
    }

}
