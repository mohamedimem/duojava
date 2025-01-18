package org.imem.duojava.Screens.TaskScreen;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.imem.duojava.Screens.QCMScreen;
import org.imem.duojava.Section.task.model.TaskType;
import org.imem.duojava.Section.task.model.types.LessonTask;

import java.util.Stack;

public class TaskScreen extends VBox {
    StackPane stackPane;
    TaskType taskType;
    public TaskScreen(TaskType taskType) {
        this.taskType = taskType;
    }
    public StackPane paint(){
        return switch(taskType){
            case TaskType.lesson -> new LessonTypeScren(stackPane).stackPane;
            case TaskType.qcm ->new QCMSTypescren(stackPane).stackPane;
            case TaskType.todo -> new TodoTypeScren(stackPane).stackPane;
        };
    }
    void saveData(){}

}
