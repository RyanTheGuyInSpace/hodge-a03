/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void getResponse() {
        assertEquals("Yes.", Magic8Ball.getResponse(0));
    }

    @Test
    void getResponse2() {
        assertEquals("Ask again later.", Magic8Ball.getResponse(3));
    }
}