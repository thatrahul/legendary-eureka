package com.rahul.demo;

/**
 * Created by xbbl129 on 5/2/17.
 */
public class PalindromeChecker {

    public boolean checkPalindrome(String input)  {
        int length = input.length();
        int i = 0;
        int j = input.length() - 1;
        boolean rv = true;
        for (; i < length & j > -1 & i<=j & rv; i++, j--) {
            rv = input.charAt(i) == input.charAt(j);
        }
        return rv;
    }

}
