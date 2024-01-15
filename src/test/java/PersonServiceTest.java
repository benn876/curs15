import org.fasttrackit.homework.person.Person;
import org.fasttrackit.homework.person.PersonService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonServiceTest {
    @Test
    void initClass() {
        List<Person> persons = List.of(new Person(UUID.randomUUID().toString(), "Mihai", 22));

//        List<Person> personFromArrayList = new ArrayList<>();
//        personFromArrayList.add(new Person(UUID.randomUUID().toString(), "Mihai", 22));

        PersonService service = new PersonService(persons);
    }

    @Test
    void testNullAsParameter() {
        PersonService service = new PersonService(null);
    }

    @Test
    void testAddPersonMethod() {
        List<Person> persons = List.of(new Person(UUID.randomUUID().toString(), "Mihai", 22));
        PersonService personService = new PersonService(persons);
        Person addedPerson = personService.addPerson(new Person(null, "Jojo", 44));

        assertThat(addedPerson).isNotNull()
                .extracting("name", "age")
                .containsExactlyInAnyOrder("Jojo", 44);
        assertThat(addedPerson.id()).isNotNull();
        assertThat(personService.getPersons()).hasSize(2);
    }

}
