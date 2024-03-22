package com.group.librarysystemgui;

import com.group.librarysystemgui.Model.User;

/**
 * Singleton For User login
 */
public class UserSession {
    private static UserSession instance;
    private User loggedInUser;

    private UserSession() {}

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public String getUserEmail() {
        return loggedInUser.getEmail();
    }

    public String getUserType() {
        return loggedInUser.getType();
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }
}
