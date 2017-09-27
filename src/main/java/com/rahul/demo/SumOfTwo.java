package com.rahul.demo;

import java.util.Arrays;

/**
 * Created by xbbl129 on 5/24/17.
 * COMPLETED
 */
public class SumOfTwo {


    boolean sumOfTwo(int[] a, int[] b, int v) {
        Arrays.sort(a);
        Arrays.sort(b);

        int alen = a.length;
        for (int i = 0; i < alen; i++) {
            int check = a[i];
            int needed = v - check;
            int index = Arrays.binarySearch(b, needed);
            if (index > -1) {
                return true;
            }
        }
        return false;
    }


}
