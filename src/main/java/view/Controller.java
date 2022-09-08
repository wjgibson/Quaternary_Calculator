package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Text display; 

    @FXML protected void handleInput(ActionEvent event) {

        Button target = ((Button)event.getSource());

        if (target.getText() == "=") {
            // Solve
        } else {
            display.setText(display.getText() + target.getText());
        }
    }
}
