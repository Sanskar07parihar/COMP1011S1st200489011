module com.example.comp1011s1st200489011 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1011s1st200489011 to javafx.fxml;
    exports com.example.comp1011s1st200489011;
}