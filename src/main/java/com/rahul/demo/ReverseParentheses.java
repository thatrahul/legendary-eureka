package com.rahul.demo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xbbl129 on 8/24/17.
 */
public class ReverseParentheses {

    String reverseParentheses(String s) {
        char[] chars = s.toCharArray();
        char openBracket = '(';
        char closeBracket = ')';
        StringBuilder builder = new StringBuilder();
        ArrayDeque<Character> current = null;
        List<Character> outputList = new ArrayList<>(s.length());
        for (int i = 0; i < chars.length; i++) {
            char test = chars[i];
            if (test == openBracket) {
                int endIndex = reverse(i+1, chars);
                i = endIndex;
            }
        }
        //remove any
        List<Character> outputCharList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(' || c == ')') {
                continue;
            }
            outputCharList.add(c);
        }
        char[] rv = new char[outputCharList.size()];
        int index = 0;
        for (Character c : outputCharList) {
            rv[index++] = c;
        }
        return new String(rv);

    }

    /**
     * Reverse string at start index.
     * @param startIndex
     * @param chars
     * @return
     */
    int reverse(int startIndex, char[] chars) {
        int index = startIndex;
        int endIndex = -1;
        ArrayDeque<Character> current = new ArrayDeque<>();
        while (index < chars.length) {
            char test = chars[index++];
            current.offerFirst(test);
            if (test == '(') {
                int innerEnd = reverse(index, chars);
                for (int j = index; j <= innerEnd; j++) {
                    current.offerFirst(chars[j]);
                }
                index = innerEnd + 1;
            } else if (test == ')') {
                //we have collected
                int replaceIndex = startIndex;
                while (current.peekFirst() != null) {
                    chars[replaceIndex++] = current.removeFirst();
                }
                return replaceIndex;
            } else {
            }
        }
        return -1;
    }

}
