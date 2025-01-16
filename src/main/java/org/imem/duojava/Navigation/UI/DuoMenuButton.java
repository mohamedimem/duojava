package org.imem.duojava.Navigation.UI;


import javafx.scene.control.Button;
import org.imem.duojava.Navigation.commands.NavigationCommand;

public class DuoMenuButton extends Button {
    int id;
    String name;
    NavigationCommand command;
    public DuoMenuButton (int id, String name, NavigationCommand command) {
        this.id = id;
        this.setOnAction(event -> command.execute());
        this.setText(name);
    }
    void execute(){
        command.execute();
    }
}
