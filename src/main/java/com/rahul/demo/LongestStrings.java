package com.rahul.demo;

/**
 * Created by xbbl129 on 5/22/17.
 * Given an array of strings, return another array containing all of its longest strings.
 * <p>
 * Example
 * <p>
 * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 * allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 * <p>
 * https://codefights.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL
 */
public class LongestStrings {

    String[] allLongestStrings(String[] inputArray) {

        if (inputArray == null) {
            return null;
        }
        if (inputArray.length == 0) {
            return inputArray;
        }

        int length = inputArray.length;

        int[] longIndexes = new int[length];
        int maxLen = inputArray[0].length();
        longIndexes[0] = maxLen;
        int count = 1;
        for (int i = 1; i < length; i++) {
            int currentLength = inputArray[i].length();
            longIndexes[i] = currentLength;
            if (currentLength > maxLen) {
                //new maxlength
                maxLen = currentLength;
                count = 1;
            } else if (currentLength == maxLen) {
                count++;
            }
        }

        String[] rv = new String[count];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (longIndexes[i] == maxLen) {
                rv[index++] = inputArray[i];
            }
        }
        return rv;
    }

}
