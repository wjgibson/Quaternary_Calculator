package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;


public class View extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Calc.fxml")));
        
        Scene scene = new Scene(root, 350, 350);
    
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
