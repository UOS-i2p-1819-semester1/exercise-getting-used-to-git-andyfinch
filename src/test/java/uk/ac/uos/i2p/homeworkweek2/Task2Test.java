package uk.ac.uos.i2p.homeworkweek2;

import org.junit.jupiter.api.Test;

public class Task2Test {

    /*Write a short program that computes areas of different shapes where user specifies first the desired shape
    - T for triangle, S for square, R for rectangle, and C for Circle - and program then acquires necessary dimensions from user.
    Program should be coded in two versions, one using nested if and the other a case construct.*/

    @Test
    void name() {

        Task2 task2 = new Task2();
        task2.dimensionsUsingIf("S");
    }
}
