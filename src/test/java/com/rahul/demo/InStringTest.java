package com.rahul.demo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by xbbl129 on 5/18/17.
 */
public class InStringTest {
    @Test
    public void strstr1() throws Exception {
        String s = "CodefightsIsAwesome";
        String find = "IA";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", -1, value);
    }


    @Test
    public void strstr2() throws Exception {
        String s = "CodefightsIsAwesome";
        String find = "IsA";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", 10, value);
    }

    @Test
    public void strstr3() throws Exception {
        String s = "Rahul";
        String find = "Rahul";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", s.indexOf(find), value);
    }

    @Test
    public void strstr4() throws Exception {
        String s = "Rahul";
        String find = "RahulRocks";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", s.indexOf(find), value);
    }

    @Test
    public void strstr5() throws Exception {
        String s = "ffbefbdbacbccecaceddcbcaeaebfedfcfdbeecffdbbf";
        String find = "cb";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", s.indexOf(find), value);
    }

    @Test
    public void strstr6() throws Exception {
        String s = "aBcDefghaBcdEFgh";
        String find = "ghb";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", s.indexOf(find), value);
    }

    @Test
    public void strstr7() throws Exception {
        String s = "sst";
        String find = "st";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", s.indexOf(find), value);
    }

    @Test
    public void strstr8() throws Exception {
        String s = "abcaa";
        String find = "ab";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", s.indexOf(find), value);
    }


    @Test
    public void strstr9() throws Exception {
        String s = "aaaaaa";
        String find = "a";
        int value = new InString().strstr(s, find);
        assertEquals("Unexpected return value", s.indexOf(find), value);
    }
}