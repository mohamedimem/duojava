package org.imem.duojava;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.imem.duojava.Navigation.NavigationController;
import org.imem.duojava.Navigation.SpecialWindows;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        SpecialWindows root = SpecialWindows.getInstance();
        primaryStage.setTitle("JavaFX Button Example");

        NavigationController navigationController = new NavigationController(root);
        navigationController.init();


        Scene scene = new Scene(root.borderPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



}