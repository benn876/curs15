package org.fasttrackit.code.generics;

import org.fasttrackit.homework.person.Person;

import java.util.List;

public class BoxNumbers<T extends Number> {
    private T item;
    private List<T> items;

    public BoxNumbers(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public <E extends Person> int getLength(E item){
        return item.name().length();
    }
}
