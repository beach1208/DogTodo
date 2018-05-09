package DogTodo;

/**
 *@author Natsumi Kobayashi, Nagisa Kojima
 */

import javafx.scene.control.CheckBox;

public class DogToDoEvent {
    private String description;
    private CheckBox done;

    /**
     *
     * @param description
     * Constructor for adding to do descriptions to the list
     * Creating cheack box instance for the list
     * */
    public DogToDoEvent(String description) {
        this.setDescription(description);
        this.done = new CheckBox();

    }

    /**
     *
     * @return descriptions of the to do list
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * setting descriptions of the list
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return CheckBox button
     */
    public CheckBox getDone() {
        return done;
    }

    public void setDone(CheckBox done) {
        this.done = done;
    }


    /**
     *
     * @return String of descriptions
     */
    @Override
    public String toString(){
        return "Today:" + " " + this.getDescription();
    }

}
