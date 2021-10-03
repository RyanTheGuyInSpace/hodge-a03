/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        // Ask the user for the rate of return
        // Use a loop along with a try catch block to prevent the program from crashing when an invalid
        // input is made
        // The input CANNOT be zero and MUST be a number

        int rate;

        while(true) {
            System.out.println("What is the rate of return?");

            Scanner scan = new Scanner(System.in);

            try {
                rate = scan.nextInt();

                if (rate == 0) {
                    System.out.println("Sorry, that's not a valid input.");

                    continue;
                }

                System.out.printf("It will take %d years to double your initial investment.", Finance.calculateYearsForDoubleROI(rate));

            } catch (Exception e) {
                System.out.println("Sorry, that's not a valid input.");

                continue;
            }

            break;
        }

    }
}
