package librarysystem;

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
}

interface TextBookObserver{
    void update(TextBookSubject textBookSubject);
}
public class TextBookTracker {
    private List<TextBookSubject> textbooks;

    public void addTextbook(Textbook textbook){
        this.textbooks.add(new TextBookSubject(textbook));
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
