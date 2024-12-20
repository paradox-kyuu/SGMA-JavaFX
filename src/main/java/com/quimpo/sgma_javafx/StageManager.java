package com.quimpo.sgma_javafx;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class StageManager {

    private static Stage primaryStage;

    public static void initialize(Stage stage) {
        primaryStage = stage;
        maximizeStage();
    }

    public static void maximizeStage() {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
    }

    public static void displayDefault() {
        primaryStage.setTitle("SGMA - Welcome");
        BorderPane rootPane = new BorderPane();
        rootPane.setTop(UINavigation.defaultNavBar());
        rootPane.setCenter(UINavigation.defaultAppContent());

        Scene homeScene = new Scene(rootPane, 1000, 800);
        primaryStage.setScene(homeScene);
        primaryStage.show();
    }

    public static void displayStudents() {
        primaryStage.setTitle("SGMA - Manage Students");

        BorderPane studentsRootPane = new BorderPane();
        studentsRootPane.setTop(UINavigation.defaultNavBar());

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

    public static void displayCourses() {
        primaryStage.setTitle("SGMA - Manage Courses");

        BorderPane coursesRootPane = new BorderPane();
        coursesRootPane.setTop(UINavigation.defaultNavBar());

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

    public static void displaySubjects() {
        primaryStage.setTitle("SGMA - Manage Subjects");

        BorderPane subjectsRootPane = new BorderPane();
        subjectsRootPane.setTop(UINavigation.defaultNavBar());

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

    public static void displayGrades() {
        primaryStage.setTitle("SGMA - Manage Grades");

        BorderPane gradesRootPane = new BorderPane();
        gradesRootPane.setTop(UINavigation.defaultNavBar());

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

    public static void displayAnalytics() {
        primaryStage.setTitle("SGMA - Analytics");

        BorderPane dataAnalysisRootPane = new BorderPane();
        dataAnalysisRootPane.setTop(UINavigation.defaultNavBar());

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

    public static void displayAbout() {
        primaryStage.setTitle("SGMA - About");

        BorderPane aboutRootPane = new BorderPane();
        aboutRootPane.setTop(UINavigation.defaultNavBar());
        aboutRootPane.setCenter(UINavigation.defaultAppContent());

        Scene aboutScene = new Scene(aboutRootPane, 1000, 800);
        primaryStage.setScene(aboutScene);
        primaryStage.show();
    }

    public static void displaySettings() {
        primaryStage.setTitle("SGMA - Settings");

        BorderPane settingsRootPane = new BorderPane();
        settingsRootPane.setTop(UINavigation.defaultNavBar());

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
}
