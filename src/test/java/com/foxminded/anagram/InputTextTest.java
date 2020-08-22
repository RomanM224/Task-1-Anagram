package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.*;

public class InputTextTest {

    private static final String EMPTY_STRING = "";

    private InputAnagramText inputAnagramText = new InputAnagramText();

    @Test
    void inputOrdinaryText() throws InputTextAnagramException {
        String input = "asd123";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        assertEquals("asd123", inputAnagramText.getText());
    }

    @Test
    void inputTextWithSpace() throws InputTextAnagramException {
        String input = "asd 123asd  asd123asd   asdasd123";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        assertEquals("asd 123asd  asd123asd   asdasd123", inputAnagramText.getText());
    }

    @Test
    public void emptyLineExceptionText() throws InputTextAnagramException, IOException {
        try (InputStream inputStream = new ByteArrayInputStream(EMPTY_STRING.getBytes())) {
            System.setIn(inputStream);
            assertThrows(InputTextAnagramException.class, () -> {
                inputAnagramText.getText();
            });
        }
    }
}
