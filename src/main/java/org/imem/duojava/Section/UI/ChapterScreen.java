package org.imem.duojava.Section.UI;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.imem.duojava.Section.task.model.Task;

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


        vbox.getChildren().addAll(buttons);

        return vbox;
    }
}
