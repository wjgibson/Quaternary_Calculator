package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Calculator;

public class Controller {
    Calculator calculator = new Calculator();

    @FXML
    public Text display;

    @FXML
    public void handleTwoButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (calculator.getOperand1().equals("")){
            calculator.setOperand1(target.getText());
        }
        else {
            calculator.setOperand2(target.getText());
        }
        display.setText(display.getText() + target.getText());
    }
    public void handleThreeButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (calculator.getOperand1().equals("")){
            calculator.setOperand1(target.getText());
        }
        else {
            calculator.setOperand2(target.getText());
        }
        display.setText(display.getText() + target.getText());
    }

    public void handleOneButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (calculator.getOperand1().equals("")){
            calculator.setOperand1(target.getText());
        }
        else {
            calculator.setOperand2(target.getText());
        }
        display.setText(display.getText() + target.getText());
    }

    public void handlePlusButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        calculator.setOperator('+');
        display.setText(display.getText() + target.getText());
    }

    public void handleMinusButton(MouseEvent mouseEvent) {
        calculator.setOperator('-');
    }

    public void handleTimesButton(MouseEvent mouseEvent) {
        calculator.setOperator('*');
    }

    public void handleRootButton(MouseEvent mouseEvent) {
        calculator.setOperator('r');
    }

    public void handleSquareButton(MouseEvent mouseEvent) {
        calculator.setOperator('s');
    }

    public void handleDivideButton(MouseEvent mouseEvent) {
        calculator.setOperator('/');
    }

    public void handleConvertButton(MouseEvent mouseEvent) {
        // calculator.convertBase(display.getText(), )
    }

    public void handleClearButton(MouseEvent mouseEvent) {
        display.setText("");
        calculator.setOperand1("");
        calculator.setOperand2("");
        calculator.setOperands("", "");
    }


    public void handleZeroButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (calculator.getOperand1().equals("")){
            calculator.setOperand1(target.getText());
        }
        else {
            calculator.setOperand2(target.getText());
        }
        display.setText(display.getText() + target.getText());
    }

    public void handleEqualsButton(MouseEvent mouseEvent) {
        calculator.calculate();
    }
}

