
package org.imem.duojava.Screens;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.imem.duojava.task.ChapterScreen;
import org.imem.duojava.task.Task;
import org.imem.duojava.task.TaskType;

import java.util.ArrayList;
import java.util.List;

public class TestScreen extends VBox {

    public TestScreen() {}
    public VBox getVbox(){
        Task task =new Task(1,"imem ", TaskType.lesson);
        Task task2 =new Task(1,"taha ", TaskType.lesson);
        List<Task> taskList = new ArrayList<>();
        taskList.add(task);
        taskList.add(task2);
        ChapterScreen chapterScreen = new ChapterScreen(taskList);
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setStyle("-fx-background-color: #af1c1c;");
        StackPane centerStackPane = new StackPane();
        centerStackPane.getChildren().add(chapterScreen.getVbox());


        vBox.getChildren().addAll(centerStackPane);
        return vBox;
    }
}
