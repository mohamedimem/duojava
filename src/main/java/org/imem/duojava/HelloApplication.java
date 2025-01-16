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


        // Initial center content
        StackPane stackPane = new StackPane();
        Button button = new Button("Initial Content");
        stackPane.getChildren().add(button);
        VBox vBox = new VBox();
        vBox.getChildren().add(stackPane);

        VBox centerVBox = new VBox();
        centerVBox.getChildren().add(stackPane);
        VBox.setMargin(stackPane, new Insets(20));
        vBox.setMargin(centerVBox, new Insets(20));
        root.borderPane.setCenter(vBox);

        Scene scene = new Scene(root.borderPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



}