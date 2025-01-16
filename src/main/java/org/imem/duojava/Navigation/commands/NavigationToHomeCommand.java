package org.imem.duojava.Navigation.commands;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.imem.duojava.Screens.DashBoardScreen;
import org.imem.duojava.Screens.QCMScreen;


public class NavigationToHomeCommand implements NavigationCommand {

    DashBoardScreen screen;
    private final BorderPane borderPane;

    public NavigationToHomeCommand(BorderPane borderPane) {
        this.borderPane = borderPane;
    }

    @Override
    public void execute() {
        DashBoardScreen homeScreen = new DashBoardScreen();
        borderPane.setCenter(homeScreen.getVbox());
        borderPane.requestLayout();
    }

    public VBox paintHome(){
       screen = new DashBoardScreen();
       return screen.getVbox();
    }
}
