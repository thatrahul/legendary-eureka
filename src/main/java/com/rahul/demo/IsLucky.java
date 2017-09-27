package com.rahul.demo;

import java.util.LinkedList;

/**
 * Created by xbbl129 on 6/2/17.
 */
public class IsLucky {

    boolean isLucky(int n) {
        LinkedList<Integer> digits = new LinkedList<>();
        int count = 0;
        while (n >= 10) {
            int digit = n % 10;
            n = n / 10;
            digits.push(Integer.valueOf(digit));
            count++;
        }
        //remaining n will be the last digit
        digits.push(n);
        count++;
        if (count % 2 != 0) {
            //not even
            return false;
        }
        int half = count/2;
        int sum = 0;
        int index = 0;
        for (Integer digit : digits) {
            if (index >= half) {
                sum = sum - digit.intValue();
            } else {
                sum = sum + digit.intValue();
            }
            index++;
        }
        return sum == 0;

    }
}
