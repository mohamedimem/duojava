package org.imem.duojava.Screens.TaskScreen;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

import java.util.ArrayList;
import java.util.List;

public class LessonTypeScren extends VBox {
    List<Line>lines =new ArrayList<Line>();
    StackPane stackPane ;
    LessonTypeScren(StackPane sP) {
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


