/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

import static baseline.AnagramChecker.isAnagram;

public class Solution24 {
    public static void main(String[] args) {

        // Print a message that explains to the user that we're going to detect anagrams
        // Prompt the user for two strings and store them
        // Compare the strings to determine whether they are anagrams of each other
        // Print whether the two strings are anagrams or not

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string: ");

        String a = scan.nextLine();

        System.out.println("Enter the second string:");

        String b = scan.nextLine();

        if (isAnagram(a, b)) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", a, b);
        } else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", a, b);
        }
    }


}
