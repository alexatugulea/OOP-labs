package com.company;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private boolean isNumber(TextField input) {
        try {
            double val = Double.parseDouble(input.getText());
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    @Override
    public void start(Stage stage) {
        stage.setTitle("Divide Calculator");
        TextField divisor = new TextField();
        TextField divident = new TextField();
        Label resultLable = new Label();
        Label errorLabel = new Label();
        Button button = new Button();
        button.setText("Result");
        button.setOnAction(actionEvent ->
        {
            try
            {
                resultLable.setText("");
                errorLabel.setText("");

                double divisorValue = Double.parseDouble(divisor.getText());
                double dividentValue = Double.parseDouble(divident.getText());

                double resultValue = divisorValue / dividentValue;
                resultLable.setText( Double.toString(resultValue) );

                if (divisor.getText().isEmpty()) { throw new Exception("Please enter a divisor"); }

                if (divident.getText().isEmpty()) { throw new Exception("Please enter a divident"); }

                if (dividentValue == 0)
                {
                    throw new ArithmeticException();
                }

                if (dividentValue == 13)
                {
                    throw new UnluckyException("Unlucky Number 13");
                }

            }
            catch (ArithmeticException e) {

                errorLabel.setText("Division by 0 it's not possible");

            }
            catch(NumberFormatException e)
            {
                if (isNumber((divident))) {
                    errorLabel.setText("Divident is not a number.\n");
                }
                if (isNumber((divisor))) {
                    errorLabel.setText(("Divisor is not a number.\n"));
                }
                if(isNumber((divident)) && isNumber((divisor)) ) {
                    errorLabel.setText("Both inputs are not numbers.Please change!");
                }
            }
            catch(Exception e)
            {
                errorLabel.setText(e.getMessage());
            }
        });
        VBox calculator = new VBox(10);
        calculator.getChildren().addAll(divisor, divident, button, resultLable, errorLabel);
        stage.setScene(new Scene(calculator, 350, 200));
        stage.show();
    }

}