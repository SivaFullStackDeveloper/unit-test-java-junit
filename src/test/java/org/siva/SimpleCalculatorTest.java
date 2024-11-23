package org.siva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        assertEquals(4,simpleCalculator.add(2,2));
    }
    @Test
    void add2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        assertEquals(5,simpleCalculator.add(2,3));
    }
}