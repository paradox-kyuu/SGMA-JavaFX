package com.quimpo.sgma_javafx;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.util.Optional;

public class UIUtils {

    public static void showExitConfirmation() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Platform.exit();
        }
    }

    public static void setButtonSize(HBox hbox, double width, double height, String fontStyle, int fontSize) {
        for (javafx.scene.Node node : hbox.getChildren()) {
            if (node instanceof Button) {
                Button button = (Button) node;
                button.setPrefWidth(width);
                button.setPrefHeight(height);
                button.setFont(new Font(fontStyle, fontSize));
            }
        }
    }
}
