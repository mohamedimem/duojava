package org.imem.duojava;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.imem.duojava.qcm.QCMSCREEN;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button button = new Button("Click Me");

        // Set an action for the button
        button.setOnAction(event -> System.out.println("Button clicked!"));

        // Create a layout (StackPane in this case)
        StackPane root = new StackPane();

        // Add the button to the layout
        root.getChildren().add(button); // Correct way to add a Node (Button) to a layout

        // Create a scene with the layout
        Scene scene = new Scene(root, 1000, 600);

        // Set the scene to the stage and show it
        primaryStage.setTitle("JavaFX Button Example");
        QCMSCREEN qcms = new QCMSCREEN();
        qcms.fillScene();
        primaryStage.setScene(qcms.getScene());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}