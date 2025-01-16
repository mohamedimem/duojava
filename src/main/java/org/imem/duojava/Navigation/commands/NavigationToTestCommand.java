package org.imem.duojava.Navigation.commands;

import javafx.scene.layout.BorderPane;
import org.imem.duojava.Screens.QCMScreen;
import org.imem.duojava.Screens.TestScreen;
import org.imem.duojava.task.ChapterScreen;
import org.imem.duojava.task.Task;
import org.imem.duojava.task.TaskType;

import java.util.ArrayList;
import java.util.List;


public class NavigationToTestCommand implements NavigationCommand {


    private final BorderPane borderPane;

    public NavigationToTestCommand(BorderPane borderPane) {
        this.borderPane = borderPane;
    }

    @Override
    public void execute() {

        TestScreen testScreen = new TestScreen();
        borderPane.setCenter(testScreen.getVbox());
        borderPane.requestLayout();
    }
}
