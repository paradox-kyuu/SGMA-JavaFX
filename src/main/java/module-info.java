module com.quimpo.sgma_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.quimpo.sgma_javafx to javafx.fxml;
    exports com.quimpo.sgma_javafx;
}