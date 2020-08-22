package com.foxminded.anagram;

import static java.lang.Character.*;
import static java.util.stream.Collectors.*;

import java.util.stream.Stream;

public class Anagram {
    private static final String SPLIT_CHARACTER = " ";

    public String reverseText(String text) {
      return Stream.of(text.split(SPLIT_CHARACTER))
              .map(this::reverseWord)
              .collect(joining(SPLIT_CHARACTER));
    }

    private String reverseWord(String word) {
        char[] chars = word.toCharArray();
        int leftIndex = chars.length - 1;
        int rightIndex = 0;

        while (leftIndex > rightIndex) {
            if (!isAlphabetic(chars[leftIndex])) {
                leftIndex--;
            } else if (!isAlphabetic(chars[rightIndex])) {
                rightIndex++;
            } else {
                char rightChar = chars[rightIndex];
                chars[rightIndex] = chars[leftIndex];
                chars[leftIndex] = rightChar;
                leftIndex--;
                rightIndex++;
            }
        }
        return new String(chars);
    }
}
