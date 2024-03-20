module com.group.librarysystemgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.group.librarysystemgui to javafx.fxml;
    exports com.group.librarysystemgui;
}