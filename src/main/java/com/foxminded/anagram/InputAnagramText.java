package com.foxminded.anagram;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputAnagramText {

    public String getText() throws InputTextAnagramException {
        String text;
        System.out.print("Input text for anagram: ");
        Scanner scan = new Scanner(System.in);
        try {
            text = scan.nextLine();
        } catch (NoSuchElementException ex) {
            throw new InputTextAnagramException(ex.getMessage());
        }
        if (text.trim().isEmpty()) {
            throw new InputTextAnagramException("Input string is empty");
        }
        return text;
    }
}
