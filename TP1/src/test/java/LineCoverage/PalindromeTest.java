package LineCoverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {
    @Test
    void StringIsPalindrome(){
        Assertions.assertTrue(NewPalindrome.isPalindrome("radar"));
    }
    @Test
    void StringIsNotPalindrome(){
        Assertions.assertFalse(NewPalindrome.isPalindrome("haha"));
    }
    @Test
    void NullStringShouldThrowException(){
        Assertions.assertThrows(NullPointerException.class, ()->NewPalindrome.isPalindrome(null));
    }
}