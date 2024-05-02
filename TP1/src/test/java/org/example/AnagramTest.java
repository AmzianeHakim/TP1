package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
        assertTrue(Anagram.isAnagram("anagram", "nag a ram"));
        assertFalse(Anagram.isAnagram("hello", "world"));
        assertFalse(Anagram.isAnagram("cat", "dog"));
    }

    @Test
    public void testNullStrings() {
        Anagram.isAnagram(null, "hello");
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(Anagram.isAnagram("", ""));
    }

    @Test
    public void testDifferentLengthStrings() {
        assertFalse(Anagram.isAnagram("hello", "hell"));
        assertFalse(Anagram.isAnagram("hell", "hello"));
    }
}