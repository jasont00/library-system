package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.ItemHandler;
import com.group.librarysystemgui.Controller.RentRecordHandler;
import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.UserSession;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.List;

/**
 * Req.
 */
public class RentView extends ContentView {

    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();

        List<Item> items = ItemHandler.getAllItems();
        int countOfRent = RentRecordHandler.countOfRent(UserSession.getInstance().getLoggedInUser());
        int countofOverDue = RentRecordHandler.countOfOverDue(UserSession.getInstance().getLoggedInUser());

        Label label = new Label("  USER: "+ UserSession.getInstance().getUserEmail()
                + " | RENT: "+ countOfRent +" / 10  |   OVERDUE:"+ countofOverDue);


        ObservableList<Item> rentals = FXCollections.observableArrayList(items);

        ListView<Item> listView = new ListView<>(rentals);
        listView.setCellFactory(param -> new ListCell<>() {
            private final HBox content;
            private final Text name;
            private final Text type;
            private final Button rentButton;

            {
                content = new HBox(15);
                name = new Text();
                type = new Text();
                rentButton = new Button("RENT");
                rentButton.setOnAction(event -> {
                    Item currentItem = getItem();
                    System.out.println("Renting: " + currentItem.getName());
                    RentRecordHandler.rentItem(UserSession.getInstance().getLoggedInUser(), currentItem);

                });
                HBox.setHgrow(name, Priority.ALWAYS);
                content.getChildren().addAll(rentButton, type, name);
            }

            @Override
            protected void updateItem(Item item, boolean empty) {
                super.updateItem(item, empty);

                if (item == null || empty) {
                    setGraphic(null);
                } else {
                    name.setText(item.getName());
                    type.setText(item.getType());
                    setGraphic(content);
                }
            }
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, listView);

        view.setCenter(vbox);
        return view;
    }
}
