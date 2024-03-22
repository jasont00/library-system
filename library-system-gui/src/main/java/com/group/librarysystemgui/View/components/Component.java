package com.group.librarysystemgui.View.components;

import javafx.scene.control.Alert;

public class Component{

    public static void showAlert(Alert.AlertType type, String title, String contentText){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);
        alert.showAndWait();
    }
}
