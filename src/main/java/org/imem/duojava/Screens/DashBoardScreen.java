package org.imem.duojava.Screens;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import org.imem.duojava.Constants;
import org.imem.duojava.Screens.Buttons.AddButton;
import org.imem.duojava.Screens.Buttons.DuoModuleButton;
import org.imem.duojava.db.DuoDatabase;

import java.util.ArrayList;
import java.util.List;

public class DashBoardScreen extends VBox {

    private StackPane stackPane; // To manage screen transitions

    public DashBoardScreen( ) {
        stackPane = new StackPane();
        initializeUI();
    }

    private void initializeUI() {
        VBox dashboardContent = createMainContent();
        stackPane.getChildren().add(dashboardContent);
        this.getChildren().add(stackPane);
    }

    void updateList(){
        stackPane.getChildren().clear();
        VBox dashboardContent = createMainContent();
        stackPane.getChildren().add(dashboardContent);
        stackPane.requestLayout();
    }



    private VBox listModule() {
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setStyle("-fx-background-color: #af1c1c;");
        return createListOfModules();

    }

    VBox createListOfModules(){
        DuoDatabase duoDatabase = DuoDatabase.getInstance();

        List<String> moduleNames = duoDatabase.listModules();

        // Create a VBox to hold the module buttons
        VBox moduleList = new VBox();
        moduleList.setSpacing(10);
        // Create a list of DuoModuleButton instances
        List<DuoModuleButton> btnList = new ArrayList<>();
        for (String moduleName : moduleNames) {
            DuoModuleButton button = new DuoModuleButton(moduleName, stackPane);
            btnList.add(button);
        }

        // Add each button's HBox to the moduleList VBox
        btnList.forEach(button -> {
            HBox paintedButton = button.paint(); // Call the paint method to get the HBox
            moduleList.getChildren().add(paintedButton); // Add the HBox to the moduleList
        });

        // Add padding to the moduleList
        moduleList.setPadding(new Insets(10));

        // Add the moduleList to the main VBox
        return moduleList;
    }

    private VBox createMainContent() {
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        setMargin(vbox, new Insets(10));
        VBox.setMargin(vbox, new Insets(10));
        vbox.setStyle("-fx-background-color: #ff0000;");
        // Add the list of modulesstackPane.requestLayout(); to the dashboard
        HBox interactiveBtn= ComplexAddButton();
        interactiveBtn.setPadding(new Insets(10));
        vbox.getChildren().addAll(interactiveBtn,listModule());
        return vbox;
    }
    HBox ComplexAddButton(){
        StackPane miniLayout = new StackPane();
        Button btn=new AddButton("Create Section");
        btn.setOnAction(event -> {
            AddmoduleScreen(miniLayout);
            miniLayout.requestFocus();
        });

        miniLayout.getChildren().add(btn);
        HBox hbox=new HBox();
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #0017ff;");

        hbox.getChildren().addAll(miniLayout,btn);
        HBox.setHgrow(miniLayout, Priority.ALWAYS);

        return hbox;
    }

    public void AddmoduleScreen(StackPane sP) {
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setStyle("-fx-background-color: #a17373;");

        Label title = new Label("Create Module");
        TextField tf = new TextField();

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #a17393;");

        Button save = new Button("Save and ADD new Module");
    ModuleController moduleController = new ModuleController();
        save.setOnAction(e -> {
            moduleController.addModule(tf.getText()); // Add your logic to save the module
            sP.getChildren().remove(vBox); // Remove the current screen
            //upadate the list
            updateList();
        });



        hbox.getChildren().addAll(save );
        vBox.getChildren().addAll(title, tf, hbox);

        // Clear the StackPane and add the new VBox
        sP.getChildren().clear(); // Clear previous content
        sP.getChildren().add(vBox); // Add the new screen
        sP.requestLayout(); // Force the StackPane to update
    }
}