package se.lexicon.javagroup30.model;

public class Todo {

    private int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo( String description) {
    //public Todo(int todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }


    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


