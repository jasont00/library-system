package com.group.librarysystemgui.Model;


import com.group.librarysystemgui.UserSession;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

class TextBookSubject{
    List<TextBookObserver> textBookObserver;
    Textbook textbook;
    public TextBookSubject(Textbook textbook) {
        this.textbook = textbook;
        this.textBookObserver = new ArrayList<>();
    }
    public void attach(TextBookObserver textBookObserver){
        this.textBookObserver.add(textBookObserver);
    }
    public void detach(TextBookObserver textBookObserver){
        this.textBookObserver.remove(textBookObserver);
    }
    public void notifyObservers(){
        for(TextBookObserver tb:this.textBookObserver){
            tb.update(this);
        }
    }

    public List<TextBookObserver> getTextBookObserver() {
        return textBookObserver;
    }

    public void setTextBookObserver(List<TextBookObserver> textBookObserver) {
        this.textBookObserver = textBookObserver;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }
}

interface TextBookObserver{
    void update(TextBookSubject textBookSubject);
}

// Singleton
public class TextBookTracker {

    private static TextBookTracker instance;

    private TextBookTracker() {}
    private List<TextBookSubject> textbooks;


    public static TextBookTracker getInstance() {
        if (instance == null) {
            instance = new TextBookTracker();
        }
        return instance;
    }

    /**
     * add the textbook to the tracker
     * and check the existing textbook
     * and query the user(faculty) that need to observer in this book
     * @param textbook
     */
    public void addTextbook(Textbook textbook){
        TextBookSubject newSubject = new TextBookSubject(textbook);
        // check the existing textbook whether to notify
        for(TextBookSubject subject:this.textbooks){
            if(subject.textbook.name.equals(textbook.name)){
                subject.notifyObservers();
                newSubject.setTextBookObserver(subject.textBookObserver);
            }
        }
        this.textbooks.add(newSubject);
    }

    public void updateTextBookAvailability(int textbookId,boolean available){
        for(TextBookSubject textBookSubject:textbooks){
            if(textBookSubject.textbook.id == textbookId){
                textBookSubject.textbook.available = available;
                return;
            }
        }
    }

    public void notifyObservers(){
        for(TextBookSubject tb:this.textbooks){
            tb.notifyObservers();
        }
    }
}
