package org.imem.duojava.Screens.TaskScreen;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class Line extends HBox {
    private Button btn;
    private boolean saved = false;
    private HBox hb; // Reference to the HBox for dynamic styling

    public Line() {
        btn = new Button();
    }

    public HBox paint() {
        hb = new HBox(); // Initialize the HBox
        TextField tf = new TextField();
        btn = new Button("save");
        btn.setOnAction(e -> save());

        // Make the TextField grow to fill available space
        HBox.setHgrow(tf, Priority.ALWAYS);

        // Add the TextField and Button to the HBox
        hb.getChildren().addAll(tf, btn);

        return hb;
    }

    public HBox getLineLayout() {
        return paint();
    }

    public void save() {
        saved = true;

        // Update the border color of the HBox to green
        hb.setStyle("-fx-border-color: green; -fx-border-width: 2px;");
    }
}
