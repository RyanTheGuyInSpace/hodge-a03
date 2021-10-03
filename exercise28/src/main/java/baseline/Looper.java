/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Looper {

    /**
     * Loops the specified amount of times asking the user for a number from the console and calculating
     * the sum of the numbers that were input by the user.
     * @param numIterations The number of times to ask for a number.
     * @return The sum of the numbers input by the user
     */
    public static int additionLoop(int numIterations) {

        Scanner scan = new Scanner(System.in);

        int result = 0;

        for(int i = 0; i < numIterations; i++) {
            System.out.println("Enter a number: ");

            result += scan.nextInt();
        }

        return result;
    }
}
