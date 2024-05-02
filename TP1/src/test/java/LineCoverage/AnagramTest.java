package LineCoverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void isAnagram() {
        Assertions.assertTrue(NewAnagram.isAnagram("haha", "ahah"));
    }
    @Test
    public void isNotAnagram(){
        Assertions.assertFalse(NewAnagram.isAnagram("hakim", "amziane"));
    }
    @Test
    public void isNotAnagramDifferentLength() {
        Assertions.assertFalse(NewAnagram.isAnagram("haaaaa", "ha"));
    }
    @Test

    public void IsAnagramInputNull()
    {
        Assertions.assertThrows(NullPointerException.class,() ->NewAnagram.isAnagram(null, null));
    }

}