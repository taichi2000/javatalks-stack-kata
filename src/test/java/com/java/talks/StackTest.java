package com.java.talks;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class StackTest {

    @Test
    public void newStackShouldBeEmpty() throws Exception {
        Stack stack = new Stack();

        assertThat(stack.isEmpty(), is(true));
    }
}
