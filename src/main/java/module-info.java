module com.example.nothere {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;


    opens com.example.nothere to javafx.fxml;
    exports com.example.nothere;
}