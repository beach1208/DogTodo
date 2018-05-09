package DogTodo;
/**
 *@author Natsumi Kobayashi, Nagisa Kojima
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML Button buttonAdd;
    @FXML TextField textf;
    @FXML ListView<DogToDoEvent> eventList;

    @FXML TableView<DogToDoEvent> tableView;
    @FXML TableColumn<DogToDoEvent, String> toDoCol;
    @FXML TableColumn<DogToDoEvent, String> doneCol;
    @FXML Button remove;
    @FXML ImageView imageView;


    /**
     * Create a List to add To do descriptions. Once descriptions are added, textfield is clear.
     */
    ObservableList<DogToDoEvent> list = FXCollections.observableArrayList();
    @FXML
    public void addEvent(Event e) {
        list.add(new DogToDoEvent(textf.getText()));
        tableView.setItems((list));
        textf.clear();
    }

    /**
     * Remove to do items from the list. Depends on numbers of Remove button pressed, alert dialog pops up.
     */
    int count = 0;
    @FXML
    public void removeEvent(Event e) {
        int selectedItem = tableView.getSelectionModel().getSelectedIndex();
        list.remove(selectedItem);
        count++;

        if (count == 3) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION,"Copper is unhappy!",ButtonType.CANCEL);
            Image image = new Image("DogTodo/img/sadshiba.jpg");
            ImageView imageView = new ImageView(image);
            alert.getDialogPane().setPrefSize(600, 300);
            alert.setTitle("Cooper's Feeling");
            alert.setHeaderText("You have done "+ count+ " tasks today.\nBut She is not happy");
            alert.setGraphic(imageView);
            alert.setContentText("Copper needs to be taken care of.... ");
            alert.showAndWait();
        }
        if (count >= 6) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION,"Copper is happy!",ButtonType.CANCEL);
            Image image = new Image("DogTodo/img/Shibainu_Maru.jpg");
           ImageView imageView = new ImageView(image);
            alert.getDialogPane().setPrefSize(600, 300);
            alert.setTitle("Cooper's Feeling");
            alert.setHeaderText("You have done "+ count+ " tasks today.\nLook, How happy she is!");
            alert.setGraphic(imageView);
            alert.setContentText("Copper loves you! ");

            alert.showAndWait();
        }
    }

    /**
     *
     * @param location setting location of CheckBox button
     * @param resources
     */
    public void initialize(URL location, ResourceBundle resources) {

        final ObservableList<DogToDoEvent> data = FXCollections.observableArrayList();
        toDoCol.setCellValueFactory(new PropertyValueFactory<DogToDoEvent, String>("description"));
        doneCol.setCellValueFactory(new PropertyValueFactory<DogToDoEvent, String>("done"));
        tableView.setItems(data);
    }

}
