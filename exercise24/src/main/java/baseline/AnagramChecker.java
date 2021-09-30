package baseline;

import java.util.Arrays;

public class AnagramChecker {
    /** Compares two strings to determine whether they are anagrams of each other
     *
     * @param a First string to compare
     * @param b Second string to compare
     * @return True if the two strings are anagrams, false otherwise
     */
    public static boolean isAnagram(String a, String b) {

        // If the two strings aren't the same length, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        return Arrays.equals(aArray, bArray);
    }
}
