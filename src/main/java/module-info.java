module com.example.appexperience {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appexperience to javafx.fxml;
    exports com.example.appexperience;
}