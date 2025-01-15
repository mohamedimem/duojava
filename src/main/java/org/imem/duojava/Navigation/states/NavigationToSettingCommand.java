package org.imem.duojava.Navigation.states;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.imem.duojava.Navigation.NavigationCommand;


public class NavigationToSettingCommand implements NavigationCommand {


    private final BorderPane borderPane;
    private final Stage stage;

    public NavigationToSettingCommand(Stage stage, BorderPane borderPane) {
        this.borderPane = borderPane;
        this.stage = stage;
    }

    @Override
    public void execute() {
        StackPane stackPane = new StackPane();
        Button button = new Button("Settings");
        stackPane.getChildren().add(button);
        VBox vBox = new VBox();
        vBox.getChildren().add(stackPane);
        borderPane.setCenter(vBox);
        borderPane.requestLayout();
      //  stage.setScene(borderPane.getScene());
    }
}
