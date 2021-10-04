/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponseTimeSetTest {

    @Test
    void avg() {
        ResponseTimeSet set = new ResponseTimeSet();

        set.addTime(5);
        set.addTime(5);
        set.addTime(5);
        set.addTime(5);

        assertEquals(5.0, set.avg());
    }

    @Test
    void max() {
        ResponseTimeSet set = new ResponseTimeSet();

        set.addTime(5);
        set.addTime(10);
        set.addTime(15);
        set.addTime(20);

        assertEquals(20.0, set.max());
    }

    @Test
    void min() {
        ResponseTimeSet set = new ResponseTimeSet();

        set.addTime(5);
        set.addTime(10);
        set.addTime(15);
        set.addTime(20);

        assertEquals(5.0, set.min());
    }

    @Test
    void std() {
        ResponseTimeSet set = new ResponseTimeSet();

        set.addTime(100);
        set.addTime(200);
        set.addTime(1000);
        set.addTime(300);

        assertEquals(353.55, set.std());
    }

    @Test
    void sum() {
        ResponseTimeSet set = new ResponseTimeSet();

        set.addTime(5);
        set.addTime(10);
        set.addTime(15);
        set.addTime(20);

        assertEquals(50.0, set.sum());
    }
}