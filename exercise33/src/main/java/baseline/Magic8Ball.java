/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

public class Magic8Ball {

    private static final String[] MagicResponses = { "Yes.", "No.", "Maybe.", "Ask again later." };

    /**
     * Gets a response from the Magic8Ball
     * @param n The number to use to get a response from the Magic8Ball
     * @return A response from the Magic8Ball
     */
    public static String getResponse(int n) {
        return MagicResponses[n];
    }
}
