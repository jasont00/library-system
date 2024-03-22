package com.group.librarysystemgui.Controller;


import com.group.librarysystemgui.Model.Database;
import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.Model.Newsletter;
import com.group.librarysystemgui.Model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * From Req.4
 * allow a user to subscribe and read apaid-for newsletter via its interface
 * This can be done by opening a frame within the system where the NY Times website can be loaded.
 * A user can decide at any time to cancel a newsletter subscription.
 */
public class NewsletterHandler {

    /**
     * TODO
     * List all users' subscripted newsletter
     * @param user
     * @return
     */
    public static List<Newsletter> getAllSubscription(User user){
        return user.listSubscription();
    }

    /**
     * TODO
     * List all kinds of newsletter in the library
     */
    public static List<Newsletter> getAllNewsletter(){
        ArrayList<Newsletter> newsletters= new ArrayList<>();
        newsletters.add(new Newsletter("NY-Times",10,"NY"));
        newsletters.add(new Newsletter("NZ-Times",10,"NZ"));
        newsletters.add(new Newsletter("NQ-Times",10,"NQ"));

        for(Item item:Database.getDatabase().items){
            if(item.getType().equals("newsletter")){
                newsletters.add((Newsletter) item);
            }
        }
        return newsletters;
    }

    /**
     * For the view to display, done already
     * @param user
     * @return
     */
    public static List<Newsletter> getAllNonSubscripted(User user){
        List<Newsletter> all = getAllNewsletter();
        List<Newsletter> own = getAllSubscription(user);
        ArrayList<Newsletter> nonSubscriptions= new ArrayList<>();
        for(Newsletter newsletter:all){
            if(!own.contains(newsletter)){
                nonSubscriptions.add(newsletter);
            }
        }
        return nonSubscriptions;
    }

    /**
     * TODO
     * @param user
     * @param newsletter
     * @return
     */
    public static boolean SubScribe(User user, Newsletter newsletter){
        user.subscribe(newsletter);
        return true;
    }

    /**
     * TODO
     * @param user
     * @param newsletter
     * @return
     */
    public static boolean Cancel(User user, Newsletter newsletter){
        user.cancel(newsletter);
        return true;
    }

}
