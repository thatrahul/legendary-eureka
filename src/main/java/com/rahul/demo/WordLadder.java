package com.rahul.demo;

import java.util.Set;

/**
 * Created by xbbl129 on 5/17/17.
 * NOT COMPLETE
 */
public class WordLadder {
    public int wordLadder(String beginWord, String endWord, Set<String> wordDict) {


        int length = beginWord.length();
        String currentWord = beginWord;
        char a = 'a';
        char z = 'z';
        int distance = 0;

        for (int i = 0; i < length; i++) {
            //change ith character
            char[] chars = currentWord.toCharArray();
            for (char r = 'a'; r < 'z'; r++) {
                char check = currentWord.charAt(i);
                if (check != r) {
                    chars[i] = r;
                    String newWord = new String(chars);
                    //System.out.println("Generated:" + newWord);
                    if (wordDict.contains(newWord)) {
                        System.out.println("Matched:" + newWord);
                        currentWord = newWord;
                        distance++;
                        if (newWord.equals(endWord)) {
                            i = length;
                        }
                        i = 0;
                        break;
                    }
                }
            }
        }
        return distance;
    }
    //int wordLadder(String beginWord, String endWord, String[] wordList) {


}
