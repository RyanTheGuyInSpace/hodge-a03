package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution24Test {

    @Test
    void isAnagram() {
        Assertions.assertTrue(AnagramChecker.isAnagram("forty five", "over fifty"));
        Assertions.assertTrue(AnagramChecker.isAnagram("restful", "fluster"));
        Assertions.assertFalse(AnagramChecker.isAnagram("football", "doorstep"));
        Assertions.assertFalse(AnagramChecker.isAnagram("person", "guy"));
    }
}