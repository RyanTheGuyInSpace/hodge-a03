/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void generatePassword() {
        assertEquals(8, PasswordGenerator.generatePassword(8, 2, 4).length());
    }

    @Test
    void generatePassword2() {
        assertEquals(16, PasswordGenerator.generatePassword(16, 5, 7).length());
    }

    @Test
    void generatePassword3() {
        assertEquals(32, PasswordGenerator.generatePassword(32, 20, 10).length());
    }
}