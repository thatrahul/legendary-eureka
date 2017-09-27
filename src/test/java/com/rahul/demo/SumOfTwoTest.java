package com.rahul.demo;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by xbbl129 on 5/24/17.
 */
public class SumOfTwoTest {
    SumOfTwo finder = new SumOfTwo();

    @Test
    public void sumOfTwo1() throws Exception {
        int[] a = {6, 10, 25, 13, 20, 21, 11, 10, 18, 21};
        int[] b = {21, 10, 6, 0, 29, 25, 1, 17, 19, 25};
        int v = 37;
        boolean found = finder.sumOfTwo(a, b, v);
        assertTrue("Invalid return value", found);

    }

    @Test
    public void sumOfTwo2() throws Exception {
        int[] a = {10, 1, 5, 3, 8};
        int[] b =  {100, 6, 3, 1, 5};
        int v = 4;
        boolean found = finder.sumOfTwo(a, b, v);
        assertTrue("Invalid return value", found);

    }

}