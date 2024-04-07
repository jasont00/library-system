package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.*;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Req5: A user can search for a book using the application.
 * For a book a user is searching,
 * the app should also show recommendations of similar other books (based on the text similarity of book titles).
 * @viewclass SearchView
 */
public class SearchHandler {
    //TODO
    public static List<Textbook> search(String key){
        ArrayList<Textbook> items = new ArrayList<>();
        try {
            for (Map.Entry<Integer,PhysicalItem> entry:PhysicalItemRepo.inventory.entrySet()) {
                if(entry.getValue().getName().equalsIgnoreCase(key)  && entry.getValue() != null && entry.getValue().getName() != null){
                    items.add((Textbook) entry.getValue());
                }
            }
        } catch (Exception e) {
            return new ArrayList<>();
        }
        return items;
    }

    //TODO
    public static List<Textbook> searchSimilarBooks(String key){
        //words that are less than 3-5 letters different than key is considered "similar"
        ArrayList<Textbook> similarItem = new ArrayList<>();
        for (Item i: Database.getDatabase().items) {
            if(i.getType().equals("textbook")){
                Textbook book = (Textbook) i;
                if(levenshteinDistance(key, i.getName()) <= 5) {
                    similarItem.add(book);
                }
            }
        }
        return similarItem;
    }

    private static int levenshteinDistance(String key, String word) {
        int[][]dist = new int[word.length()+1][word.length()+key.length()];

        for (int i =0; i<= key.length(); i++) {
            for(int j=0; j<=word.length(); j++) {
                if(i==0) {
                    dist[i][j] = j;
                }
                else if(j==0) {
                    dist[i][j] = i;
                }
                else {
                    dist[i][j] = key.charAt(i-1) == word.charAt(j-1) ? dist[i-1][j-1] :
                            1+ Math.min(dist[i-1][j-1], Math.min(dist[i-1][j],  dist[i][j-1]));
                }
            }
        }
        return dist[key.length()][word.length()];
    }
}
