package com.java.talks;


public class Stack {

    private int capacity;
    private int[] elements = new int[100];


    public boolean isEmpty() {
        return capacity == 0;
    }


    public void push(int item) {
        elements[capacity] = item;

        capacity++;
    }


    public int capacity() {
        return capacity;
    }


    public int pop() {
        capacity--;

        return elements[capacity];
    }
}
