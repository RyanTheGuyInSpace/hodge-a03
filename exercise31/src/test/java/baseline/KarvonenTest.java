/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenTest {

    @Test
    void calculateKarvonenHeartRate() {
        assertEquals(138, Karvonen.calculateKarvonenHeartRate(22, 65, 55));
    }

    @Test
    void calculateKarvonenHeartRate2() {
        assertEquals(145, Karvonen.calculateKarvonenHeartRate(22, 65, 60));
    }

    @Test
    void calculateKarvonenHeartRate3() {
        assertEquals(151, Karvonen.calculateKarvonenHeartRate(22, 65, 65));
    }
}