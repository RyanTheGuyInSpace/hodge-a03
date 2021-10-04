/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution37 {
    public static void main(String[] args) {
        // Prompt the user for a minimum length of the password
        // Prompt the user for the number of special characters to include in the password
        // Prompt the user for the number of numbers to include in the password
        // Generate a password and print it back to the user

        Scanner scan = new Scanner(System.in);

        System.out.println("What's the minimum length?");

        int minLength = scan.nextInt();

        System.out.println("How many special characters? ");

        int specialChars = scan.nextInt();

        System.out.println("How many numbers? ");

        int numNumbers = scan.nextInt();

        String password = PasswordGenerator.generatePassword(minLength, specialChars, numNumbers);

        System.out.printf("Your password is %s", password);
    }
}
