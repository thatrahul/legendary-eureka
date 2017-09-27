package com.rahul.demo.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/25/17.
 */
public class SumInRangeTest {

    final SumInRange ranger = new SumInRange();

    @Test
    public void sumInRange1() throws Exception {

        int[] input = {-77, 54, -59, -94, -13, -78, -81, -38, -26, 17, -73, -88, 90, -42, -63, -36, 37, 25, -22, 4, 25, -86, -44, 88, 2, -47, -29, 71, 54, -42};
        int[][] queries = {{2, 2},
                {4, 7},
                {2, 4},
                {0, 2},
                {3, 6},
                {6, 6},
                {3, 3},
                {2, 7},
                {3, 4},
                {3, 3},
                {2, 9},
                {0, 1},
                {4, 4},
                {2, 3},
                {0, 6},
                {4, 4},
                {2, 3},
                {0, 5},
                {2, 5},
                {4, 5}};
        long sum = ranger.sumInRange(input, queries);

        assertEquals("Invalid return value", 999996808, sum);

    }

    @Test
    public void sumInRange2() throws Exception {

        int[] input = {3, 0, -2, 6, -3, 2};
        int[][] queries = {{0, 2},
                {2, 5},
                {0, 5}};
        long sum = ranger.sumInRange(input, queries);

        assertEquals("Invalid return value", 10, sum);

    }


    @Test
    public void sumInRange3() throws Exception {

        int[] input = {-1000};
        int[][] queries = {{0, 0}};
        long sum = ranger.sumInRange(input, queries);

        assertEquals("Invalid return value", 999999007, sum);

    }


    @Test
    public void sumInRange4() throws Exception {

        int[] input = {34, 19, 21, 5, 1, 10, 26, 46, 33, 10};
        int[][] queries = {{3, 7},
                {3, 4},
                {3, 7},
                {4, 5},
                {0, 5}};
        long sum = ranger.sumInRange(input, queries);

        assertEquals("Invalid return value", 283, sum);

    }

}