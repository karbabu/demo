package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LetterMatcherDemoTest {

    @Test
    @DisplayName("Should replace lowercase 7-letter word ending with 'ing'")
    public void testReplaceLowercase() {
        String input = "I am tapping on the door.";
        String expected = "I am foozing on the door.";
        assertEquals(expected, LetterMatcherDemo.replaceMatchingIng(input));
    }

    @Test
    @DisplayName("Should replace uppercase 7-letter word ending with 'ing'")
    public void testReplaceUppercase() {
        String input = "Tapping is what I do.";
        String expected = "Foozing is what I do.";
        assertEquals(expected, LetterMatcherDemo.replaceMatchingIng(input));
    }

    @Test
    @DisplayName("Should replace multiple occurrences")
    public void testMultipleOccurrences() {
        String input = "rapping and tapping and napping";
        String expected = "foozing and foozing and foozing";
        assertEquals(expected, LetterMatcherDemo.replaceMatchingIng(input));
    }

    @Test
    @DisplayName("Should NOT replace 6-letter word ending with 'ing'")
    public void testSixLetterWord() {
        String input = "I am baking a cake.";
        String expected = "I am baking a cake.";
        assertEquals(expected, LetterMatcherDemo.replaceMatchingIng(input));
    }

    @Test
    @DisplayName("Should NOT replace 8-letter word ending with 'ing'")
    public void testEightLetterWord() {
        String input = "I am tracking the package.";
        String expected = "I am tracking the package.";
        assertEquals(expected, LetterMatcherDemo.replaceMatchingIng(input));
    }

    @Test
    @DisplayName("Should NOT replace word not ending with 'ing'")
    public void testWordNotEndingWithIng() {
        String input = "I saw a tapping sound";
        String expected = "I saw a foozing sound";
        assertEquals(expected, LetterMatcherDemo.replaceMatchingIng(input));
    }

    @Test
    @DisplayName("Should handle empty string")
    public void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, LetterMatcherDemo.replaceMatchingIng(input));
    }
}