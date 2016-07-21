package com.java.talks;


public class Stack {

    private int capacity;
    private int last;


    public boolean isEmpty() {
        return capacity == 0;
    }


    public void push(int item) {
        last = item;
        capacity++;
    }


    public int capacity() {
        return capacity;
    }


    public int pop() {
        capacity--;
        return last;

    }
}
