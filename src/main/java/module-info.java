module com.example.clientesfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientesfxml to javafx.fxml;
    exports com.example.clientesfxml;
}