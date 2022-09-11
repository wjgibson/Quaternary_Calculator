package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import model.Calculator;

public class Controller {
    Calculator calculator = new Calculator();
    private boolean currentOperator = false;
    private StringBuilder operand1 = new StringBuilder(), operand2 = new StringBuilder();

    @FXML
    public TextArea display;

    @FXML
    public void handleTwoButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator){
            operand2.append("2");
        }
        else {
            operand1.append("2");
        }
        display.setText(display.getText() + target.getText());
    }
    public void handleThreeButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator){
            operand2.append("3");
        }
        else {
            operand1.append("3");
        }
        display.setText(display.getText() + target.getText());
    }

    public void handleOneButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator){
            operand2.append("1");
        }
        else {
            operand1.append("1");
        }
        display.setText(display.getText() + target.getText());
    }

    public void handlePlusButton() {
        calculator.setOperator('+');
        display.setText(display.getText() + "+");
        this.currentOperator = true;
    }

    public void handleMinusButton() {
        calculator.setOperator('-');
        display.setText(display.getText() + "-");
        this.currentOperator = true;
    }

    public void handleTimesButton() {
        calculator.setOperator('*');
        display.setText(display.getText() + "*");
        this.currentOperator = true;
    }

    public void handleRootButton() {
        calculator.setOperator('r');
        display.setText(String.format("%d",calculator.calculate()));
        calculator.setOperands("","");
    }

    public void handleSquareButton() {
        calculator.setOperator('s');
        display.setText(String.format("%d",calculator.calculate()));
        calculator.setOperands("","");
    }

    public void handleDivideButton() {
        calculator.setOperator('/');
        display.setText(display.getText() + "÷");
        this.currentOperator = true;
    }

    public void handleConvertButton() {
        display.setText(calculator.convertBase(display.getText(), 10));
    }

    public void handleClearButton() {
        display.setText("");
        calculator.setOperands("", "");
    }


    public void handleZeroButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator){
            operand2.append("0");
        }
        else {
            operand1.append("0");
        }
        display.setText(display.getText() + target.getText());
    }

    public void handleEqualsButton() {
        calculator.setOperands(operand1.toString(), operand2.toString());
        display.setText(String.format("%d",calculator.calculate()));
    }
}

