module com.group.librarysystemgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires symmetric;

    opens com.group.librarysystemgui to javafx.fxml;
    exports com.group.librarysystemgui;
}