package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Calculator;


import java.util.Objects;

public class Controller {
    Calculator calculator = new Calculator();

    @FXML private Text display;

    @FXML
    public void handleTwoButton(MouseEvent mouseEvent) {
        Button target = ((Button) mouseEvent.getSource());
        if (calculator.getOperands() == null){
            calculator.setOperands(target.getText(), null);
        }
        else {
            calculator.setOperands("2", "2");
        }
        display.setText(display + target.getText());
    }
    public void handleThreeButton(MouseEvent mouseEvent) {

    }

    public void handleOneButton(MouseEvent mouseEvent) {
    }

    public void handlePlusButton(MouseEvent mouseEvent) {
        calculator.setOperator('+');
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
    }

    public void handleClearButton(MouseEvent mouseEvent) {
    }

    public void handleZeroButton(MouseEvent mouseEvent) {
    }

    public void handleEqualsButton(MouseEvent mouseEvent) {
        calculator.calculate();
    }
}

