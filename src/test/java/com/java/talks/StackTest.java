package com.java.talks;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class StackTest {

    private Stack stack;


    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }


    @Test
    public void newStackShouldBeEmpty() throws Exception {
        assertThat(stack.isEmpty(), is(true));
    }


    @Test
    public void whenOneIsPushStackIsNotEmpty() throws Exception {
        stack.push(1);

        assertThat(stack.isEmpty(), is(false));
    }


    @Test
    public void whenOneIsPushCapacityIsOne() throws Exception {
        stack.push(1);

        assertThat(stack.capacity(), is(1));
    }


    @Test
    public void whenOneAndTwoArePushedCapacityIsTwo() throws Exception {
        stack.push(1);
        stack.push(2);

        assertThat(stack.capacity(), is(2));
    }


    @Test
    public void whenOneIsPushedThenOneIsPopped() throws Exception {
        stack.push(1);
        assertThat(stack.capacity(), is(1));

        assertThat(stack.pop(), is(1));
        assertThat(stack.capacity(), is(0));
    }


    @Test
    public void when42IsPushedThen42IsPopped() throws Exception {
        stack.push(42);
        assertThat(stack.capacity(), is(1));

        assertThat(stack.pop(), is(42));
        assertThat(stack.capacity(), is(0));
    }


    @Test
    public void whenOneAndTwoArePushedThenTwoAndOneArePopped() throws Exception {
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
    }
}
