package com.quimpo.sgma_javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        StageManager.initialize(primaryStage);
        StageManager.displayDefault();
    }
}
