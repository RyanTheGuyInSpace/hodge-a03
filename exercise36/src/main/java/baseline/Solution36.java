/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        // Loop to ask the user for times to add to the times list
        // Add each input time into the times list
        // Stop accepting input when the user enters "done"
        // When the loop ends, print out the list of times as a comma-separated
        // list of values
        // After printing the list of times, print out the avg, max, min and std

        ResponseTimeSet set = new ResponseTimeSet();

        while(true) {

            System.out.println("Enter a number: ");

            Scanner scan = new Scanner(System.in);

            String response = scan.nextLine();

            try {

                if (response.equalsIgnoreCase("done")) {
                    break;
                }

                set.addTime(Double.parseDouble(response));
                continue;

            } catch (Exception e) {
                System.out.println("Please enter a valid number.");

                continue;
            }

        }

        set.printTimes();

        System.out.printf("The average is %.2f%n", set.avg());
        System.out.printf("The minimum is %.2f%n", set.min());
        System.out.printf("The maximum is %.2f%n", set.max());
        System.out.printf("The standard deviation is %.2f%n", set.std());

    }
}
