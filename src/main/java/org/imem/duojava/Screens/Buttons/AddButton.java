package org.imem.duojava.Screens.Buttons;


import javafx.scene.control.Button;

public class AddButton extends Button {
    String text;
    public AddButton(String text) {
        // Call the paint method to style the button
        this.text = text;
       paint();
    }

    public Button paint() {
        // Set the button text
        this.setText(text);

        // Apply CSS styling to the button
        this.setStyle(
                "-fx-background-color: green; " + // Set background color to red
                        "-fx-text-fill: white; " +     // Set text color to white
                        "-fx-font-size: 14px; " +      // Optional: Set font size
                        "-fx-padding: 2px 8px;"      // Optional: Add padding
        );

        return this; // Return the styled button
    }
}
