package com.rahul.demo;

import java.util.Arrays;

/**
 * Created by xbbl129 on 5/23/17.
 * COMPLETED
 */
public class TripletSum {


    boolean tripletSum(int x, int[] a) {

        Arrays.sort(a);
        boolean found = false;

        int outer = 0;
        int inner = 1;


        if (a[outer] + a[inner] > x) {
            return false;
        }
        for (int i = 0; i < a.length-2 && !found; i++) {
            int left = i+1;
            int right = a.length -1;

            while (left < right && !found) {
                if (a[i] + a[left] + a[right] < x) {
                    left++;
                } else if (a[i] + a[left] + a[right] > x) {
                    right--;
                } else if (a[i] + a[left] + a[right] == x) {
                    found = true;
                }
            }
        }
        return found;
    }




}
