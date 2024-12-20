package com.quimpo.sgma_javafx;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class AuthUtils {

    // Static flag to track login status
    private static boolean isLoggedIn = false;

    private static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    private static boolean isValidCredentials(String id, String password) {
        // Replace with actual validation logic, e.g., check against a database
        return id.equals("expectedID") && password.equals("expectedPassword");
    }


    // Method to handle login
    public static void handleLogin(String idInput, String password) {
        int authorizedIdNumber = 2211603;

        if(isNullOrEmpty(idInput) && isNullOrEmpty(password)) {
            displayErrorAlert("ID & Password is required to login.");
            System.err.println("Login failed. ID & Password is required.");

        } else if (isNullOrEmpty(idInput)) {
            displayErrorAlert("ID is required to login.");
            System.err.println("Login failed. ID is required.");

        } else if (isNullOrEmpty(password)) {
            displayErrorAlert("Password is required to login.");
            System.err.println("Login failed. Password is required.");

        } else {
            try {
                // Validate and parse the ID to an integer
                int id = Integer.parseInt(idInput);


                if (id == authorizedIdNumber && password.equals("12345")) {
                    isLoggedIn = true;  // Mark user as logged in
                    StageManager.displayDefaultDashboard(); // Navigate to dashboard
                    System.out.println("Successfully logged in.");
                } else {
                    displayErrorAlert("Invalid username or password. Please try again.");
                    System.err.println("Login failed. Invalid Credentials.");
                }
            } catch (NumberFormatException e) {
                // Handle case where ID is not a valid integer
                System.err.println("Login failed. ID must be a number.");
                displayErrorAlert("Invalid ID format. Please enter a numeric ID.");
            } catch (Exception e) {
                // Handle any unexpected errors
                System.err.println("An unexpected error occurred during login: " + e.getMessage());
                displayErrorAlert("An unexpected error occurred. Please try again later.");
            }
        }

    }

    // Method to display error alerts
    private static void displayErrorAlert(String message) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.showAndWait();
        });
    }

    // Method to show logout confirmation
    public static boolean showLogoutConfirmation() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to logout?");

        boolean isLoggedOut = false;
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            isLoggedOut = true;
            isLoggedIn = false;  // Mark user as logged out
            StageManager.displayLogin(); // Show login screen
        }

        return isLoggedOut;
    }

    // Method to check if the user is logged in
    public static boolean isLoggedIn() {
        return isLoggedIn;
    }
}
