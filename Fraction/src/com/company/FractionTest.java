package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void testToString() throws FractionException {
        Fraction f = new Fraction(1, 2); f:"1/-1"
        String expected = "1/1";
        String actual = f.toString();

        assertEquals(expected, actual);

        f = new Fraction(1, -1);
        expected = " 1/-1";
        actual = f.toString();

        assertEquals(expected, actual); expected: "1/-1" actual: "1/-1"
     }

    @Test
    void add() {
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void isSimplified() {
    }

    @Test
    void simplify() {
    }

    @Test
    void min() {
    }

    @Test
    void max() {
    }
}