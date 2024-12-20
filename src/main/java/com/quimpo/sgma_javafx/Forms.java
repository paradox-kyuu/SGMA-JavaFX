package com.quimpo.sgma_javafx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Forms {

    public static HBox loginForm( ) {

        int fieldMinHeight = 40;
        int fieldMinWidth = 500;
        int buttonMinWidth, buttonMinHeight;
        buttonMinWidth = fieldMinWidth;
        buttonMinHeight = fieldMinHeight;

        // Create input fields and labels
        Label idLabel = new Label("ID Number:");
        TextField idField = new TextField();
        idField.setPromptText("Enter your ID Number");
        idField.setMinWidth(fieldMinWidth);
        idField.setMinHeight(fieldMinHeight);
        idField.setPadding(new Insets(10, 10, 10, 10));

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.setMinWidth(fieldMinWidth);
        passwordField.setMinHeight(fieldMinHeight);
        passwordField.setPadding(new Insets(10, 10, 10, 10));

        // Create a login button
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> AuthUtils.handleLogin((idField.getText()), passwordField.getText()));
        loginButton.setMaxWidth(buttonMinWidth);
        loginButton.setMaxHeight(buttonMinHeight);
        loginButton.setPadding(new Insets(10, 10, 10, 10));

        // Layout for login form
        VBox loginFormBox = new VBox(10, idLabel, idField, passwordLabel, passwordField, loginButton);
        loginFormBox.setAlignment(Pos.CENTER_LEFT);

        HBox loginForm = new HBox(loginFormBox);
        loginForm.setAlignment(Pos.CENTER);


        return loginForm;
    }
}
