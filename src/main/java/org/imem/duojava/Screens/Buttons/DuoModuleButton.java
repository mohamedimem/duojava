package org.imem.duojava.Screens.Buttons;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.imem.duojava.Constants;
import org.imem.duojava.Screens.TaskScreen.TaskScreen;
import org.imem.duojava.Section.task.model.TaskType;
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

        // Clear the StackPane and add the new VBox
            stackPane.getChildren().clear(); // Clear previous content
        VBox vbox = new VBox();
        vbox.setSpacing(20);
        vbox.getChildren().addAll(createTaskTypeButtons());
        stackPane.getChildren().add(vbox); // Add the new screen
        stackPane.requestLayout(); // Force the StackPane to update
    }

    private StackPane layout; // StackPane to hold the dynamic content



    public HBox createTaskTypeButtons() {
        HBox hbox = new HBox();
        hbox.setSpacing(32);

        // Button for QCM
        Button QCM = new Button(TaskType.qcm.toString());
        QCM.setOnAction(e -> {
            // Replace the content of the StackPane with the QCM screen
            layout.getChildren().clear();
            layout.getChildren().add(new TaskScreen(TaskType.qcm).paint());
        });

        // Button for Lesson
        Button Lesson = new Button(TaskType.lesson.toString());
        Lesson.setOnAction(e -> {
            // Replace the content of the StackPane with the Lesson screen
            layout.getChildren().clear();
            layout.getChildren().add(new TaskScreen(TaskType.lesson).paint());
        });

        // Button for Todo
        Button Todo = new Button(TaskType.todo.toString());
        Todo.setOnAction(e -> {
            // Replace the content of the StackPane with the Todo screen
            layout.getChildren().clear();
            layout.getChildren().add(new TaskScreen(TaskType.todo).paint());
        });

        // Add buttons to the HBox
        hbox.getChildren().addAll(QCM, Lesson, Todo);
        return hbox;
    }
}