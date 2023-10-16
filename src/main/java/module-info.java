module com.example.csc311_module7_hw {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.csc311_module7_hw to javafx.fxml;
    exports com.example.csc311_module7_hw;
}