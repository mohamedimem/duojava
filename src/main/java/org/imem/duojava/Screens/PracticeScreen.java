package org.imem.duojava.Screens;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.imem.duojava.Constants;
import org.imem.duojava.db.DuoDatabase;

import java.util.ArrayList;
import java.util.List;

public class PracticeScreen extends VBox {

    public PracticeScreen() {}
    public VBox getVbox(){
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setStyle("-fx-background-color: #af1c1c;");
        StackPane centerStackPane = new StackPane();

        // Create a VBox to hold the fields
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        DuoDatabase duoDatabase= DuoDatabase.getInstance();
        List<String> s=duoDatabase.listModules();
List<Button> btns=new ArrayList<Button>();
        for(String moduleName:s){
    Button button = new Button(moduleName);
    btns.add(button);
}

        vBox.getChildren().addAll(btns);
        vBox.setPadding(new Insets(10));
        return vBox;
    }
}
