package org.fasttrackit.code.generics;

import org.fasttrackit.homework.person.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");

        OldBox oldBox = new OldBox("test");
        OldBox oldBox2 = new OldBox(7);

        if (oldBox.getItem() instanceof String) {
            System.out.println(((String) oldBox.getItem()).length());
        }

        if (oldBox2.getItem() instanceof Integer) {
            System.out.println((Integer) oldBox2.getItem() > 10);
            ;
        }

        NewBox<String> newBox = new NewBox<>("Blabla");
        System.out.println(newBox.getItem().length());

        NewBox<Person> personNewBox = new NewBox<>(Person.builder()
                .name("George")
                .age(19)
                .build());
        System.out.println(personNewBox.getItem().name());

        BoxNumbers<Integer> integerBoxNumbers = new BoxNumbers<>(11);
        System.out.println(integerBoxNumbers.getItem());

        System.out.println(integerBoxNumbers.getLength(Person.builder()
                .name("George")
                .age(19)
                .build()));
    }
}
