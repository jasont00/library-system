package librarysystem;

import javax.xml.soap.Text;
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

//TODO: This is not completely done because it should be part of the Faculty Class, not here.
// Consider other member's implement of Faculty and revise it
class Faculty implements TextBookObserver {

    @Override
    public void update(TextBookSubject textBookSubject) {
        // courses the user is teaching and the textbooks the user has previously used.
        // a new edition is available
        if(textBookSubject.textbook.available){
            receiveNotification(textBookSubject.textbook);
        }
    }

    private void receiveNotification(Textbook textbook){
        // The app then offers notifications to the user when a new edition of the textbook is available.
        System.out.println(textbook.name + "has new edition being available");
    }
}


class LibraryTeam implements TextBookObserver{

    @Override
    public void update(TextBookSubject textBookSubject) {
        //  If a textbook is not available, the app should notify the library management team of this,
        if(!textBookSubject.textbook.available){
            requestBookPurchase(textBookSubject.textbook);
        }
    }

    public void requestBookPurchase(Textbook textbook){
        // consult with the user to procure the book.
    }
}
