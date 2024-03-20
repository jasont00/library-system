package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.TrackHandler;
import com.group.librarysystemgui.Model.Course;
import com.group.librarysystemgui.Model.Textbook;
import com.group.librarysystemgui.UserSession;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.util.Arrays;
import java.util.List;

public class TrackView extends ContentView {
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();

        Label label = new Label("Keeping Tracking of Following Textbooks:");
        Label label2 = new Label("Notifications of New Edition");

        List<Course> courses = Arrays.asList(
                new Course("Course 1", Arrays.asList(new Textbook("Textbook 1",10,"AAA")).toString()),
                new Course("Course 2", Arrays.asList(new Textbook("Textbook 2", 10,"AAA")).toString())
        );

        ObservableList<Course> observableCourses = FXCollections.observableArrayList(courses);

        ListView<Course> coursesListView = new ListView<>(observableCourses);
        coursesListView.setCellFactory(listView -> new ListCell<>() {
            @Override
            protected void updateItem(Course course, boolean empty) {
                super.updateItem(course, empty);
                if (empty || course == null) {
                    setText(null);
                } else {
                    String displayText = course.getName() + ": ";
                    for (String textbook : course.getTextbooks()) {
                        displayText += textbook;
                    }
                    setText(displayText);
                }
            }
        });

        List<String> notifications = TrackHandler.trackUserBookNotification(UserSession.getInstance().getLoggedInUser());
        ObservableList<String> listItems = FXCollections.observableArrayList(notifications);
        ListView<String> listview2 = new ListView<>(listItems);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, coursesListView,label2,listview2);
        view.setCenter(vbox);
        return view;
    }
}
