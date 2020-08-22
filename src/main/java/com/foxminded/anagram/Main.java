package com.foxminded.anagram;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        InputAnagramText inputAnagramText = new InputAnagramText();

        try {
            String text = anagram.reverseText(inputAnagramText.getText());
            System.out.println("Anagram is: " + text);
        } catch (InputTextAnagramException e) {
            System.err.println(e.getMessage());
        }
    }
}
