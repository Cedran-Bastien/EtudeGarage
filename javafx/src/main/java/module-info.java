module com.example.etudegarage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens application to javafx.fxml;
    exports application;
    exports Vue;
    opens Vue to javafx.fxml;
}