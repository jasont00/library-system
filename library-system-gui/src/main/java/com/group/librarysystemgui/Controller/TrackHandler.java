package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.Textbook;
import com.group.librarysystemgui.Model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Req6:
 * Req6: If a user is a faculty, the app can keep track of the courses the user is teaching and the textbooks the user has previously used.
 * The app then offers notifications to the user when a new edition of the textbook is available.
 * If a textbook is not available, the app should notify the library management team of this,
 * so that they could consult with the user to procure the book.
 */
public class TrackHandler {

    /**
     * TODO:
     * list all of the textbooks that the  courses the user is teaching
     * and the textbooks the user has previously used.
     * @param user
     * @return
     */
    public List<Textbook> trackCourseTextBooks(User user){
        return new ArrayList<>();

    }



}
