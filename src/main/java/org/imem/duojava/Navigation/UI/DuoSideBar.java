package org.imem.duojava.Navigation.UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.util.List;

public  class DuoSideBar {
    List<DuoMenuButton > buttonList;
    VBox layout;
    Scene scene;
    public DuoSideBar (List<DuoMenuButton > buttonList) {
        layout = new VBox(10);
        this.buttonList = buttonList;
    }



    public VBox  paint() {
        // 10 is the spacing between buttons
        for(DuoMenuButton button : buttonList) {
            button.setPrefWidth(100);
            button.setPrefHeight(100);
        }
        layout.getChildren().addAll(buttonList);
        Rectangle rectangle = new Rectangle();
    System.out.println("done painting..");
        return layout;
    }

}

