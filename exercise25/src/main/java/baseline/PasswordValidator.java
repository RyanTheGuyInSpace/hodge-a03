package baseline;

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

        return PasswordStrength.UNKNOWN_STRENGTH;
    }
}
