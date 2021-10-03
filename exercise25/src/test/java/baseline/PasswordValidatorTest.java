/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    /*@Test
    void passwordValidate() {
    }*/

    @Test
    void isNumbersOnly() {
        assertTrue(PasswordValidator.isNumbersOnly("98387473823"));
    }

    @Test
    void isNumbersOnly2() {
        assertFalse(PasswordValidator.isNumbersOnly("746sjj36"));
    }

    @Test
    void isNumbersOnly3() {
        assertFalse(PasswordValidator.isNumbersOnly("kufhiwuh"));
    }

    @Test
    void isNumbersOnly4() {
        assertFalse(PasswordValidator.isNumbersOnly("*&#$%^*#$"));
    }

    @Test
    void isLettersOnly() {
        assertTrue(PasswordValidator.isLettersOnly("iuarighrg"));
    }

    @Test
    void isLettersOnly2() {
        assertFalse(PasswordValidator.isLettersOnly("249847284"));
    }

    @Test
    void isLettersOnly3() {
        assertFalse(PasswordValidator.isLettersOnly("487hf74aa"));
    }

    @Test
    void isLettersOnly4() {
        assertFalse(PasswordValidator.isLettersOnly("@&^#&^%$"));
    }

    @Test
    void isSpecialCharactersOnly() {
        assertTrue(PasswordValidator.isSpecialCharactersOnly("#&*%$=-=+-*/+"));
    }

    @Test
    void isSpecialCharactersOnly2() {
        assertFalse(PasswordValidator.isSpecialCharactersOnly("249847284"));
    }

    @Test
    void isSpecialCharactersOnly3() {
        assertFalse(PasswordValidator.isSpecialCharactersOnly("uhigrAIHU6467@&^"));
    }

    @Test
    void isSpecialCharactersOnly4() {
        assertFalse(PasswordValidator.isSpecialCharactersOnly("rugheirugh"));
    }

    @Test
    void hasLettersAndNumbers() {
        assertTrue(PasswordValidator.hasLettersAndNumbers("leiruh87246"));
    }

    @Test
    void hasLettersAndNumbers2() {
        assertFalse(PasswordValidator.hasLettersAndNumbers("249847284"));
    }

    @Test
    void hasLettersAndNumbers3() {
        assertFalse(PasswordValidator.hasLettersAndNumbers("wrfuhruhla"));
    }

    @Test
    void hasLettersAndNumbers4() {
        assertFalse(PasswordValidator.hasLettersAndNumbers("*&#^%-+*/*"));
    }

    @Test
    void hasLetters() {
        assertTrue(PasswordValidator.hasLetters("rwughwr"));
    }

    @Test
    void hasLetters2() {
        assertFalse(PasswordValidator.hasLetters("2837844"));
    }

    @Test
    void hasLetters3() {
        assertFalse(PasswordValidator.hasLetters("#&(^%#/*+-"));
    }

    @Test
    void hasLetters4() {
        assertTrue(PasswordValidator.hasLetters("leiruh87246"));
    }

    @Test
    void hasSpecialCharacters() {
        assertTrue(PasswordValidator.hasSpecialCharacters("*&#%fhyri"));
    }

    @Test
    void hasSpecialCharacters2() {
        assertFalse(PasswordValidator.hasSpecialCharacters("erwguohiwr"));
    }

    @Test
    void hasSpecialCharacters3() {
        assertFalse(PasswordValidator.hasSpecialCharacters("43976824"));
    }

    @Test
    void hasSpecialCharacters4() {
        assertTrue(PasswordValidator.hasSpecialCharacters("*&#%*&%*/-+"));
    }

    @Test
    void miscTest() {
        assertTrue(PasswordValidator.hasNumbers("1337h@xor!"));
    }

    @Test
    void miscTest2() {
        assertTrue(PasswordValidator.hasLetters("1337h@xor!"));
    }

    @Test
    void miscTest3() {
        assertTrue(PasswordValidator.hasSpecialCharacters("1337h@xor!"));
    }

    @Test
    void testPasswordValidate() {
        assertEquals(0, PasswordValidator.passwordValidate("hooplah!"));
    }

    @Test
    void testPasswordValidate1() {
        assertEquals(1, PasswordValidator.passwordValidate("12345"));
    }

    @Test
    void testPasswordValidate2() {
        assertEquals(2, PasswordValidator.passwordValidate("abcdef"));
    }

    @Test
    void testPasswordValidate3() {
        assertEquals(3, PasswordValidator.passwordValidate("abc123xyz"));
    }

    @Test
    void testPasswordValidate4() {
        assertEquals(4, PasswordValidator.passwordValidate("1337h@xor!"));
    }


}