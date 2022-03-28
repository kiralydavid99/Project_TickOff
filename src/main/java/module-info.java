module com.example.vizsga1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.json;


    opens com.example.vizsga1 to javafx.fxml;
    exports com.example.vizsga1;
}