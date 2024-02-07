module org.example.project490 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.project490 to javafx.fxml;
    exports org.example.project490;
}