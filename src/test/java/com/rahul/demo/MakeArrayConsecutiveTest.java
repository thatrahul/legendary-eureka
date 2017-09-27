package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/11/17.
 */
public class MakeArrayConsecutiveTest {

    final MakeArrayConsecutive arrayConsecutive = new MakeArrayConsecutive();

    @Test
    public void makeArrayConsecutive2_1() throws Exception {

        int[] input = {6, 2, 3, 8};
        int result = arrayConsecutive.makeArrayConsecutive2(input);

        assertEquals("Non matching results", 3, result);

    }

    @Test
    public void makeArrayConsecutive2_2() throws Exception {

        int[] input = {3, 4, 5};
        int result = arrayConsecutive.makeArrayConsecutive2(input);

        assertEquals("Non matching results", 0, result);

    }

    @Test
    public void makeArrayConsecutive2_3() throws Exception {

        int[] input = {2, 2};
        int result = arrayConsecutive.makeArrayConsecutive2(input);

        assertEquals("Non matching results", 4, result);

    }

    @Test
    public void makeArrayConsecutive2_4() throws Exception {

        int[] input = {3, 6};
        int result = arrayConsecutive.makeArrayConsecutive2(input);

        assertEquals("Non matching results", 2, result);

    }

    @Test
    public void makeArrayConsecutive2_5() throws Exception {

        int[] input = {0, 5};
        int result = arrayConsecutive.makeArrayConsecutive2(input);

        assertEquals("Non matching results", 4, result);

    }

    @Test
    public void makeArrayConsecutive2_6() throws Exception {

        int[] input = {6, 3};
        int result = arrayConsecutive.makeArrayConsecutive2(input);

        assertEquals("Non matching results", 2, result);

    }
}