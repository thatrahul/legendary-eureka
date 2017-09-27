package com.rahul.demo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by xbbl129 on 5/23/17.
 */
public class CommonCharacterCountTest {

    final  CommonCharacterCount counter = new CommonCharacterCount();

    @Test
    public void commonCharacterCount1() throws Exception {
        String  s1 = "aabcc", s2 = "adcaa";
        int common = counter.commonCharacterCount(s1, s2);
        assertEquals("Non matching count", 3, common);
    }

    @Test
    public void commonCharacterCount2() throws Exception {
        String  s1 = "a", s2 = "aaa";
        int common = counter.commonCharacterCount(s1, s2);
        assertEquals("Non matching count", 1, common);
    }

    @Test
    public void commonCharacterCount3() throws Exception {
        String  s1 = "a", s2 = "z";
        int common = counter.commonCharacterCount(s1, s2);
        assertEquals("Non matching count", 0, common);
    }
}