/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

public class Finance {
    /**
     * Calculates how many years it will take for an investment to double given the provided
     * rate of return.
     * @param rate The rate of return on the investment.
     * @return The number of years it will take for the investment to double.
     * years = 72 / rate
     */
    public static int calculateYearsForDoubleROI(int rate) {
        return 72 / rate;
    }
}
