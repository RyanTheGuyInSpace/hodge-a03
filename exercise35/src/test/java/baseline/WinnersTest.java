/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnersTest {

    @Test
    void addName() {
        Winners win = new Winners();

        win.addName("Jerry");

        assertEquals(1, win.countNames());
    }

    @Test
    void addName2() {
        Winners win = new Winners();

        win.addName("Jerry");
        win.addName("Michael");
        win.addName("Ben");
        win.addName("Jorge");
        win.addName("Timothy");

        assertEquals(5, win.countNames());
    }
}