package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.ItemHandler;
import com.group.librarysystemgui.Controller.RentRecordHandler;
import com.group.librarysystemgui.Model.Item;
import com.group.librarysystemgui.UserSession;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

import java.util.List;

public class ItemManagementView extends ContentView{
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel, 0, 0);
        TextField nameInput = new TextField();
        nameInput.setPromptText("Name");
        GridPane.setConstraints(nameInput, 1, 0);

        Label typeLabel = new Label("Type:");
        GridPane.setConstraints(typeLabel, 0, 1);
        TextField typeInput = new TextField();
        typeInput.setPromptText("Type");
        GridPane.setConstraints(typeInput, 1, 1);

        Label priceLabel = new Label("Price:");
        GridPane.setConstraints(priceLabel, 0, 2);
        TextField priceInput = new TextField();
        priceInput.setPromptText("Price");
        GridPane.setConstraints(priceInput, 1, 2);

        Label locationLabel = new Label("Location:");
        GridPane.setConstraints(locationLabel, 0, 3);
        TextField locationInput = new TextField();
        locationInput.setPromptText("Location");
        GridPane.setConstraints(locationInput, 1, 3);

        Label purchaseLabel = new Label("Purchase:");
        GridPane.setConstraints(purchaseLabel, 0, 4);
        TextField purchaseInput = new TextField();
        purchaseInput.setPromptText("Purchase");
        GridPane.setConstraints(purchaseInput, 1, 4);

        Button addButton = new Button("Add");
        GridPane.setConstraints(addButton, 1, 5);
        addButton.setOnAction(e -> {
            ItemHandler.addItem(nameInput.getText(), typeInput.getText(),priceInput.getText(),locationInput.getText(),purchaseInput.getText());
            System.out.println("Item Added: " + nameInput.getText());
            nameInput.clear();
            typeInput.clear();
            priceInput.clear();
            locationInput.clear();
            purchaseInput.clear();
        });

        grid.getChildren().addAll(nameLabel, nameInput, typeLabel, typeInput,
                priceLabel, priceInput, locationLabel, locationInput,
                purchaseLabel, purchaseInput, addButton);


        List<Item> items = ItemHandler.getAllItems();

        ObservableList<Item> rentals = FXCollections.observableArrayList(items);

        ListView<Item> listView = new ListView<>(rentals);
        listView.setCellFactory(param -> new ListCell<>() {
            private final HBox content;
            private final Text name;
            private final Text type;
            private final Button enableButton;
            private final Button disableButton;

            {
                content = new HBox(15);
                name = new Text();
                type = new Text();
                enableButton = new Button("ENABLE");
                disableButton = new Button("DISABLE");

                enableButton.setOnAction(event -> {
                    Item currentItem = getItem();
                    currentItem.setRentable(true);
                });

                disableButton.setOnAction(event ->{
                    Item currentItem = getItem();
                    currentItem.setRentable(false);
                });

                HBox.setHgrow(name, Priority.ALWAYS);
                content.getChildren().addAll(enableButton,disableButton,type,name);
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
        vbox.getChildren().addAll(listView);
        view.setTop(grid);
        view.setCenter(vbox);
        return view;
    }
}
