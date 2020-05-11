package se.lexicon.javagroup30.modelTest;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.javagroup30.model.Todo;

import static org.junit.Assert.assertEquals;

public class TodoTest {
    private Todo testObjectTodo;

    @Before
    public void setUp() throws Exception {
        testObjectTodo = new Todo("TodoItem");

    }


    @Test
    public void testing_Todo_has_correct_fields() {
        assertEquals("TodoItem",testObjectTodo.getDescription());
    }

    }
