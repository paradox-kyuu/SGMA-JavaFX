package com.quimpo.sgma_javafx;

import javafx.geometry.Pos;
import javafx.scene.control.*;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManageStudents {

    private Stage primaryStage;

    public ManageStudents(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    public static List<Student> getAllStudents() {
        // Return a sample list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe"));
        students.add(new Student("Jane Smith"));
        return students;
    }

    // Creates a table view to display students
    public static TableView<Student> createStudentTable() {
        TableView<Student> table = new TableView<>();

        TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        TableColumn<Student, String> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());

        table.getColumns().addAll(idColumn, nameColumn);

        // Populate the table with existing students (for example purposes, we'll use a static list)
        table.getItems().addAll(getAllStudents());

        return table;
    }
}
