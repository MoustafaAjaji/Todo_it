package se.lexicon.javagroup30.modelTest;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.javagroup30.data.PersonSequencer;
import se.lexicon.javagroup30.model.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person testObject;

    @Before
    public void setUp() throws Exception {

        testObject = new Person(PersonSequencer.nextPersonId(),"Test","Testsson");
        testObject.setFirstName("Test");
        testObject.setLastName("Testsson");

    }
    @Test
    public void tesObject_has_correct_fields() {
       assertEquals(1,testObject.getPersonId());
        assertEquals("Test",testObject.getFirstName());
        assertEquals("Testsson",testObject.getLastName());

    }


}
