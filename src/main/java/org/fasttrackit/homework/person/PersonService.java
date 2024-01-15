package org.fasttrackit.homework.person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(List<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public Person addPerson(Person input) {
        persons.add(input);
        return input;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
