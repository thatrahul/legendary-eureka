package com.rahul.demo.tree;

/**
 * Created by xbbl129 on 5/25/17.
 */
public class SumInRange {

    int sumInRange(int[] nums, int[][] queries) {
        int denominator = (int) Math.pow(10, 9) + 7;

        int qcount = queries.length;

        long[] cummulativeSums = new long[nums.length];
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            cummulativeSums[i] = sum;
        }

        //calculate ranges
        long rangeSum = 0;
        for (int i = 0; i < qcount; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            if (startIndex == 0) {
                rangeSum = rangeSum + cummulativeSums[endIndex];
            } else {
                rangeSum = rangeSum + (cummulativeSums[endIndex] - cummulativeSums[startIndex - 1]);
            }
        }
        if (rangeSum < 0) {
            return (int) (denominator - (Math.abs(rangeSum) % denominator));
        } else {
            return (int) (rangeSum % denominator);
        }
    }
}
