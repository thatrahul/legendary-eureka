package com.rahul.demo;

/**
 * Created by xbbl129 on 5/22/17.
 * This is completed.
 */
public class MatrixSum {

    int matrixElementsSum(int[][] matrix) {

        int depth = matrix.length;
        int sum = 0;

        for (int i=0; i<depth; i++) {

            for (int j=0; j< matrix[i].length; j++) {

                if (matrix[i][j] == 0) {
                    //all the other elements in this column are not
                    //suitable
                    for (int k=i; k<depth; k++) {
                        matrix[k][j] = -1;
                    }
                } else if (matrix[i][j] != -1) {
                    sum =  sum + matrix[i][j];
                } else {
                    System.out.println("ignored: i:" + i + " j:" + j);
                }
            }
        }
        return sum;

    }
}
