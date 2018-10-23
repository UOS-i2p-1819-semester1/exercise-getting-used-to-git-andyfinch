package uk.ac.uos.i2p.homeworkweek3;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


public class Task2Test {

    /*Write a short program that computes areas of different shapes where user specifies first the desired shape
    - T for triangle, S for square, R for rectangle, and C for Circle - and program then acquires necessary dimensions from user.
    Program should be coded in two versions, one using nested if and the other a case construct.*/

    @Test
    void testCircleArea() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("C 10");
        double area = task2.getShapeArea(scanner);
        assertEquals(314.16, area);

        scanner = new Scanner("C 10");
        area = task2.getShapeArea(scanner, false);
        assertEquals(314.16, area);

    }

    @Test
    void testCircleAreaDoubleRadius() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("C 10.5");
        double area = task2.getShapeArea(scanner);
        assertEquals(346.36, area);
        scanner = new Scanner("C 10.5");
        area = task2.getShapeArea(scanner,false);
        assertEquals(346.36, area);

    }

    @Test
    void testCircleArea0() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("C 0");
        double area = task2.getShapeArea(scanner);
        assertEquals(0, area);
        scanner = new Scanner("C 0");
        area = task2.getShapeArea(scanner,false);
        assertEquals(0, area);

    }

    @Test
    void testSquareArea() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("S 10");
        double area = task2.getShapeArea(scanner);
        assertEquals(100, area);
        scanner = new Scanner("S 10");
        area = task2.getShapeArea(scanner,false);
        assertEquals(100, area);

    }

    @Test
    void testSquareAreaDoubleRadius() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("S 10.5");
        double area = task2.getShapeArea(scanner);
        assertEquals(110.25, area);

        scanner = new Scanner("S 10.5");
        area = task2.getShapeArea(scanner, false);
        assertEquals(110.25, area);

    }

    @Test
    void SquareArea0() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("S 0");
        double area = task2.getShapeArea(scanner);
        assertEquals(0, area);

        scanner = new Scanner("S 0");
        area = task2.getShapeArea(scanner, false);
        assertEquals(0, area);

    }

    @Test
    void testRectangleArea() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("R 10 5");
        double area = task2.getShapeArea(scanner);
        assertEquals(50, area);

        scanner = new Scanner("R 10 5");
        area = task2.getShapeArea(scanner, false);
        assertEquals(50, area);

    }

    @Test
    void testRectangleAreaDoubleRadius() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("R 10.5 5.5");
        double area = task2.getShapeArea(scanner);
        assertEquals(57.75, area);

        scanner = new Scanner("R 10.5 5.5");
        area = task2.getShapeArea(scanner, false);
        assertEquals(57.75, area);

    }

    @Test
    void testRectangleArea0() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("R 10 0");
        double area = task2.getShapeArea(scanner);
        assertEquals(0, area);

        scanner = new Scanner("R 10 0");
        area = task2.getShapeArea(scanner, false);
        assertEquals(0, area);

    }

    @Test
    void testTriangleArea() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("T 10 5");
        double area = task2.getShapeArea(scanner);
        assertEquals(25, area);

        scanner = new Scanner("T 10 5");
        area = task2.getShapeArea(scanner, false);
        assertEquals(25, area);

    }

    @Test
    void testTriangleAreaDoubleRadius() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("T 10.5 5.5");
        double area = task2.getShapeArea(scanner);
        assertEquals(28.88, area);

        scanner = new Scanner("T 10.5 5.5");
        area = task2.getShapeArea(scanner,false);
        assertEquals(28.88, area);

    }

    @Test
    void testTriangleArea0() {

        Task2 task2 = new Task2();
        Scanner scanner = new Scanner("T 10 0");
        double area = task2.getShapeArea(scanner);
        assertEquals(0, area);

        scanner = new Scanner("T 10 0");
        area = task2.getShapeArea(scanner,false);
        assertEquals(0, area);

    }
}
