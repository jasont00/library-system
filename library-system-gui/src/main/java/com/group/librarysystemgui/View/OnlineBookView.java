package com.group.librarysystemgui.View;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.*;

/**
 * Some issues on my Apple Sillion Chips
 */

public class OnlineBookView extends ContentView {
    @Override
    public BorderPane createView() {
        BorderPane view = new BorderPane();
        WebView webView = new WebView();
        webView.getEngine().load("http://www.google.com");
        Label label = new Label("OnlineBookView!");
        view.setCenter(webView);
        return view;
    }
}
