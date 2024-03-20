package com.group.librarysystemgui.View;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class OnlineBookView extends ContentView {
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();
        Label label = new Label("OnlineBookView!");
        view.setCenter(label);
        return view;
    }
}
