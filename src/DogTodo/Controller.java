package DogTodo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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
    @FXML private ImageView ImageView;
    @FXML private ImageView ImageView2;


    ObservableList<DogToDoEvent> list = FXCollections.observableArrayList();
    @FXML
    public void addEvent(Event e) {
        list.add(new DogToDoEvent(textf.getText()));
        eventList.setItems((list));
        textf.clear();
    }
    @FXML
    public void removeEvent(Event e) {
        int selectedItem = eventList.getSelectionModel().getSelectedIndex();
        list.remove(selectedItem);

        Image image = new Image("DogTodo/img/Shibainu_Maru.jpg");
        ImageView.setImage(image);


    }



}
