package org.imem.duojava.Section.UI;

import javafx.scene.control.Button;

public class DuoTaskButton extends Button {
    String name;
    public DuoTaskButton( String name) {
        DuoTaskButton.this.setText(name);
        DuoTaskButton.this.setPrefWidth(200);
        DuoTaskButton.this.setPrefHeight(60);
    }

}
