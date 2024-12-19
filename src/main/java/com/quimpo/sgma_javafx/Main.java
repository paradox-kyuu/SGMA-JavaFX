package com.quimpo.sgma_javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.util.Optional;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        displayHome(primaryStage);
    }

    public void displayHome(Stage primaryStage) {
        primaryStage.setTitle("SGMA - Welcome");



        Button studentMngBtn = new Button();
        studentMngBtn.setText("Students");

        Button courseMngBtn = new Button();
        courseMngBtn.setText("Courses");

        Button subjectMngBtn = new Button();
        subjectMngBtn.setText("Subjects");

        Button gradeMngBtn = new Button();
        gradeMngBtn.setText("Grades");

        Button dataAnalysisBtn = new Button();
        dataAnalysisBtn.setText("Analytics");

        Button settingsBtn = new Button();
        settingsBtn.setText("Settings");

        Button exitBtn = new Button();
        exitBtn.setText("Exit");

        exitBtn.setOnAction(e -> showExitConfirmation());

        HBox navbarBox = new HBox();
        navbarBox.setAlignment(Pos.CENTER_LEFT);
        navbarBox.getChildren().addAll(studentMngBtn, courseMngBtn, subjectMngBtn, gradeMngBtn, dataAnalysisBtn);

        // Create HBox for settings & exit button
        HBox exitBox = new HBox();
        exitBox.setAlignment(Pos.CENTER_RIGHT);
        exitBox.getChildren().addAll(settingsBtn, exitBtn);

        // Create a top container to hold both HBoxes
        BorderPane topPane = new BorderPane();
        topPane.setLeft(navbarBox);
        topPane.setRight(exitBox);

        // Set size for all buttons
        setButtonSize(navbarBox, 160, 30);
        setButtonSize(exitBox, 160, 30);

        Label appTitle = new Label();
        appTitle.setText("SGMA - Student Grade Management & Analytics");
        appTitle.setFont(new Font("Arial", 27));

        Label appDeveloper = new Label();
        appDeveloper.setText("©2024 by QMPO Software Solutions™");
        appDeveloper.setFont(new Font("Arial", 15));

        Label appVersion = new Label();
        appVersion.setText("SGMA v1.0.0 Scholarly Start");
        appVersion.setFont(new Font("Arial", 15));

        VBox titleBox = new VBox();
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().addAll(appTitle, appDeveloper, appVersion);

        StackPane centerPane = new StackPane();
        centerPane.setAlignment(Pos.CENTER);
        centerPane.getChildren().add(titleBox);

        BorderPane rootPane = new BorderPane();
        rootPane.setTop(topPane);
        rootPane.setCenter(centerPane);

        setButtonSize(navbarBox, 180, 40);
        setButtonSize(exitBox, 180, 40);

        Scene homeScene = new Scene(rootPane, 1000, 800);
        primaryStage.setScene(homeScene);

        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setMaximized(true);

        primaryStage.show();
    }

    private void showExitConfirmation() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit?");

        /*
        / Apply the CSS file to the alert
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(getClass().getResource("alert.css").toExternalForm());
        dialogPane.getStyleClass().add("alert");
         */

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Platform.exit();
        }
    }
    private void setButtonSize(HBox hbox, double width, double height) {
        for (javafx.scene.Node node : hbox.getChildren()) {
            if (node instanceof Button) {
                Button button = (Button) node;
                button.setPrefWidth(width);
                button.setPrefHeight(height);
            }
        }
    }
}
