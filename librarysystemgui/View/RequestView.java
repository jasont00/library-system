package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.RequestHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.util.Objects;

public class RequestView extends ContentView {

    @Override
    public BorderPane createView() {
        BorderPane root = new BorderPane();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        TextField bookNameField = new TextField();
        bookNameField.setPromptText("Enter book name");
        GridPane.setConstraints(bookNameField, 1, 0);

        ComboBox<String> bookTypeComboBox = new ComboBox<>();
        bookTypeComboBox.getItems().addAll("Textbook for Course Teaching", "Self-Improvement");
        bookTypeComboBox.setPromptText("Select book type");
        GridPane.setConstraints(bookTypeComboBox, 1, 1);

        Button submitButton = new Button("Submit Request");
        GridPane.setConstraints(submitButton, 1, 2);

        Label priorityNotificationLabel = new Label();
        GridPane.setConstraints(priorityNotificationLabel, 1, 3);

        submitButton.setOnAction(e -> {
            String selectedType = bookTypeComboBox.getValue();
            String priorityMessage = getPriorityMessage(selectedType);
            priorityNotificationLabel.setText(priorityMessage);
            RequestHandler.requestBook(bookNameField.getText(), Objects.equals(priorityMessage, "Your request has HIGH priority."));
        });

        gridPane.getChildren().addAll(bookNameField, bookTypeComboBox, submitButton, priorityNotificationLabel);
        root.setCenter(gridPane);
        return root;
    }

    private String getPriorityMessage(String bookType) {
        if (bookType == null) {
            return "Please select a book type.";
        }
        return switch (bookType) {
            case "Textbook for Course Teaching" -> "Your request has HIGH priority.";
            case "Self-Improvement" -> "Your request has NORMAL priority.";
            default -> "Unknown priority.";
        };
    }

}
