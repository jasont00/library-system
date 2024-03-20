package com.group.librarysystemgui.Controller;

import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.Model.User;

import java.time.LocalDate;
import java.util.Map;

/**
 * For Req2 & Req.3
 * Req2: A user will lose his borrowing privileges if he has more than 3 items overdue.
 *
 * Req3: After login, the system should show a list of hardcover books
 * that a user is currently renting and the due date for returning the books.
 * It should also prompt warnings about any book that is not returned yet
 * and it is approaching (less than 24 hours until the due date) or past the due date.
 *
 * @viewclass RentView, ContentView
 */
public class RentRecordHandler {

    /**
     * TODO: query data from the database
     * From Req.3
     * show a list of hardcover books that a user is currently renting and the due date for returning the books.
     * @param user the current query user
     * @return map as list (key is book title,value is due date)
     */
    public static Map<String,String> listRentRecord(User user){
        Map<String, String> rentalsMap = Map.of(
                "Book 1", LocalDate.now().plusDays(5).toString(),
                "Book 2", LocalDate.now().minusDays(1).toString(),
                "Book 3", LocalDate.now().toString()
        );
        return rentalsMap;
    }

    /**
     * TODO
     * From Req.2
     * Count of overdue projects
     * @param user the current query user
     * @return count
     */
    public static int countOfOverDue(User user){
        return 1;
    }

    /**
     * TODO
     * From Req.2
     * Count of all rent size
     * @param user the current query user
     * @return count
     */
    public static int countOfRent(User user){
        return 5;
    }

    /**
     * TODO
     * From Req.2
     * User can rent item
     * @param user
     * @param item
     * @return
     */
    public static boolean rentItem(User user, Item item){
        return true;
    }

}
