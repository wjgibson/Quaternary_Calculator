package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import model.Calculator;

public class Controller {
    Calculator calculator = new Calculator();
    private boolean currentOperator = false, isBase4 = true;
    private final StringBuilder operand1 = new StringBuilder(), operand2 = new StringBuilder();
    @FXML
    public TextArea display;

    @FXML
    public void handleTwoButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator) {
            operand2.append("2");
        }
        else {
            operand1.append("2");
        }
        display.setText(display.getText() + target.getText());
    }
    @FXML
    public void handleThreeButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator) {
            operand2.append("3");
        }
        else {
            operand1.append("3");
        }
        display.setText(display.getText() + target.getText());
    }

    @FXML
    public void handleOneButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator) {
            operand2.append("1");
        }
        else {
            operand1.append("1");
        }
        display.setText(display.getText() + target.getText());
    }

    @FXML
    public void handlePlusButton() {
        calculator.setOperator('+');
        display.setText(display.getText() + "+");
        this.currentOperator = true;
    }

    @FXML
    public void handleMinusButton() {
        calculator.setOperator('-');
        display.setText(display.getText() + "-");
        this.currentOperator = true;
    }

    @FXML
    public void handleTimesButton() {
        calculator.setOperator('*');
        display.setText(display.getText() + "*");
        this.currentOperator = true;
    }

    @FXML
    public void handleRootButton() {
        calculator.setOperator('r');
        calculator.setOperands(operand1.toString(),"");
        display.setText(Integer.toString(calculator.calculate(), 4));
        calculator.setOperands("","");
    }

    @FXML
    public void handleSquareButton() {
        calculator.setOperator('s');
        calculator.setOperands(operand1.toString(),"");
        display.setText(Integer.toString(calculator.calculate(), 4));
        calculator.setOperands("","");
    }

    @FXML
    public void handleDivideButton() {
        calculator.setOperator('/');
        display.setText(display.getText() + "/");
        this.currentOperator = true;
    }

    @FXML
    public void handleConvertButton() {
        display.setText(calculator.convertBase(display.getText(), this.isBase4 ? 4 : 10));
        this.isBase4 = !this.isBase4;
    }

    @FXML
    public void handleClearButton() {
        display.setText("");
        calculator.setOperands("", "");
        this.isBase4 = true;
    }

    @FXML
    public void handleZeroButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (currentOperator) {
            operand2.append("0");
        }
        else {
            operand1.append("0");
        }
        display.setText(display.getText() + target.getText());
    }

    @FXML
    public void handleEqualsButton() {
        calculator.setOperands(operand1.toString(), operand2.toString());
        display.setText(Integer.toString(calculator.calculate(), 4));
        currentOperator = false;
        operand1.setLength(0);
        operand1.append(display.getText());
        operand2.setLength(0);
    }
}

