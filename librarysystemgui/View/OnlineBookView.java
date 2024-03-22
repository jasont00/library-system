package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.TrackHandler;
import com.group.librarysystemgui.Model.Course;
import com.group.librarysystemgui.Model.Textbook;
import com.group.librarysystemgui.UserSession;
import com.group.librarysystemgui.View.components.Component;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Some issues on my Apple Sillion Chips
 */

public class OnlineBookView extends ContentView {
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();

        Label label = new Label("Keeping Tracking of Following Textbooks:");
        Label label2 = new Label("Virtual Copy of Books");

        List<Course> courses = TrackHandler.trackCourse(UserSession.getInstance().getLoggedInUser());
        ObservableList<Course> observableCourses = FXCollections.observableArrayList(courses);

        ListView<Course> coursesListView = new ListView<>(observableCourses);
        coursesListView.setCellFactory(listView -> new ListCell<>() {
            @Override
            protected void updateItem(Course course, boolean empty) {
                super.updateItem(course, empty);
                if (empty || course == null) {
                    setText(null);
                } else {
                    StringBuilder displayText = new StringBuilder(course.getName() + ": ");
                    for (Textbook textbook : course.getTextbooks()) {
                        displayText.append(textbook.getName());
                    }
                    setText(displayText.toString());
                }
            }
        });


        List<Textbook> items = TrackHandler.trackCourseTextBooks(UserSession.getInstance().getLoggedInUser());

        ObservableList<Textbook> rentals = FXCollections.observableArrayList(items);

        ListView<Textbook> listView4 = new ListView<>(rentals);
        listView4.setCellFactory(param -> new ListCell<>() {
            private final HBox content;
            private final Text name;
            private final Text price;
            private final Text publisher;
            private final Button openButton;
            private final Button cancelButton;


            {
                content = new HBox(15);
                name = new Text();
                price = new Text();
                publisher = new Text();
                openButton = new Button("OPEN");
                cancelButton = new Button("END CLASS");
                cancelButton.setOnAction(event ->{
                    Textbook currentItem = getItem();
                    Component.showAlert(Alert.AlertType.INFORMATION,"END CLASS","Your Virtual Copy Will be removed "+currentItem.getName());
                });

                openButton.setOnAction(event -> {
                    Textbook currentItem = getItem();
                    System.out.println("OPENING: " + currentItem.getName());
                    //TODO: not sure how to open the frame to display web information properly
                    String message = currentItem.open(); // 假设这会返回一个String类型的消息
                    showDialog(currentItem.getName(),message);
                });

                HBox.setHgrow(name, Priority.ALWAYS);
                content.getChildren().addAll(openButton,name,price,publisher,cancelButton);
            }

            @Override
            protected void updateItem(Textbook newsletter, boolean empty) {
                super.updateItem(newsletter, empty);

                if (newsletter == null || empty) {
                    setGraphic(null);
                } else {
                    name.setText(newsletter.getName());
                    price.setText(String.valueOf(newsletter.getPrice()));
                    publisher.setText(newsletter.getPublisher());
                    setGraphic(content);
                }
            }
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, coursesListView,label2,listView4);
        view.setCenter(vbox);
        return view;
    }

    private static void showDialog(String name, String message) {
        Stage stage = new Stage();

        stage.setTitle("Newsletter Content:"+name);

        Text text = new Text(message);
        text.setWrappingWidth(400); // 设置文本换行宽度

        ScrollPane scrollPane = new ScrollPane(text);
        scrollPane.setFitToWidth(true);

        Scene scene = new Scene(scrollPane, 450, 300);
        stage.setScene(scene);
        stage.show();
    }
}
