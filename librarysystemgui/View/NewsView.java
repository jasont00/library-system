package com.group.librarysystemgui.View;

import com.group.librarysystemgui.Controller.NewsletterHandler;
import com.group.librarysystemgui.Model.Newsletter;
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

import java.util.List;

public class NewsView extends ContentView {
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();

        List<Newsletter> items = NewsletterHandler.getAllSubscription(UserSession.getInstance().getLoggedInUser());
        List<Newsletter> nonSubscripted = NewsletterHandler.getAllNonSubscripted(UserSession.getInstance().getLoggedInUser());

        int countOfRent = items.size();

        Label label = new Label("  USER: "+ UserSession.getInstance().getUserEmail()
                + " | SUBSCRIPTED: "+ countOfRent);


        ObservableList<Newsletter> rentals = FXCollections.observableArrayList(items);

        ListView<Newsletter> listView = new ListView<>(rentals);
        listView.setCellFactory(param -> new ListCell<>() {
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
                cancelButton = new Button("CANCEL SUBSCRIPTION");
                cancelButton.setOnAction(event ->{
                    Newsletter currentItem = getItem();
                    NewsletterHandler.Cancel(UserSession.getInstance().getLoggedInUser(),currentItem);
                    Component.showAlert(Alert.AlertType.INFORMATION,"CANCEL SUBSCRIPTION","You Cancel Subscription of: "+currentItem.getName());
                });

                openButton.setOnAction(event -> {
                    Newsletter currentItem = getItem();
                    System.out.println("OPENING: " + currentItem.getName());
                    //TODO: not sure how to open the frame to display web information properly
                    String message = currentItem.open(); // 假设这会返回一个String类型的消息
                    showDialog(currentItem.getName(),message);
                });

                HBox.setHgrow(name, Priority.ALWAYS);
                content.getChildren().addAll(openButton,name,price,publisher,cancelButton);
            }

            @Override
            protected void updateItem(Newsletter newsletter, boolean empty) {
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

        ObservableList<Newsletter> nonSubscriptedO = FXCollections.observableArrayList(nonSubscripted);

        ListView<Newsletter> listView2 = new ListView<>(nonSubscriptedO);
        listView2.setCellFactory(param -> new ListCell<>() {
            private final HBox content;
            private final Text name;
            private final Text price;
            private final Text publisher;
            private final Button subButton;

            {
                content = new HBox(15);
                name = new Text();
                price = new Text();
                publisher = new Text();
                subButton = new Button("SUBSCRIBE");
                subButton.setOnAction(event -> {
                    Newsletter currentItem = getItem();
                    try {
						NewsletterHandler.SubScribe(UserSession.getInstance().getLoggedInUser(),currentItem);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    Component.showAlert(Alert.AlertType.INFORMATION,"SUBSCRIPTION","You have New Subscription of: "+currentItem.getName());
                });
                HBox.setHgrow(name, Priority.ALWAYS);
                content.getChildren().addAll(subButton,name,price,publisher);
            }

            @Override
            protected void updateItem(Newsletter newsletter, boolean empty) {
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
        vbox.getChildren().addAll(label, listView,listView2);

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
