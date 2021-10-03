/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

public class MultiplicationTable {
    /**
     * Prints out multiples 1 - 12 for the given number
     * @param n The number whose multiples will be printed from 1 - 12
     */
    public static String printLine(int n) {

        StringBuilder builder = new StringBuilder();

        for(int i = 1; i <= 12; i++) {
            builder.append(String.format("%4d", i * n));
        }

        return builder.toString();
    }
}
