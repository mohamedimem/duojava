package org.imem.duojava.Navigation.commands;

import javafx.scene.layout.BorderPane;
import org.imem.duojava.Screens.PracticeScreen;


public class NavigationToPracticeCommand implements NavigationCommand {


    private final BorderPane borderPane;

    public NavigationToPracticeCommand(BorderPane borderPane) {
        this.borderPane = borderPane;
    }

    @Override
    public void execute() {

        PracticeScreen practiceScreen = new PracticeScreen();
        borderPane.setCenter(practiceScreen.getVbox());
        borderPane.requestLayout();
    }
}
