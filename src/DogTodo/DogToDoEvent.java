package DogTodo;


public class DogToDoEvent {
    private String description;

    public DogToDoEvent(String description) {
        this.setDescription(description);

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Today:" + " " + this.getDescription();
    }

}
