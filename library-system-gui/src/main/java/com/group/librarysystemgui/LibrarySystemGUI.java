package com.group.librarysystemgui;

import com.group.librarysystemgui.Controller.RegisterAndLoginController;
import com.group.librarysystemgui.Model.Database;
import com.group.librarysystemgui.Model.User;
import com.group.librarysystemgui.View.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Objects;

public class LibrarySystemGUI extends Application {

    RegisterAndLoginController registerAndLoginController = new RegisterAndLoginController();

    UserSession userSession;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(30);
        root.setPadding(new Insets(20, 20, 20, 100));

        BackgroundImage myBI= new BackgroundImage(new Image(Objects.requireNonNull(LibrarySystemGUI.class.getResource("libraryicon.png")).openStream(),290,300,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(myBI));


        Label titleLabel = new Label("   YorkU Library Management    ");
        titleLabel.setStyle("-fx-text-fill: black; -fx-font-size: 20px;");

        titleLabel.setAlignment(Pos.CENTER);
        HBox roleBox = new HBox();
        Label roleLabel = new Label("Role        ");
        ObservableList<String> options = FXCollections.observableArrayList("Student", "Faulty", "Staff","Visitor");
        ComboBox<String> roleComboBox = new ComboBox<>(options);
        roleComboBox.setPrefWidth(150);
        roleBox.getChildren().addAll(roleLabel, roleComboBox);

        HBox emailBox = new HBox();
        Label emailLabel = new Label("Email");
        Label emailSpacer = new Label("       ");
        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Email Account");
        emailBox.getChildren().addAll(emailLabel, emailSpacer, emailTextField);

        HBox passwdBox = new HBox();
        Label passwdLabel = new Label("Passwd");
        Label passwdSpacer = new Label("  ");
        TextField passwdTextField = new TextField();
        passwdTextField.setPromptText("New or Set Passwd");
        passwdBox.getChildren().addAll(passwdLabel, passwdSpacer, passwdTextField);

        HBox buttonBox = new HBox();
        Button registerButton = new Button("Register");
        Label buttonSpacer = new Label("                            ");
        Button loginButton = new Button("Login");
        buttonBox.getChildren().addAll(registerButton, buttonSpacer, loginButton);

        // Button Handler
        registerButton.setOnAction(event -> onRegisterButtonClick(roleComboBox,emailTextField,passwdTextField));
        loginButton.setOnAction(event -> onLoginButtonClick(roleComboBox,emailTextField,passwdTextField,primaryStage));

        root.getChildren().addAll(titleLabel, roleBox, emailBox, passwdBox, buttonBox);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Library System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void onLoginButtonClick(ComboBox<String> roleComboBox, TextField emailTextField, TextField passwdTextField, Stage primaryStage) {
        String type = roleComboBox.getValue();
        String email = emailTextField.getText();
        String passwd = passwdTextField.getText();
        boolean result = registerAndLoginController.login(email,passwd);

        if(result){
            // this is to fix the potential problem, the logginedUser should from the database to keep the same
            // not the new User
            User logginedUser = Database.getDatabase().getUser(email);
            if(logginedUser==null){
                logginedUser = new User(type,email,passwd);
            }
            UserSession.getInstance().setLoggedInUser(logginedUser);

            // Go to the Main Scene
            Scene scene = createMainScene();
            primaryStage.setTitle("YorkU Library Management");
            primaryStage.setScene(scene);
            primaryStage.show();
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login Information");
            alert.setHeaderText(null);
            alert.setContentText("Failed As: "+email);
            alert.showAndWait();
        }
    }

    private void onRegisterButtonClick(ComboBox<String> roleComboBox, TextField emailTextField, TextField passwdTextField) {
        String type = roleComboBox.getValue();
        String email = emailTextField.getText();
        String passwd = passwdTextField.getText();
        boolean result = registerAndLoginController.register(type,email,passwd);
        Alert alert;
        if(result){
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registration Information");
            alert.setHeaderText(null);
            alert.setContentText("Success As: "+email);
        }else{
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Registration Information");
            alert.setHeaderText(null);
            alert.setContentText("Failed As: "+email);
        }
        alert.showAndWait();
    }

    public Scene createMainScene(){

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 300);

        // MeanBar
        MenuBar menuBar = new MenuBar();
        Menu mainMenu = new Menu("Main");
        MenuItem main = new MenuItem("Main");
        MenuItem rent = new MenuItem("Rent");
        MenuItem search = new MenuItem("Search");
        MenuItem news = new MenuItem("News");
        MenuItem request = new MenuItem("Request");
        MenuItem purchase = new MenuItem("Purchase");
        mainMenu.getItems().addAll(main,rent, search, news, request, purchase);

        // Faculty Menu
        Menu facultyMenu = new Menu("Faculty");
        MenuItem track = new MenuItem("Track & Notifications");
        facultyMenu.getItems().add(track);

        // Managers Menu
        Menu managersMenu = new Menu("Managers");
        MenuItem itemManagement = new MenuItem("Item Management");
        managersMenu.getItems().add(itemManagement);

        // Student Menu
        Menu studentMenu = new Menu("Student");
        MenuItem onlineBook = new MenuItem("Online Book");
        studentMenu.getItems().add(onlineBook);

        // Add all MenuItem
        menuBar.getMenus().addAll(mainMenu, facultyMenu, managersMenu, studentMenu);

        Label contentLabel = new Label("Welcome to the Library");
        VBox contentBox = new VBox(contentLabel);
        root.setCenter(contentBox);

        main.setOnAction(e->root.setCenter(new ContentView().createView()));
        rent.setOnAction(e -> root.setCenter(new RentView().createView()));
        search.setOnAction(e -> root.setCenter(new SearchView().createView()));
        news.setOnAction(e -> root.setCenter(new NewsView().createView()));
        request.setOnAction(e -> root.setCenter(new RequestView().createView()));
        purchase.setOnAction(e -> root.setCenter(new PurchaseView().createView()));
        track.setOnAction(e -> root.setCenter(new TrackView().createView()));
        itemManagement.setOnAction(e -> root.setCenter(new ItemManagementView().createView()));
        onlineBook.setOnAction(e -> root.setCenter(new OnlineBookView().createView()));

        root.setTop(menuBar);
        root.setCenter(new ContentView().createView());
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
