package org.imem.duojava.Screens.TaskScreen;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class TodoTypeScren extends VBox {
    List<Line>lines =new ArrayList<Line>();
    StackPane stackPane ;
    TodoTypeScren(StackPane sP) {
        lines.add(new Line());
        stackPane = sP;
    }
    void paint(){
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        if(lines.size()>0){
            for(Line line:lines){
                vBox.getChildren().add(line.paint());
            }
        }
        stackPane.getChildren().clear();
        stackPane.getChildren().add(vBox);
        stackPane.requestLayout();
    }

    void addLine(){
        lines.add(new Line());
        updateLessonTypeScren();
    }
    void updateLessonTypeScren(){
        paint();
    }

}


