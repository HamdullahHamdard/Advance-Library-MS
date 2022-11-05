module com.example.advancelibraryms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advancelibraryms to javafx.fxml;
    exports com.example.advancelibraryms;
}