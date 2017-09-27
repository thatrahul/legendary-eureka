package com.rahul.demo;

/**
 * Created by xbbl129 on 5/11/17.
 * This is completed.
 */
public class MakeArrayConsecutive {


    int makeArrayConsecutive2(int[] statues) {
        int length = statues.length;
        if (length == 1) {
            return 0;
        }

        int min = statues[0];
        int max = statues[0];

        for (int i = 1; i < length; i++) {
            int current = statues[i];
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Min:" + min + " Max:" + max);
        boolean[] flags = new boolean[max + 1];
        for (int i = 0; i < length; i++) {
            flags[statues[i]] = true;
        }

        int count = 0;
        for (int i = min; i <= max; i++) {
            if (!flags[i]) {
                count++;
            }
        }
        return count;
    }


}
