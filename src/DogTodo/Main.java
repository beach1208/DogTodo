package DogTodo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("DogGUI.fxml"));
        primaryStage.setTitle("DOG TO DO");
        primaryStage.setScene(new Scene(root, 1010, 610));
        primaryStage.setMaxHeight(610.0);
        primaryStage.setMaxWidth(1010.0);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
