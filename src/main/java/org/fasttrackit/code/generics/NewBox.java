package org.fasttrackit.code.generics;

public class NewBox<T> {
    private T item;

    public NewBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
