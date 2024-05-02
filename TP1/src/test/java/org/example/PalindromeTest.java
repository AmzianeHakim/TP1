package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        // Test avec un palindrome en minuscules
        assertTrue(Palindrome.isPalindrome("radar"));

        // Test avec un palindrome en majuscules
        assertTrue(Palindrome.isPalindrome("Madam"));

        // Test avec un palindrome mixte de majuscules et minuscules
        assertTrue(Palindrome.isPalindrome("Eva, can I see bees in a cave?"));

        // Test avec une chaîne non palindrome
        assertFalse(Palindrome.isPalindrome("hello"));

        // Test avec une chaîne null
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
    }
}