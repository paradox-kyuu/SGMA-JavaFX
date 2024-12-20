package com.quimpo.sgma_javafx;

import javafx.geometry.Insets;
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

        primaryStage.setMaximized(true);
    }
    public static void displayLogin() {
        primaryStage.setTitle("SGMA - Login");

        HBox loginForm = Forms.loginForm();

        Scene loginScene = new Scene(loginForm, 800, 600);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }


    public static void displayDefaultDashboard() {
        primaryStage.setTitle("SGMA - Welcome");
        BorderPane dashboardRootPane = new BorderPane();
        dashboardRootPane.setTop(UINavigation.defaultNavBar());
        dashboardRootPane.setCenter(UINavigation.defaultAppContent());

        Scene homeScene = new Scene(dashboardRootPane, 1800, 850);
        primaryStage.setScene(homeScene);
        primaryStage.show();
    }

    public static void displayStudents() {
        primaryStage.setTitle("SGMA - Manage Students");

        BorderPane studentsRootPane = new BorderPane();
        studentsRootPane.setTop(UINavigation.defaultNavBar());

        // Header
        Label studentsHeader = new Label("Manage Students");
        studentsHeader.setFont(new Font("Arial", 35));
        VBox titleBox = new VBox(studentsHeader);
        titleBox.setSpacing(2);
        titleBox.setAlignment(Pos.CENTER);
        StackPane centerPane = new StackPane(titleBox);
        centerPane.setAlignment(Pos.CENTER);

        // Buttons for actions
        HBox buttonBox = UIUtils.createStudentButtons(primaryStage);

        // Students table or form (for viewing/editing)
        TableView<Student> studentTable = ManageStudents.createStudentTable();

        VBox contentWrapper = new VBox();
        contentWrapper.getChildren().addAll(buttonBox, studentTable);

        studentsRootPane.setCenter(contentWrapper);

        Scene studentScene = new Scene(studentsRootPane, 1800, 850);
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

        Scene courseScene = new Scene(coursesRootPane, 1800, 850);
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

        Scene subjectScene = new Scene(subjectsRootPane, 1800, 850);
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

        Scene gradeScene = new Scene(gradesRootPane, 1800, 850);
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

        Scene dataAnalysisScene = new Scene(dataAnalysisRootPane, 1800, 850);
        primaryStage.setScene(dataAnalysisScene);
        primaryStage.show();
    }

    public static void displayAbout() {
        primaryStage.setTitle("SGMA - About");

        BorderPane aboutRootPane = new BorderPane();
        aboutRootPane.setTop(UINavigation.defaultNavBar());
        aboutRootPane.setCenter(UINavigation.defaultAppContent());

        Scene aboutScene = new Scene(aboutRootPane, 1800, 850);
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

        Scene settingsScene = new Scene(settingsRootPane, 1800, 850);
        primaryStage.setScene(settingsScene);
        primaryStage.show();
    }
}
