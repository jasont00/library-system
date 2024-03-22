package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.Database;
import com.group.librarysystemgui.Model.User;

/**
 * Req.1
 * For Register and Login Function
 *
 * @viewclass LibrarySystemGUI
 */
public class RegisterAndLoginController {

    //TODO
    public static boolean register(String type, String email, String password){
        // Any client should be able to register as a user of the system with a unique/valid email and strong password
        // (i.e., a combination of uppercase letters, lowercase letters, numbers, and symbols).
        if(!checkStrongPW(password)) return false;
        if(!verifyEmail(email)) return false;
        User user = new User(type,email,password);
        try {
            // Add the information to the user database.
            Database.getDatabase().addUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        // If a client registers as a student, a faculty member or a non-faculty staff,
        // her/his registration requires a further validation from the management teams.
        return true;
    }

    //TODO
    public static boolean login(String email,String password){
        //return true;
        // check the email and password from the database
        if(!verifyEmail(email)) {
        	System.out.println("sadsd");
        for(User user:Database.getDatabase().users){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                return true;
            }
        }
        }
        return false;
    }

    private static boolean checkStrongPW(String pw) {
        boolean hasupper=false;
        boolean hasnumber=false;
        if(pw.length()>=6) {
            for(int i=0;i<pw.length();i++) {
                if(Character.isUpperCase(pw.charAt(i))) {
                    hasupper=true;
                }
                else if(Character.isDigit(pw.charAt(i))) {
                    hasnumber=true;
                }
            }

        }
        return hasnumber && hasupper;
    }

    /**
     * Check whether the same account is in the database already.
     * @param email
     * @return
     */
    private static boolean verifyEmail(String email)  {
        if(email.contains("@")) {
            try {
        		//System.out.println(String.valueOf(Database.getDatabase().search(email,"email")));
            	if(Database.getDatabase().search(email,"email").equalsIgnoreCase("true")) {
    				return true;
    			}
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return false;
    }
}
