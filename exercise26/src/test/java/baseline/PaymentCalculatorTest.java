/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsToPayOff() {

        PaymentCalculator calculator = new PaymentCalculator();

        calculator.setStartingBalance(5000);
        calculator.setInterestRate(12);
        calculator.setMonthlyPaymentAmount(100);

        assertEquals(70, calculator.calculateMonthsToPayOff());
    }
}