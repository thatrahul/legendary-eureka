package com.rahul.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xbbl129 on 8/28/17.
 */
public class ReverseParenthesesTest {

    final ReverseParentheses reverser = new ReverseParentheses();

    @Test
    public void reverseParentheses1() throws Exception {
        String input = "a(bc)de";
        String expected = "acbde";
        String output = reverser.reverseParentheses(input);
        Assert.assertEquals("Not matching:" + input, expected, output);
    }


    @Test
    public void reverseParentheses2() throws Exception {
        String input = "Code(Cha(lle)nge)";
        String expected = "CodeegnlleahC";
        String output = reverser.reverseParentheses(input);
        Assert.assertEquals("Not matching:" + input, expected, output);
    }

    @Test
    public void reverseParentheses3() throws Exception {
        String input = "Rah(lu)";
        String expected = "Rahul";
        String output = reverser.reverseParentheses(input);
        Assert.assertEquals("Not matching:" + input, expected, output);
    }

    @Test
    public void reverseParentheses4() throws Exception {
        String input = "abc(cba)ab(bac)c";
        String expected = "abcabcabcabc";
        String output = reverser.reverseParentheses(input);
        Assert.assertEquals("Not matching:" + input, expected, output);
    }
}