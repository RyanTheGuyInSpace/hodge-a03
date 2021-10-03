/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        // Prompt the user to select difficulty 1, 2 or 3
        // Generate a random number for each difficulty.
        // Difficulty 1 = 1 - 10
        // Difficulty 2 = 1 - 100
        // Difficulty 3 = 1 - 1000
        // Loop while asking the user for a guess at the number
        // Each incorrect guess increments a guess counter
        // Each incorrect guess print a hint to user, indicating whether the guess
        // was too high or too low
        // When the user guesses the number correctly, print a success message and the number of
        // incorrect guesses that were made

        int difficulty = -1;
        int guess = -1;
        int numGuesses = -1;
        boolean repeat = true;

        // Main loop to make game repeatable
        while(repeat) {

            System.out.println("Let's play Guess the Number!\n");
            System.out.println("Enter the difficulty level (1, 2, or 3): ");

            numGuesses = 0;

            while(true) {

                Scanner diffSelect = new Scanner(System.in);

                try {
                    difficulty = diffSelect.nextInt();

                    if (difficulty <= 0 || difficulty > 3) {
                        System.out.println("Invalid difficulty. Please select a number between 1 and 3.");

                        continue;
                    }

                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");

                    continue;
                }

                break;
            }

            int targetNum = -1;

            Random rand = new Random();

            if (difficulty == 1) {
                targetNum = rand.nextInt(9) + 1;
            } else if (difficulty == 2) {
                targetNum = rand.nextInt(99) + 1;
            } else {
                targetNum = rand.nextInt(999) + 1;
            }

            System.out.println("I have my number. What's your guess? ");

            while(true) {

                Scanner guesser = new Scanner(System.in);

                try {
                    guess = guesser.nextInt();

                    if (guess <= 0) {
                        System.out.println("Invalid guess. Try again.");
                        numGuesses++;

                        continue;
                    }

                } catch (Exception e) {
                    System.out.println("Invalid guess. Try again.");
                    numGuesses++;

                    continue;
                }

                if (guess > targetNum) {
                    System.out.println("Too high. Guess again.");
                    numGuesses++;

                    continue;
                } else if (guess < targetNum) {
                    System.out.println("Too low. Guess again.");
                    numGuesses++;

                    continue;
                } else {
                    System.out.printf("Correct! You got it in %d guesses!%n", numGuesses);
                }

                break;
            }

            System.out.println("Would you like to play again? Y / N");

            while(true) {

                Scanner playAgain = new Scanner(System.in);

                String play = "";

                try {
                    play = playAgain.nextLine().trim();

                    System.out.println(play);

                    if (!play.equalsIgnoreCase("y") && !play.equalsIgnoreCase("n")) {
                        System.out.println("Invalid input. Please enter Y or N");

                        continue;
                    } else if (play.equalsIgnoreCase("y")) {
                        break;
                    } else if (play.equalsIgnoreCase("n")) {
                        repeat = false;
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("Please enter either Y or N.");

                    continue;
                }

                break;
            }

        }



    }
}
