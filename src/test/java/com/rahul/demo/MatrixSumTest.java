package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/22/17.
 */
public class MatrixSumTest {
    @Test
    public void matrixElementsSum1() throws Exception {

        int[][] matrix =  {{1,1,1,0},
                {0,5,0,1},
                {2,1,3,10}};
        int sum = new MatrixSum().matrixElementsSum(matrix);
        assertEquals("Incorrect value", 9, sum);

    }

    @Test
    public void matrixElementsSum2() throws Exception {

        int[][] matrix =  {{0}};
        int sum = new MatrixSum().matrixElementsSum(matrix);
        assertEquals("Incorrect value", 0, sum);

    }

}