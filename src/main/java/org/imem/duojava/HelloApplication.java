package org.imem.duojava;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import javafx.scene.control.CustomMenuItem;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.imem.duojava.Navigation.NavigationCommand;
import org.imem.duojava.Navigation.UI.DuoMenuButton;
import org.imem.duojava.Navigation.UI.DuoSideBar;
import org.imem.duojava.Navigation.states.NavigationToHomeCommand;
import org.imem.duojava.Navigation.states.NavigationToSettingCommand;
import org.imem.duojava.qcm.QCMSCREEN;

import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {


        BorderPane root = new BorderPane();
        NavigationCommand nC= new NavigationToHomeCommand(primaryStage,root);
        NavigationCommand nC2= new NavigationToSettingCommand(primaryStage,root);
        DuoMenuButton saveItem = new DuoMenuButton(0,"Dashboard",nC);
        DuoMenuButton exitItem = new DuoMenuButton(1,"Exit",nC);
        DuoMenuButton exitItem2 = new DuoMenuButton(1,"Exit",nC);

        List<DuoMenuButton> menus = new ArrayList<DuoMenuButton>();
        menus.add(saveItem);
        menus.add(exitItem);
        menus.add(exitItem2);
        primaryStage.setTitle("JavaFX Button Example");
        DuoSideBar sideBar =new DuoSideBar(menus);
        root.setLeft(sideBar.paint());
     //   root.setCenter(sideBar.paint());
 //       QCMSCREEN qcms = new QCMSCREEN();
   //     qcms.fillScene();
        Scene scene = new Scene(root,800,600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }



}