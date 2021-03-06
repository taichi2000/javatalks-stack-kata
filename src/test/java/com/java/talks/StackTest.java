package com.java.talks;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;


public class StackTest {

    private Stack stack;


    @Before
    public void setUp() throws Exception {
        stack = new Stack(5);
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


    @Test(expected = Stack.UnderflowException.class)
    public void popOverEmptyStackShouldFail() throws Exception {
        stack.pop();
    }


    @Test(expected = Stack.OverflowException.class)
    public void pushedOverFullStackShouldFail() throws Exception {
        Stack stack = new Stack(2);
        stack.push(12);
        stack.push(12);
        stack.push(12);
    }


    @Test
    public void topOverEmptyStackShouldReturnNull() throws Exception {
        assertNull(stack.top());
    }


    @Test
    public void whenOneIsPushedThenTopReturnsOne() throws Exception {
        stack.push(30);

        assertThat(stack.top(), is(30));
    }


    @Test
    public void whenOneAndTwoArePushedThenTopReturnsTwo() throws Exception {
        stack.push(30);
        stack.push(40);

        assertThat(stack.top(), is(40));
    }
}
