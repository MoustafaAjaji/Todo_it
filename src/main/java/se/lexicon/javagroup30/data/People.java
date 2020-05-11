package se.lexicon.javagroup30.data;

import se.lexicon.javagroup30.model.Person;

import java.util.Arrays;

public class People {
    private static Person[] persons = new Person[0];
 // {person1, person2} => person1 : id= 9 firstName = "ali" lastName = "muller"
    public int size() {

        return persons.length;
    }

    public Person[] findAll() {
        return persons;
    }
    // person : 0,1,2,3,79
    public Person findById(int personId) { // 60
        Person[] arrayToReturnTheSearch = new Person[0];
        Person placeToStoreTheFoundElement = null;
        for (Person person : persons) {
            if (person.getPersonId() == personId) {  //firstName = "ali" lastName = "muller"
                placeToStoreTheFoundElement = person;
            }
        }
        return placeToStoreTheFoundElement;
    }


    public Person addPerson1(String personName, String lastName) {
        Person person = new Person(PersonSequencer.nextPersonId(), personName, lastName);
        persons = Arrays.copyOf(persons, persons.length + 1);
        persons[persons.length - 1] = person;

        return person;
    }
    public void clear() {
        persons = new Person[0];
    }

/*
    public boolean remove(int personId) {

        Boolean flag = false;
        int persize = persons.length;
        Person[] toremovearr = new Person[0];
        Person[] before = new Person[persize];
        Person[] after = new Person[persize];
        Person[] after1 = Arrays.copyOf(after, after.length + 1);
        Person[] combined = new Person[persize - 1];
        int index = 0;
        int beforeind = 0;
        int afterind = 0;
        int combindex = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null)

                System.out.println("No element found in the People array");
            else if (persons[i].getPersonId() == personId)
                index = i;
        }

        for (int i = 0; i < persons.length; i++) {
            if (i < index) {
                before[i] = persons[i];
                beforeind++;
                combindex++;
            } else {
                if (i == 2) {
                    after1[i] = persons[i];

                } else
                    after1[i] = persons[i + 1];

                //System.out.println(after1[i].getFirstName());
                // System.out.println(persons[i].getFirstName());
                afterind++;
                combindex++;
            }
        }
        //Person[] combined1 = Arrays.copyOf(combined,combined.length+1);
        for (int i = 0; i < combindex - 1; i++) {
            if (i < beforeind)
                combined[i] = before[i];
            else {
                combined[i] = after1[i];
                flag = true;
            }
        }


        System.out.println("Persons left in the persons array after removing a person");
        for (int i = 0; i < persize - 1; i++) {
            System.out.print(combined[i].getPersonId() + "");
            System.out.println(combined[i].getFirstName());
        }
        return flag;
    }
*/


}







