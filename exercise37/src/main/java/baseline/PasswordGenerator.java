package baseline;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PasswordGenerator {
    /**
     * Possible letters for the password
     */
    private List<Character> letters = new LinkedList<Character>(Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
    ));

    /**
     * Possible special characters for the password
     */
    private List<Character> specialChars = new LinkedList<Character>(Arrays.asList(
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')'
    ));

    /**
     * Possible numbers for the password
     */
    private List<Character> numbers = new LinkedList<Character>(Arrays.asList(
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    ));

    /**
     * Generates a password with the given requirements
     * @param length The length that the generated password will be
     * @param numNumbers The number of digits that the generated password will contain
     * @param numSpecialChars The number of special characters that the generated password will contain
     * @return A randomly generated secure password
     */
    public static String generatePassword(int length, int numNumbers, int numSpecialChars) {
        return "";
    }
}
