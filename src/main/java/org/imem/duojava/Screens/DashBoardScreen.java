package org.imem.duojava.Screens;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class DashBoardScreen extends VBox {

    public DashBoardScreen() {}
    public VBox getVbox(){
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setStyle("-fx-background-color: #af1c1c;");
        StackPane centerStackPane = new StackPane();

        // Create a VBox to hold the fields
        VBox vBox = new VBox();
        vBox.setSpacing(10);

        // Add fields to the VBox
        Label label = new Label("Enter your dashboard:");
    label.setPrefSize(100,60);
        vBox.getChildren().addAll(label  );
        vBox.setPadding(new Insets(10));
        return vBox;
    }
}
