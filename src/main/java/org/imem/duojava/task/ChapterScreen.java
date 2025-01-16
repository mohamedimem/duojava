package org.imem.duojava.task;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.imem.duojava.task.UI.DuoTaskButton;

import java.util.ArrayList;
import java.util.List;


public class ChapterScreen {
    List<Task> tasklist;
    List<DuoTaskButton> buttons;

    public ChapterScreen(List<Task> tl) {
        tasklist = tl;
        buttons = new ArrayList<DuoTaskButton>();
        Paint();
    }

    public VBox getVbox(){
        return Paint();
    }
    VBox Paint(){

        StackPane stackPane = new StackPane();
        VBox vbox = new VBox();
        vbox.setSpacing(20);
        if(tasklist.size() > 0){
            for (Task task : tasklist) {
                DuoTaskButton button =new DuoTaskButton(task.name);
                buttons.add(button);
            }
        }

        vbox.getChildren().addAll(buttons);

        return vbox;
    }
}
