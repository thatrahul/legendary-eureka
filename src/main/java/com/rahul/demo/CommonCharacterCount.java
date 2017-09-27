package com.rahul.demo;

/**
 * Created by xbbl129 on 5/23/17.
 */
public class CommonCharacterCount {

    int commonCharacterCount(String s1, String s2) {

        char a = 'a';
        char z = 'z';
        int length = z - a + 1;

        int[] chars1 = new int[length];
        int[] chars2 = new int[length];

        int s1len = s1.length();
        int s2len = s2.length();

        for (int i = 0; i < s1len; i++) {
            char check = s1.toCharArray()[i];
            int index = check - a;
            chars1[index] = ++chars1[index];
        }

        for (int i = 0; i < s2len; i++) {
            char check = s2.toCharArray()[i];
            int index = check - a;
            chars2[index] = ++chars2[index];
        }

        int commonCount = 0;

        for (int i = 0; i < length; i++) {
            int c1count = chars1[i];
            int c2count = chars2[i];
            if (c1count > 0 && c2count > 0) {
                commonCount = c1count <= c2count ? commonCount + c1count : commonCount + c2count;
            }
        }
        return commonCount;
    }


}
