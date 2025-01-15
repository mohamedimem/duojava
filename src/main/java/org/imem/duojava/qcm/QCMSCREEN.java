package org.imem.duojava.qcm;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class QCMSCREEN {
    Scene scene;
    public QCMSCREEN() {}

    public Scene getScene() {
        return scene;
    }

    public QCMSCREEN(Stage stage) {
        stage.setScene(scene);
    }
    public void fillScene() {
        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        ReadJsonWithJackson jsonFile = new ReadJsonWithJackson();
        textArea.setText(jsonFile.readFile());
        // Create a StackPane and add the TextArea to it
        StackPane root = new StackPane();
        root.getChildren().add(textArea);
        // Create the scene with the StackPane as the root
         this.scene = new Scene(root, 600, 400);

        // Set the scene to the stage and show it

    }
}
