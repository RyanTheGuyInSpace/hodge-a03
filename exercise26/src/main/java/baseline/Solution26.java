/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {

        // Prompt the user for their starting balance
        // Prompt the user for the APR on the card as a percent
        // Prompt the user for the monthly payment they're capable of making
        // Calculate how many months it will take to pay off the card
        // and print it back to the user

        Scanner scan = new Scanner(System.in);

        PaymentCalculator calculator = new PaymentCalculator();

        System.out.println("What is the starting balance?");

        calculator.setStartingBalance(scan.nextDouble());

        System.out.println("What is the APR on the card (as a percent)?");

        calculator.setInterestRate(scan.nextDouble());

        System.out.println("What is the monthly payment you can make?");

        calculator.setMonthlyPaymentAmount(scan.nextDouble());

        System.out.printf("It will take you %d months to pay off this card.", calculator.calculateMonthsToPayOff());
    }
}
