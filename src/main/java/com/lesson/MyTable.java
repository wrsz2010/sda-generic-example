package com.lesson;

public class MyTable<T> {
    private MyTableElement firstElement;
    private MyTableElement lastElement;

    public void add(T element) {
        MyTableElement<T> tableElement = new MyTableElement<>();
        tableElement.value = element;

        if (firstElement == null) {
            firstElement = tableElement;
            lastElement = tableElement;
        } else {
            lastElement.next = tableElement;
            lastElement = tableElement;
        }
    }
}
