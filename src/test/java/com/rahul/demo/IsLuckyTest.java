package com.rahul.demo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by xbbl129 on 6/2/17.
 */
public class IsLuckyTest {
    private static final IsLucky tester = new IsLucky();

    @Test
    public void isLucky() throws Exception {
        int n = 1230;
        assertEquals("Non matching response", true, tester.isLucky(n));
    }

    @Test
    public void isLucky2() throws Exception {
        int n = 239017;
        assertEquals("Non matching response", false, tester.isLucky(n));
    }

}