package org.imem.duojava.Navigation.commands;

import javafx.scene.layout.BorderPane;
import org.imem.duojava.Screens.QCMScreen;


public class NavigationToQCMCommand implements NavigationCommand {


    private final BorderPane borderPane;

    public NavigationToQCMCommand(BorderPane borderPane) {
        this.borderPane = borderPane;
    }

    @Override
    public void execute() {
        QCMScreen qcmScreen = new QCMScreen();
        borderPane.setCenter(qcmScreen.getVbox());
        borderPane.requestLayout();
    }
}
