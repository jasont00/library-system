package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.Textbook;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Req5: A user can search for a book using the application.
 * For a book a user is searching,
 * the app should also show recommendations of similar other books (based on the text similarity of book titles).
 * @viewclass SearchView
 */
public class SearchHandler {
    //TODO
    public static List<Textbook> search(String input){
        return new ArrayList<>();
    }

    //TODO
    public static List<Textbook> searchSimilarBooks(String input){
        ArrayList<Textbook> books = new ArrayList<>();
        books.add(new Textbook("Book1",10,"Publisher1"));
        return books;
    }
}
