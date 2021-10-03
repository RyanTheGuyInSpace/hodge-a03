/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        // Prompt the user for their age
        // Prompt the user for their resting heart rate
        // Use try catch loop to ensure that the user cannot continue without entering a number for both
        // Use the Karvonen Heart Rate formula to create a table and print it out to the user



        System.out.println("What is your age?");

        int age = -1;
        int restingHeartRate = -1;

        while(true) {

            Scanner scan = new Scanner(System.in);

            try {
                age = scan.nextInt();

                if (age <= 0) {
                    System.out.printf("There's no way you're %d years old. Please enter an actual age.%n", age);

                    continue;
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid age.");

                continue;
            }

            break;
        }

        System.out.println("What is your resting heart rate?");

        while(true) {

            Scanner scan = new Scanner(System.in);

            try {
                restingHeartRate = scan.nextInt();

                if (restingHeartRate <= 0) {
                    System.out.println("If that were true, you'd be dead. Please enter an actual heart rate.");

                    continue;
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid heart rate.");

                continue;
            }

            break;
        }

        System.out.printf(String.format("Resting Pulse: %d%15s%n", restingHeartRate, "Age: " + age));
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        for (int i = 55; i <= 95; i += 5) {
            System.out.printf("%-13s| %-8s%n", i + "%", Karvonen.calculateKarvonenHeartRate(age, restingHeartRate, i) + " bpm");
        }

    }
}
