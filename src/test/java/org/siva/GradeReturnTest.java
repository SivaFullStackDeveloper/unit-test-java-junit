package org.siva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeReturnTest {

    @Test
    void calculateGradeAPlus() {
        var gradeReturn = new GradeReturn();
        assertEquals("A+",gradeReturn.calculateGrade(90));
    }
    @Test
    void calculateGradeA() {
        var gradeReturn = new GradeReturn();
        assertEquals("A",gradeReturn.calculateGrade(70));
    }
    @Test
    void calculateGradeZero() {
        var gradeReturn = new GradeReturn();
        assertEquals("g",gradeReturn.calculateGrade(0));
    }
    @Test
    void calculateGradeNegative() {
        var gradeReturn = new GradeReturn();
        assertThrows(IllegalArgumentException.class,()->gradeReturn.calculateGrade(-1));
    }
}