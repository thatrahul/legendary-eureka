package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/22/17.
 */
public class LongestStringsTest {
    final LongestStrings checker = new LongestStrings();

    @Test
    public void allLongestStrings1() throws Exception {

        String[] input = {"aba", "aa", "ad", "vcd", "aba"};

        String[] longs = checker.allLongestStrings(input);
        assertEquals("Non matching count", 3, longs.length);
    }


    @Test
    public void allLongestStrings2() throws Exception {

        String[] input = {"abc",
                "eeee",
                "abcd",
                "dcd"};

        String[] longs = checker.allLongestStrings(input);
        assertEquals("Non matching count", 2, longs.length);
    }


}