package com.group.librarysystemgui.View;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class PurchaseView extends ContentView {

    @Override
    public BorderPane createView() {
        BorderPane root = new BorderPane();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label itemLabel = new Label("Select Item:");
        ComboBox<String> itemComboBox = new ComboBox<>();
        itemComboBox.getItems().addAll("Book 1 - Publisher A", "Book 2 - Publisher B", "DVD 1 - Publisher C");
        gridPane.add(itemLabel, 0, 0);
        gridPane.add(itemComboBox, 1, 0);

        Label paymentLabel = new Label("Payment Option:");
        ComboBox<String> paymentComboBox = new ComboBox<>();
        paymentComboBox.getItems().addAll("Debit Card", "Credit Card", "Mobile Wallet");
        gridPane.add(paymentLabel, 0, 1);
        gridPane.add(paymentComboBox, 1, 1);

        Button submitButton = new Button("Submit Purchase");
        gridPane.add(submitButton, 1, 2);

        Label notificationLabel = new Label();
        VBox vbox = new VBox(10, gridPane, notificationLabel);
        root.setCenter(vbox);

        submitButton.setOnAction(e -> {
            if (itemComboBox.getValue() != null && paymentComboBox.getValue() != null) {
                notificationLabel.setText("Purchase submitted for " + itemComboBox.getValue() +
                        " using " + paymentComboBox.getValue());
            } else {
                notificationLabel.setText("Please select an item and payment option.");
            }
        });
        return root;
    }
}
