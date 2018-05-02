package DogTodo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML Button buttonAdd;
    @FXML TextField textf;
    @FXML ListView<DogToDoEvent> eventList;
    @FXML Button remove;
    @FXML ImageView imageView;



    ObservableList<DogToDoEvent> list = FXCollections.observableArrayList();
    @FXML
    public void addEvent(Event e) {
        list.add(new DogToDoEvent(textf.getText()));
        eventList.setItems((list));
        textf.clear();
    }

    int count = 0;
    @FXML
    public void removeEvent(Event e) {
        int selectedItem = eventList.getSelectionModel().getSelectedIndex();
        list.remove(selectedItem);
        count++;
        if (count > 3) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION,"Copper is happy!",ButtonType.CANCEL);
            Image image = new Image("DogTodo/img/Shibainu_Maru.jpg");
           ImageView imageView = new ImageView(image);
            alert.setTitle("Cooper's Feeling");
            alert.setHeaderText("Look, How happy she is!");
            alert.setGraphic(imageView);
            alert.setContentText("Copper loves you! ");

            alert.showAndWait();
        }
    }
}
