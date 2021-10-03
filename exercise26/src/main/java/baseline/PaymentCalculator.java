/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

public class PaymentCalculator {

    /**
     * The amount of money to start from.
     */
    private double startingBalance;

    /**
     * How much interest the starting balance accrues, expressed as a percent.
     */
    private double interestRate;

    /**
     * The amount that will be paid toward the balance monthly.
     */
    private double monthlyPaymentAmount;

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setMonthlyPaymentAmount(double monthlyPaymentAmount) {
        this.monthlyPaymentAmount = monthlyPaymentAmount;
    }

    /**
     * Calculates how many months it will take to pay off a credit card with the given starting balance,
     * interest rate and monthly payment amount.
     *
     * Formula
     * n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
     *
     * @return The number of months it will take to pay off the card.
     */
    public int calculateMonthsToPayOff() {

        double months;

        months = -((double)1 / 30) * Math.log(1 + (this.startingBalance / this.monthlyPaymentAmount)
            * (1 - (Math.pow(1 + ((this.interestRate / 365) / 100), 30)))) / Math.log(1 + ((this.interestRate / 365) / 100));

        return (int)Math.ceil(months);
    }
}
