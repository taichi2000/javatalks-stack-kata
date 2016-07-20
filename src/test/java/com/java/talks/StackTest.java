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

    }
}
