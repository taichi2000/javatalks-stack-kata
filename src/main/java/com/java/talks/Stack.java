package com.java.talks;


public class Stack {


    private boolean empty = true;


    public boolean isEmpty() {
        return empty;
    }


    public void push(int item) {
        empty = false;
    }
}
