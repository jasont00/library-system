package com.group.librarysystemgui.Controller;

/**
 * Req.1
 * For Register and Login Function
 *
 * @viewclass LibrarySystemGUI
 */
public class RegisterAndLoginController {


    //TODO
    public boolean register(String type, String email, String password){
        // Any client should be able to register as a user of the system with a unique/valid email and strong password
        // (i.e., a combination of uppercase letters, lowercase letters, numbers, and symbols).

        // If a client registers as a student, a faculty member or a non- faculty staff,
        // her/his registration requires a further validation from the management teams.


        // Add the information to the user database.
        return true;
    }

    //TODO
    public boolean login(String email,String password){
        // check the email and password from the database
        return true;
    }
}
