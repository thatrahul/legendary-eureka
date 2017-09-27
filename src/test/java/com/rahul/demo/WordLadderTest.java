package com.rahul.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by xbbl129 on 5/17/17.
 */
public class WordLadderTest {
    final WordLadder ladder = new WordLadder();
    @Test
    public void ladderLength() throws Exception {

        String[] dict = {"hot", "dot", "dog", "lot", "log", "cog"};

        ladder.wordLadder("hit", "cog", new HashSet<String>(Arrays.asList(dict)));




    }

}