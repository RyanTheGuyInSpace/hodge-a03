/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.*;

public class PasswordGenerator {

    private static Random rand = new Random();

    /**
     * Possible letters for the password
     */
    private static List<Character> letters = new LinkedList<Character>(Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
    ));

    /**
     * Possible special characters for the password
     */
    private static List<Character> specialChars = new LinkedList<Character>(Arrays.asList(
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')'
    ));

    /**
     * Possible numbers for the password
     */
    private static List<Character> numbers = new LinkedList<Character>(Arrays.asList(
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

        List<Character> pw = new LinkedList<>();

        for (int i = 0; i < (length - numNumbers) - numSpecialChars ; i++) {
            pw.add(letters.get(rand.nextInt(letters.size() - 1)));
        }

        for (int j = 0; j < numNumbers; j++) {
            pw.add(numbers.get(rand.nextInt(numbers.size() - 1)));
        }

        for (int j = 0; j < numSpecialChars; j++) {
            pw.add(specialChars.get(rand.nextInt(specialChars.size() - 1)));
        }

        Collections.shuffle(pw);

        StringBuilder builder = new StringBuilder();

        for (char i : pw) {
            builder.append(i);
        }

        return new String(builder.toString());
    }
}
