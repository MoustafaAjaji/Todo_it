package se.lexicon.javagroup30.data;

public class TodoSequence {
    private static int todoId=0;

    public static int nextTodoId(){
        return ++todoId;
    }

    public static void reset(){
        todoId=0;
    }
}
