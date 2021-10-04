/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        // Loop a prompt for a name until the user leaves the entry blank
        // Store each entry the user adds in a list
        // When the user leaves the entry blank, stop accepting input and pick a
        // random element from the list
        // Print the random element from the list as the "winner"

        Scanner scan = new Scanner(System.in);

        Winners winners = new Winners();

        String newName;

        while(true) {

            System.out.println("Enter a name: ");

            newName = scan.nextLine();

            if (newName.isEmpty() || newName.isBlank()) {
                break;
            }

            winners.addName(newName);

        }

        winners.getWinner();

    }
}
