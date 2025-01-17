package org.imem.duojava.Screens.Buttons;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.imem.duojava.Constants;
import org.imem.duojava.db.DuoDatabase;

public class DuoModuleButton {
    public String text;
    private StackPane stackPane; // To manage screen transitions

    public DuoModuleButton(String text, StackPane sp) {
        this.text = text;
        stackPane = sp;
    }

    // Paint method to create the button layout
    public HBox paint() {
        // Create HBox containers for left and right options
        HBox leftOptions = new HBox();
        HBox rightOption = new HBox();
        HBox bigBox = new HBox();

        // Create buttons
        Button listt = new Button("list");
        listt.setOnAction(e -> {});

        Button remove = new RemoveBtn();
        remove.setOnAction(e -> {});

        Button update = new Button("update");
        update.setOnAction(e -> {});

        Button addTask = new AddButton("add Task");
        addTask.setOnAction(e -> AddmoduleScreen()); // Call AddmoduleScreen on button click

        // Set spacing for left and right options
        leftOptions.setSpacing(10);
        rightOption.setSpacing(10);

        // Add buttons to left and right options
        rightOption.getChildren().addAll(addTask, update, listt, remove);
        rightOption.setAlignment(Pos.BASELINE_RIGHT);
        leftOptions.setAlignment(Pos.BASELINE_LEFT);

        Label label = new Label(text);
        label.setPrefWidth(300);

        // Add leftOptions, label, and rightOption to the bigBox
        leftOptions.getChildren().addAll(label);
        bigBox.getChildren().addAll(leftOptions, rightOption);

        // Set spacing for the bigBox
        bigBox.setSpacing(20);

        return bigBox;
    }

    // Method to display the "Add Module" screen
    public void AddmoduleScreen() {
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setStyle("-fx-background-color: #a17373;");

        Label title = new Label("Create Module");
        TextField tf = new TextField();

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #a17393;");

        Button save = new Button("Save and ADD new Module");
        Button exit = new Button("Save and Go Back");

        save.setOnAction(e -> {
            addModule(tf.getText(), "Default Content"); // Add your logic to save the module
            stackPane.getChildren().remove(vBox); // Remove the current screen
        });

        exit.setOnAction(e -> {
            stackPane.getChildren().remove(vBox); // Remove the current screen
        });

        hbox.getChildren().addAll(save, exit);
        vBox.getChildren().addAll(title, tf, hbox);

        // Clear the StackPane and add the new VBox
        stackPane.getChildren().clear(); // Clear previous content
        stackPane.getChildren().add(vBox); // Add the new screen
        stackPane.requestLayout(); // Force the StackPane to update
    }

    // Method to add a module to the database
    private void addModule(String title, String content) {
        // Add your logic to save the module to the database
        DuoDatabase module = DuoDatabase.getInstance();
        module.add("title", title);
        module.add("content", content);
        System.out.println("Module added: " + title);
    }
}