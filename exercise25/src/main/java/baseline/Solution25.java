package baseline;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        // Prompt the user for a password to test the strength of
        // Test the strength of the password
        // Print the result of the password's strength

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a password to validate: ");

        String password = scan.nextLine();

        int result = PasswordValidator.passwordValidate(password);

        String strength = "";

        switch (result) {
            case 0:
                strength = "n unknown strength";
                break;
            case 1:
                strength = " very weak";
                break;
            case 2:
                strength = " weak";
                break;
            case 3:
                strength = " strong";
                break;
            case 4:
                strength = " very strong";
                break;
        }

        System.out.printf("The password '%s' is a%s password.", password, strength);

        scan.close();
    }
}
