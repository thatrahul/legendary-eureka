package com.rahul.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xbbl129 on 5/26/17.
 */
public class TextJustification {

    String[] textJustificationOld(String[] words, int l) {
        final char space = ' ';
        List<String> lines = new ArrayList<>();

        int sum = 0;
        int start = 0;
        for (int i = 0; i < words.length; i++) {
            if (sum + words[i].length()-1 >= l || i == words.length - 1) {
                //we can't select this one.
                //form a line
                int count = i - start; // number of words
                int spaces = l - sum - count;
                int spaceperword = spaces / count;
                int delta = spaces % count;
                //construct sentence
                StringBuilder builder = new StringBuilder();
                for (int j = start; j < i; j++) {
                    builder.append(words[j]);
                    for (int k = 0; (k <= spaceperword); k++) {
                        builder.append(space);
                    }
                    for (int k = 0; (j == start && k <= delta); k++) {
                        builder.append(space);
                    }
                }
                lines.add(builder.toString());
                start = i;
                sum = 0;
            }
            sum = sum + words[i].length() + 1;
        }
        return lines.toArray(new String[lines.size()]);
    }

    String[] textJustification(String[] words, int l) {
        final char space = ' ';
        List<String> lines = new ArrayList<>();
        LinkedList<String> lineWords = new LinkedList<>();
        ArrayList<String> spaces = new ArrayList<>();
        int charCount = 0;
        int index = 0;
        int wordCount = words.length;
        int sentenceCount = 0;
        while (index < wordCount) {
            String word = words[index];
            if (charCount + word.length() >= l) {
                //we have to output a line here
                int spCount = l - charCount;
                if (spCount > 0) {
                    int perWord = spCount / sentenceCount;




                }




            } else {
                lineWords.push(word);
                String separator = new String("");
                spaces.add(separator);
                lineWords.push(separator);
                charCount = charCount + word.length() + 1;
                sentenceCount++;
            }
        }
        return lines.toArray(new String[lines.size()]);
    }
}
