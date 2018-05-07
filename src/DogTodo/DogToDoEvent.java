package DogTodo;

/**
 * @author Nagisa Kojima, Natsumi Kobayashi
 */

import javafx.scene.control.CheckBox;

public class DogToDoEvent {
    private String description;
    private CheckBox done;

    public DogToDoEvent(String description) {
        this.setDescription(description);
        this.done = new CheckBox();

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckBox getDone() {
        return done;
    }

    public void setDone(CheckBox done) {
        this.done = done;
    }

    @Override
    public String toString(){
        return "Today:" + " " + this.getDescription();
    }

}
