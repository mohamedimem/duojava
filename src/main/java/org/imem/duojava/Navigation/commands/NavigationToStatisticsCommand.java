package org.imem.duojava.Navigation.commands;

import javafx.scene.layout.BorderPane;
import org.imem.duojava.Screens.QCMScreen;
import org.imem.duojava.Screens.StatScreen;
import org.imem.duojava.task.ChapterScreen;
import org.imem.duojava.task.Task;
import org.imem.duojava.task.TaskType;

import java.util.ArrayList;
import java.util.List;


public class NavigationToStatisticsCommand implements NavigationCommand {


    private final BorderPane borderPane;

    public NavigationToStatisticsCommand(BorderPane borderPane) {
        this.borderPane = borderPane;
    }

    @Override
    public void execute() {

        StatScreen statScreen = new StatScreen();
        borderPane.setCenter(statScreen.getVbox());
        borderPane.requestLayout();
    }
}
