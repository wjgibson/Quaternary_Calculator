package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.Objects;

public class Controller {

    @FXML private Text display; 

    @FXML
    public void handleButton(MouseEvent mouseEvent) {
        Button target = ((Button)mouseEvent.getSource());
        String input1 = "";
        String input2 = "";
        char operand;
        /*
        if (target.getText().equals("0") || target.getText().equals("1")
                || target.getText().equals("2") || target.getText().equals("3")) {
            input1 = target.getText();
            if (input1.!equals("")) {
                input2 = target.getText();
            }

            }
        else if (target.getText().equals("=")){
            display.setText(display.getText() + target.getText());
        }

         */
    }

    public String[] handleNumberButton(MouseEvent mouseEvent, String input1, String input2) {
        Button target = ((Button)mouseEvent.getSource());
        if (input1.equals("")) {
            input1 = target.getText();
        } else {
            input2 = target.getText();
        }
        String[] s = new String[2];
        s[0] = input1;
        s[1] = input2;
        return s;

    }
}

