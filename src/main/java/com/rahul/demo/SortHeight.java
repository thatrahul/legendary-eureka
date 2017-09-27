package com.rahul.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xbbl129 on 8/24/17.
 */
public class SortHeight {


    int[] sortByHeight(int[] a) {
        List<Integer> numbers = new ArrayList<Integer>(a.length);

        for (int i=0; i < a.length; i++) {
            int value = a[i];
            if (value != -1) {
                numbers.add(Integer.valueOf(value));
            }
        }
        Collections.sort(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        for (int i=0; i<a.length;i++) {
            if (a[i] != -1) {
                a[i] = iterator.next().intValue();
            }
        }
        return a;
    }

}
