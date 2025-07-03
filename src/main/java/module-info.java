module com.example.calculadoraequipo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoraequipo to javafx.fxml;
    exports com.example.calculadoraequipo;
}