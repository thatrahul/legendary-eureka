package com.rahul.demo;

/**
 * Created by xbbl129 on 5/12/17.
 */
public class AlmostIncreasingSequence {


    public boolean almostIncreasingSequence(int[] sequence) {
        int n = sequence.length, position = -1, dropCount = 0;
        for (int i = 1; i < n; i++) {
            if (sequence[i - 1] >= sequence[i]) {
                position = i;
                dropCount++;
            }
        }
        if (dropCount > 1) return false;
        if (dropCount == 0) return true;
        //first or last element to be removed
        if (position == n - 1 || position == 1) {
            return true;
        }
        if (sequence[position - 1] < sequence[position + 1]) {
            return true;
        }
        if (sequence[position - 2] < sequence[position]) {
            return true;
        }
        return false;
    }

}
