package com.quimpo.sgma_javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;


import java.util.Optional;

public class Main extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;


        displayDefault();
        maximizeStage();
    }
    public void maximizeStage(){
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());

    }

    public void displayDefault() {
        primaryStage.setTitle("SGMA - Welcome");

        BorderPane rootPane = new BorderPane();
        rootPane.setTop(defaultNavBar());
        rootPane.setCenter(defaultAppContent());

        Scene homeScene = new Scene(rootPane, 1000, 800);
        primaryStage.setScene(homeScene);

        primaryStage.show();
    }

    public BorderPane defaultNavBar() {
        Button studentMngBtn = new Button("Students");
        studentMngBtn.setOnAction(e -> displayStudents());

        Button courseMngBtn = new Button("Courses");
        courseMngBtn.setOnAction(e -> displayCourse());

        Button subjectMngBtn = new Button("Subjects");
        subjectMngBtn.setOnAction(e -> displaySubjects());

        Button gradeMngBtn = new Button("Grades");
        gradeMngBtn.setOnAction(e -> displayGrades());

        Button dataAnalysisBtn = new Button("Analytics");
        dataAnalysisBtn.setOnAction(e -> displayAnalytics());

        Button aboutBtn = new Button("About SGMA");
        aboutBtn.setOnAction(e -> displayAbout());

        Button settingsBtn = new Button("Settings");
        settingsBtn.setOnAction(e -> displaySettings());

        Button exitBtn = new Button("Exit");
        exitBtn.setOnAction(e -> showExitConfirmation());

        HBox leftNavBox = new HBox(studentMngBtn, courseMngBtn, subjectMngBtn, gradeMngBtn, dataAnalysisBtn);
        leftNavBox.setAlignment(Pos.CENTER_LEFT);
        leftNavBox.setSpacing(2);

        HBox rightNavBox = new HBox(aboutBtn, settingsBtn, exitBtn);
        rightNavBox.setAlignment(Pos.CENTER_RIGHT);
        rightNavBox.setSpacing(2);

        BorderPane navBar = new BorderPane();
        navBar.setLeft(leftNavBox);
        navBar.setRight(rightNavBox);

        // Set size for all buttons
        setButtonSize(leftNavBox, 160, 40, "Arial", 16);
        setButtonSize(rightNavBox, 160, 40, "Arial", 16);

        return navBar;
    }

    public StackPane defaultAppContent() {
        Label appTitle = new Label("SGMA - Student Grade Management & Analytics");
        appTitle.setFont(new Font("Arial", 30));

        Label appDeveloper = new Label("©2024 by QMPO Software Solutions™");
        appDeveloper.setFont(new Font("Arial", 18));

        Label appVersion = new Label("SGMA v1.0.0 Scholarly Start");
        appVersion.setFont(new Font("Arial", 18));

        VBox titleBox = new VBox(appTitle, appDeveloper, appVersion);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        return centerPane;
    }



    public void displayStudents() {
        primaryStage.setTitle("SGMA - Manage Students");

        BorderPane studentsRootPane = new BorderPane();
        studentsRootPane.setTop(defaultNavBar());

        Label studentsHeader = new Label("Manage Students");
        studentsHeader.setFont(new Font("Arial", 35));

        VBox titleBox = new VBox(studentsHeader);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        studentsRootPane.setCenter(centerPane);

        Scene studentScene = new Scene(studentsRootPane, 1000, 800);
        primaryStage.setScene(studentScene);
        primaryStage.show();



    }

    public void displayCourse() {
        primaryStage.setTitle("SGMA - Manage Courses");

        BorderPane coursesRootPane = new BorderPane();
        coursesRootPane.setTop(defaultNavBar());

        Label coursesHeader = new Label("Manage Courses");
        coursesHeader.setFont(new Font("Arial", 35));

        VBox titleBox = new VBox(coursesHeader);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        coursesRootPane.setCenter(centerPane);

        Scene courseScene = new Scene(coursesRootPane, 1000, 800);
        primaryStage.setScene(courseScene);
        primaryStage.show();



    }

    public void displaySubjects() {
        primaryStage.setTitle("SGMA - Manage Subjects");

        BorderPane subjectsRootPane = new BorderPane();
        subjectsRootPane.setTop(defaultNavBar());

        Label subjectsHeader = new Label("Manage Subjects");
        subjectsHeader.setFont(new Font("Arial", 35));

        VBox titleBox = new VBox(subjectsHeader);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        subjectsRootPane.setCenter(centerPane);

        Scene subjectScene = new Scene(subjectsRootPane, 1000, 800);
        primaryStage.setScene(subjectScene);
        primaryStage.show();



    }

    public void displayGrades() {
        primaryStage.setTitle("SGMA - Manage Grades");

        BorderPane gradesRootPane = new BorderPane();
        gradesRootPane.setTop(defaultNavBar());

        Label gradesHeader = new Label("Manage Grades");
        gradesHeader.setFont(new Font("Arial", 35));

        VBox titleBox = new VBox(gradesHeader);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        gradesRootPane.setCenter(centerPane);

        Scene gradeScene = new Scene(gradesRootPane, 1000, 800);
        primaryStage.setScene(gradeScene);
        primaryStage.show();



    }

    public void displayAnalytics() {
        primaryStage.setTitle("SGMA - Analytics");

        BorderPane dataAnalysisRootPane = new BorderPane();
        dataAnalysisRootPane.setTop(defaultNavBar());

        Label dataAnalysisHeader = new Label("Data Analysis");
        dataAnalysisHeader.setFont(new Font("Arial", 35));

        VBox titleBox = new VBox(dataAnalysisHeader);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        dataAnalysisRootPane.setCenter(centerPane);

        Scene dataAnalysisScene = new Scene(dataAnalysisRootPane, 1000, 800);
        primaryStage.setScene(dataAnalysisScene);
        primaryStage.show();


    }

    public void displayAbout() {
        primaryStage.setTitle("SGMA - About");

        BorderPane aboutRootPane = new BorderPane();
        aboutRootPane.setTop(defaultNavBar());
        aboutRootPane.setCenter(defaultAppContent());

        Scene aboutScene = new Scene(aboutRootPane, 1000, 800);
        primaryStage.setScene(aboutScene);
        primaryStage.show();



    }

    public void displaySettings() {
        primaryStage.setTitle("SGMA - Settings");

        BorderPane settingsRootPane = new BorderPane();
        settingsRootPane.setTop(defaultNavBar());

        Label settingsHeader = new Label("Settings");
        settingsHeader.setFont(new Font("Arial", 35));

        VBox titleBox = new VBox(settingsHeader);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        settingsRootPane.setCenter(centerPane);

        Scene settingsScene = new Scene(settingsRootPane, 1000, 800);

        primaryStage.setScene(settingsScene);
        primaryStage.show();



    }


    private void showExitConfirmation() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Platform.exit();
        }
    }

    private void setButtonSize(HBox hbox, double width, double height, String fontStyle, int fontSize) {
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
