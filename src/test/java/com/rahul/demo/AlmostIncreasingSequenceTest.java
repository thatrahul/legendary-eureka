package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/12/17.
 */
public class AlmostIncreasingSequenceTest {

    AlmostIncreasingSequence sequence = new AlmostIncreasingSequence();

    @Test
    public void almostIncreasingSequence1() throws Exception {
        int[] input = {1, 2, 3, 4, 99, 5, 6};
        boolean rv = sequence.almostIncreasingSequence(input);
        assertEquals("Unexpected return value", true, rv);
    }

    @Test
    public void almostIncreasingSequence2() throws Exception {
        int[] input = {1, 2, 3};
        boolean rv = sequence.almostIncreasingSequence(input);
        assertEquals("Unexpected return value", true, rv);
    }

    @Test
    public void almostIncreasingSequence3() throws Exception {
        int[] input = {1, 2, 1, 2};
        boolean rv = sequence.almostIncreasingSequence(input);
        assertEquals("Unexpected return value", false, rv);
    }



}