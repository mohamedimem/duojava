package org.imem.duojava.Screens.Buttons;

import javafx.scene.control.Button;

public class RemoveBtn extends Button {

    public RemoveBtn() {
        // Call the paint method to style the button
        paint();
    }

    public Button paint() {
        // Set the button text
        this.setText("-");

        // Apply CSS styling to the button
        this.setStyle(
                "-fx-background-color: white; " + // Set background color to red
                        "-fx-text-fill: red; " +     // Set text color to white
                        "-fx-font-size: 14px; " +      // Optional: Set font size
                        "-fx-padding: 2px 8px;"      // Optional: Add padding
        );

        return this; // Return the styled button
    }
}