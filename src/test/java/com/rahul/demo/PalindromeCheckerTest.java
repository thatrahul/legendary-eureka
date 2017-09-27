package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xbbl129 on 5/2/17.
 */
public class PalindromeCheckerTest {

    final PalindromeChecker checker = new PalindromeChecker();

    @Test
    public void checkPalindrome1() throws Exception {
        String input = "rahul";
        boolean result = checker.checkPalindrome(input);
        assertFalse("Unexpected result", result);

    }

    @Test
    public void checkPalindrome2() throws Exception {
        String input = "rahar";
        boolean result = checker.checkPalindrome(input);
        assertTrue("Unexpected result", result);
    }

    @Test
    public void checkPalindrome3() throws Exception {
        String input = "a";
        boolean result = checker.checkPalindrome(input);
        assertTrue("Unexpected result", result);
    }

    @Test
    public void checkPalindrome4() throws Exception {
        String input = "bbbbbbbb";
        boolean result = checker.checkPalindrome(input);
        assertTrue("Unexpected result", result);
    }

    @Test
    public void checkPalindrome5() throws Exception {
        String input = "cat";
        boolean result = checker.checkPalindrome(input);
        assertFalse("Unexpected result", result);

    }
}