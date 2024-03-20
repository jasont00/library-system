package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.SearchHandler;
import com.group.librarysystemgui.Model.Textbook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Req5
 */
public class SearchView extends ContentView {
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();

        TextField searchField = new TextField();
        Button searchButton = new Button("Search");
        HBox searchBox = new HBox(10, new Label("Book Title:"), searchField, searchButton);

        ListView<Textbook> resultsListView = new ListView<>();
        ListView<Textbook> recommendationsListView = new ListView<>();
        resultsListView.setCellFactory(listView -> new ListCell<Textbook>() {
            @Override
            protected void updateItem(Textbook item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText(item.getName() + " - " + item.getPublisher() + " - $" + String.format("%.2f", item.getPrice()));
                }
            }
        });
        recommendationsListView.setCellFactory(listView -> new ListCell<Textbook>() {
            @Override
            protected void updateItem(Textbook item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText(item.getName() + " - " + item.getPublisher() + " - $" + String.format("%.2f", item.getPrice()));
                }
            }
        });


        VBox resultsBox = new VBox(10, new Label("Search Results"), resultsListView);
        VBox recommendationsBox = new VBox(10, new Label("Recommendations"), recommendationsListView);
        HBox listBox = new HBox(20, resultsBox, recommendationsBox);

        ObservableList<Textbook> sampleResults = FXCollections.observableArrayList(
                new Textbook("Book 1",  29.99,"Publisher A"),
                new Textbook("Book 2", 49.99,"Publisher B")
        );
        ObservableList<Textbook> sampleRecommendations = FXCollections.observableArrayList(
                new Textbook("Book 1",  29.99,"Publisher A"),
                new Textbook("Book 2", 49.99,"Publisher B")
        );

        searchButton.setOnAction(event -> {
            String searchText = searchField.getText();
            resultsListView.setItems(FXCollections.observableArrayList(SearchHandler.search(searchText)));
            recommendationsListView.setItems(FXCollections.observableArrayList(SearchHandler.searchSimilarBooks(searchText)));
        });

        view.setCenter(listBox);
        view.setTop(searchBox);
        return view;
    }
}
