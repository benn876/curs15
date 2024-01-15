import org.fasttrackit.homework.exceptions.ValidationException;
import org.fasttrackit.homework.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;


public class PersonTest {
    @Test
    void createPersonWithCorrectParameters() {
        Person person = new Person(UUID.randomUUID().toString(), "Mihai", 22);
    }

    @Test
    void createPersonWithNullName() {
        Assertions.assertThrows(ValidationException.class, () -> new Person(UUID.randomUUID().toString(), null, 22));
    }

    @Test
    void createPersonWithNullAge() {
        Assertions.assertThrows(ValidationException.class, () -> new Person(UUID.randomUUID().toString(), "Mihai", null));
    }

    @Test
    void createPersonWithNullId() {
        Person person = new Person(null, "Mihai", 22);
        org.assertj.core.api.Assertions.assertThat(person.id()).isNotNull();
    }
}
