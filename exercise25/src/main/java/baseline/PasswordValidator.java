package baseline;

import java.util.regex.Pattern;

public class PasswordValidator {

    /**
     * Tests the strength of the provided password and prints the result to the console.
     *
     * A very weak password contains only numbers and is fewer than eight characters
     * A weak password contains only letters and is fewer than eight characters.
     * A strong password contains letters and at least one number and is at least eight characters.
     * A very strong password contains letters, numbers, and special characters and is at least eight characters.
     *
     * If the password is fewer than eight characters, it's weak at best. If it's
     * only numbers, it's very weak. If it has letters and numbers, it's of
     * unknown strength. Otherwise, it's just weak.
     *
     * If the password is longer than eight characters, it's strong at worst. If it
     * has letters and at least one number, it's strong. If it's
     * strong, test for special characters to see if it's very strong.
     *
     * Use regex to check whether the string uses strictly letters, numbers,
     * and special characters.
     * @param password The password to test the strength of.
     * @return 0 = unknown strength,1 = very weak, 2 = weak,
     *         3 = strong, 4 = very strong.
     */
    public static int passwordValidate(String password) {

        // Password is at strong or very strong
        if (password.length() >= 8) {

            if (hasNumbers(password) && hasLetters(password) && !hasSpecialCharacters(password)) {
                return PasswordStrength.STRONG;
            } else if (hasNumbers(password) && hasLetters(password) && hasSpecialCharacters(password)) {
                return PasswordStrength.VERY_STRONG;
            }

        } else {
            // Password is weak or very weak
            if (isNumbersOnly(password)) {
                return PasswordStrength.VERY_WEAK;
            } else if (isLettersOnly(password)) {
                return PasswordStrength.WEAK;
            }
        }

        return PasswordStrength.UNKNOWN_STRENGTH;
    }

    public static boolean isNumbersOnly(String s) {
        if(Pattern.matches("\\d+", s) && !Pattern.matches("[a-zA-Z]+", s)) {
            return true;
        }

        return false;
    }

    public static boolean isLettersOnly(String s) {
        if(Pattern.matches("[a-zA-Z]+", s) && !Pattern.matches("\\d+", s)) {
            return true;
        }

        return false;
    }

    public static boolean isSpecialCharactersOnly(String s) {
        if(Pattern.matches("[^a-zA-Z0-9]+", s)) {
            return true;
        }

        return false;
    }

    public static boolean hasSpecialCharacters(String s) {
        if (Pattern.matches(".*[^a-zA-Z0-9]+.*", s)) {
            return true;
        }

        return false;
    }

    public static boolean hasLettersAndNumbers(String s) {
        if(hasLetters(s) && hasNumbers(s)) {
            return true;
        }

        return false;
    }

    public static boolean hasLetters(String s) {
        if(Pattern.matches(".*[a-zA-Z]+.*", s)) {
            return true;
        }

        return false;
    }

    public static boolean hasNumbers(String s) {
        if(Pattern.matches(".*[0-9]+.*", s)) {
            return true;
        }

        return false;
    }
}
