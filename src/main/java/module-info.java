module com.example.javaplaygraound2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaplaygraound2 to javafx.fxml;
    exports com.example.javaplaygraound2;
}