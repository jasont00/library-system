package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.RentRecordHandler;
import com.group.librarysystemgui.UserSession;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Req.3
 * After login, the system should show a list of hardcover books
 * that a user is currently renting and the due date for returning the books.
 * It should also prompt warnings about any book that is not returned yet
 * and it is approaching (less than 24 hours until the due date) or past the due date.
 *
 * TODO: add the penalty
 */
public class  ContentView {
    public BorderPane createView() {
        BorderPane view = new BorderPane();
        Label label = new Label(" Welcome! " + UserSession.getInstance().getUserEmail() + ". Here are your rent records:");

        int countOfRent = RentRecordHandler.countOfRent(UserSession.getInstance().getLoggedInUser());
        int countofOverDue = RentRecordHandler.countOfOverDue(UserSession.getInstance().getLoggedInUser());
        int countofLost = RentRecordHandler.countOfOverLost(UserSession.getInstance().getLoggedInUser());
        boolean privileges = UserSession.getInstance().getLoggedInUser().checkPrivileges();

        Label labeltop = new Label( "RENT: "+ countOfRent +" / 10  |   OVERDUE:"+ countofOverDue +" | LOST:"+countofLost + " | PRIVILEGES:"+privileges);


        Map<String,String> rentalsMap = RentRecordHandler.listRentRecord(UserSession.getInstance().getLoggedInUser());
        
        ObservableList<Map.Entry<String, String>> rentals = FXCollections.observableArrayList(rentalsMap.entrySet());

        ListView<Map.Entry<String, String>> listView = new ListView<>(rentals);

        listView.setCellFactory(new Callback<>() {
            @Override
            public TextFieldListCell<Map.Entry<String, String>> call(ListView<Map.Entry<String, String>> param) {
                return new TextFieldListCell<>() {
                    private final DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;

                    @Override
                    public void updateItem(Map.Entry<String, String> item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                            LocalDate dueDate = LocalDate.parse(item.getValue(), dtf);
                            long daysUntilDue = LocalDate.now().until(dueDate).getMonths()* 30L;
                            daysUntilDue += LocalDate.now().until(dueDate).getDays();
                            String text = item.getKey() + " - Due: " + item.getValue();
                            if (daysUntilDue < 0) {
                                setStyle("-fx-text-fill: red;"); // Overdue -Red
                                text += " (Overdue!)";

                                double penalty =  daysUntilDue*-0.5;
                                text += " [Penalty $]" +penalty;
                            } else if (daysUntilDue <= 1) {
                                setStyle("-fx-text-fill: orange;"); // Approaching -Orange
                                text += " (Due soon!)";
                            } else {
                                setStyle(""); // Reset Style
                            }
                            setText(text);
                        } else {
                            setText(null);
                            setStyle("");
                        }
                    }
                };
            }
        });


        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, labeltop,listView);

        view.setCenter(vbox);
        return view;
    }




}
