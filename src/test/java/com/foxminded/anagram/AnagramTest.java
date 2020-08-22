package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AnagramTest {

    private Anagram anagram = new Anagram();

    @Test
    public void givenOrdinaryText_whenReverseText_thenReverseOrdinaryText() {
        assertEquals("dsa", anagram.reverseText("asd"));
    }

    @Test
    public void givenEmptyTest_whenReverseText_thenEmptyText() {
        assertEquals("", anagram.reverseText(""));
    }

    @Test
    public void givenTextNumbersInBegining_whenReverseText_thenReverseTextNumbersInBegining() {
        assertEquals("123asd", anagram.reverseText("123dsa"));
    }

    @Test
    public void givenTextNumbersInMiddle_whenReverseText_thenReverseTextNumbersInMiddle() {
        assertEquals("asd123asd", anagram.reverseText("dsa123dsa"));
    }

    @Test
    public void givenTextNumbersInEnd_whenReverseText_thenReverseTextNumbersInEnd() {
        assertEquals("asdasd123", anagram.reverseText("dsadsa123"));
    }

    @Test
    public void givenTextWithSpace_whenReverseText_thenReverseTextWithSpace() {
        assertEquals("asd 123asd  asd123asd   asdasd123", anagram.reverseText("dsa 123dsa  dsa123dsa   dsadsa123"));
    }
}
