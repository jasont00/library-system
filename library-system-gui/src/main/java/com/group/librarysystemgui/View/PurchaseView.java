package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.PaymentHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import org.w3c.dom.Text;

public class PurchaseView extends ContentView {

    @Override
    public BorderPane createView() {
        BorderPane root = new BorderPane();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label itemLabel = new Label("Item Name:");
        TextField itemname = new TextField();
        gridPane.add(itemLabel,0,0);
        gridPane.add(itemname,1,0);

        Label discountLabel = new Label("Discount【0-1】:");
        TextField discount = new TextField();

        gridPane.add(discountLabel,0,1);
        gridPane.add(discount,1,1);

        Label paymentLabel = new Label("Payment Option:");
        ComboBox<String> paymentComboBox = new ComboBox<>();
        paymentComboBox.getItems().addAll("Debit Card", "Credit Card", "Mobile Wallet");
        gridPane.add(paymentLabel, 0, 2);
        gridPane.add(paymentComboBox, 1, 2);

        Button submitButton = new Button("Submit Purchase");
        gridPane.add(submitButton, 1, 3);

        Label notificationLabel = new Label();
        Label resultLabel = new Label();
        VBox vbox = new VBox(10, gridPane, notificationLabel,resultLabel);
        root.setCenter(vbox);

        submitButton.setOnAction(e -> {
            if (itemname.getText() != null && paymentComboBox.getValue() != null) {
                notificationLabel.setText("Purchase submitted for " + itemname.getText()+
                        " using " + paymentComboBox.getValue() + "with discount of:"+discount.getText());
                try {
                    resultLabel.setText("Purchase Result Amount:" + PaymentHandler.getPrice(itemname.getText(),discount.getText()));
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                notificationLabel.setText("Please select an item and payment option.");
            }
        });
        return root;
    }
}
