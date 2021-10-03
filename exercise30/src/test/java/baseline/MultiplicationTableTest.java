/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void testPrintLine() {
        assertEquals("123456789101112", MultiplicationTable.printLine(1).replaceAll("\\s+", ""));
    }

    @Test
    void testPrintLine2() {
        assertEquals("24681012141618202224", MultiplicationTable.printLine(2).replaceAll("\\s+", ""));
    }
}