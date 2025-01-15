package org.imem.duojava.Navigation.UI;


import javafx.scene.control.Button;
import org.imem.duojava.Navigation.NavigationCommand;

public class DuoMenuButton extends Button {
    int id;
    String name;
    NavigationCommand command;
    public DuoMenuButton (int id, String name, NavigationCommand command) {
        this.id = id;
        this.name = name;
    }
    void execute(){
        command.execute();
    }
}
