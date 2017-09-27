package com.rahul.demo;

import org.junit.Test;

/**
 * Created by xbbl129 on 5/30/17.
 */
@Ignore
public class TestJustificationTest {
    @Test
    public void textJustification() throws Exception {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int length = 16;
        String[] lines = new TextJustification().textJustification(words, length);
        for (int i =0; i<lines.length; i++) {
            System.out.println(lines[i]);
        }


    }

}