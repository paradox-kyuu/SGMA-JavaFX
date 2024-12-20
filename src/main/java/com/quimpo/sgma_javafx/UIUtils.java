package com.quimpo.sgma_javafx;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Optional;

public class UIUtils {

    // Creates buttons for adding, editing, viewing, and deleting students
    public static HBox createStudentButtons(Stage primaryStage) {
        Button addButton = new Button("Add Student");
        Button viewButton = new Button("View Classes");


        ManageStudents manageStudents = new ManageStudents(primaryStage);

        HBox buttonBox = new HBox(addButton, viewButton);
        buttonBox.setAlignment(Pos.CENTER_LEFT);
        buttonBox.setSpacing(5);
        buttonBox.setPadding(new Insets(30, 0 ,30 ,10));

        return buttonBox;
    }

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
