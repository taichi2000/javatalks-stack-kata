package com.java.talks;


public class Stack {

    private int capacity;
    private int[] elements;


    public Stack(int size) {
        elements = new int[size];
    }


    public boolean isEmpty() {
        return capacity == 0;
    }


    public void push(int item) {
        if (capacity >= elements.length)
            throw new OverflowException();

        elements[capacity] = item;

        capacity++;
    }


    public int capacity() {
        return capacity;
    }


    public int pop() {
        if (isEmpty())
            throw new UnderflowException();

        capacity--;

        return elements[capacity];
    }


    public class UnderflowException extends RuntimeException {

    }


    public class OverflowException extends RuntimeException {

    }
}
