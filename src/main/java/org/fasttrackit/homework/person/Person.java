package org.fasttrackit.homework.person;

import lombok.Builder;
import org.fasttrackit.homework.exceptions.ValidationException;

import java.util.UUID;

@Builder
public record Person(
        String id,
        String name,
        Integer age
) {
    public Person {
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
        validateNameNotNull(name);
        validateAgeNotNull(age);
    }

    private void validateAgeNotNull(Integer age) {
        if (age == null) {
            throw new ValidationException();
        }
    }

    private void validateNameNotNull(String name) {
        if (name == null) {
            throw new ValidationException();
        }
    }
}
