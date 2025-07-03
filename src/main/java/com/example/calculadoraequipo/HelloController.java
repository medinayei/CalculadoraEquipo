package com.example.calculadoraequipo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private Label lblResultado;

    private double getNumero(TextField field) throws NumberFormatException {
        return Double.parseDouble(field.getText());
    }

    @FXML
    protected void sumar() {
        try {
            double resultado = getNumero(txtNum1) + getNumero(txtNum2);
            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            lblResultado.setText("Ingresa números válidos.");
        }
    }

    @FXML
    protected void restar() {
        try {
            double resultado = getNumero(txtNum1) - getNumero(txtNum2);
            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            lblResultado.setText("Ingresa números válidos.");
        }
    }

    @FXML
    protected void multiplicar() {
        try {
            double resultado = getNumero(txtNum1) * getNumero(txtNum2);
            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            lblResultado.setText("Ingresa números válidos.");
        }
    }

    @FXML
    protected void dividir() {
        try {
            double num1 = getNumero(txtNum1);
            double num2 = getNumero(txtNum2);
            if (num2 == 0) {
                lblResultado.setText("No se puede dividir entre 0.");
            } else {
                lblResultado.setText("Resultado: " + (num1 / num2));
            }
        } catch (NumberFormatException e) {
            lblResultado.setText("Ingresa números válidos.");
        }
    }
}
