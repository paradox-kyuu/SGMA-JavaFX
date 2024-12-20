package com.quimpo.sgma_javafx;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class UINavigation {

    public static BorderPane defaultNavBar() {
        Button studentMngBtn = new Button("Students");
        studentMngBtn.setOnAction(e -> StageManager.displayStudents());

        Button courseMngBtn = new Button("Courses");
        courseMngBtn.setOnAction(e -> StageManager.displayCourses());

        Button subjectMngBtn = new Button("Subjects");
        subjectMngBtn.setOnAction(e -> StageManager.displaySubjects());

        Button gradeMngBtn = new Button("Grades");
        gradeMngBtn.setOnAction(e -> StageManager.displayGrades());

        Button dataAnalysisBtn = new Button("Analytics");
        dataAnalysisBtn.setOnAction(e -> StageManager.displayAnalytics());

        Button aboutBtn = new Button("About SGMA");
        aboutBtn.setOnAction(e -> StageManager.displayAbout());

        Button settingsBtn = new Button("Settings");
        settingsBtn.setOnAction(e -> StageManager.displaySettings());

        Button exitBtn = new Button("Exit");
        exitBtn.setOnAction(e -> UIUtils.showExitConfirmation());

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
        UIUtils.setButtonSize(leftNavBox, 160, 40, "Arial", 16);
        UIUtils.setButtonSize(rightNavBox, 160, 40, "Arial", 16);

        return navBar;
    }

    public static StackPane defaultAppContent() {
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
}
