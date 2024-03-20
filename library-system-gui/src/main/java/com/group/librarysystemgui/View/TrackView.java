package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Model.Course;
import com.group.librarysystemgui.Model.Textbook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import java.util.Arrays;
import java.util.List;

public class TrackView extends ContentView {
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();

        // 假设的课程和教材数据
        List<Course> courses = Arrays.asList(
                new Course("Course 1", Arrays.asList(new Textbook("Textbook 1",10,"AAA")).toString()),
                new Course("Course 2", Arrays.asList(new Textbook("Textbook 2", 10,"AAA")).toString())
        );

        // 将课程信息转换为可观察列表，用于显示
        ObservableList<Course> observableCourses = FXCollections.observableArrayList(courses);

        ListView<Course> coursesListView = new ListView<>(observableCourses);
        coursesListView.setCellFactory(listView -> new ListCell<>() {
            @Override
            protected void updateItem(Course course, boolean empty) {
                super.updateItem(course, empty);
                if (empty || course == null) {
                    setText(null);
                } else {
                    // 简化显示课程名和使用的教材
                    String displayText = course.getName() + ": ";
                    for (String textbook : course.getTextbooks()) {
                        displayText += textbook;
                    }
                    setText(displayText);
                }
            }
        });

        view.setCenter(coursesListView);

        return view;
    }
}
