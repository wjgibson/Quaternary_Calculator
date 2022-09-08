package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class View extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Calc.fxml"));
        
        Scene scene = new Scene(root, 400, 800);
    
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
