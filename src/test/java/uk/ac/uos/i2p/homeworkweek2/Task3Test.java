package uk.ac.uos.i2p.homeworkweek2;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 22/10/2018
 * Time: 14:07
 */

public class Task3Test {

    @Test
    public void testFind_Min_Max_Values() {

        Task3 task3 = new Task3();
        Scanner scanner = new Scanner("1 5 10 -1");
        String result = task3.findMin_Max_Values(scanner);
        assertEquals("1.0 was the smallest number and 10.0 was the biggest number", result);

    }

    @Test
    public void testFind_Min_Max_Values_Big_Range() {

        Task3 task3 = new Task3();
        Scanner scanner = new Scanner("10 5 9 1 5 4 6 1 4 8 1 4 100 12500 100 -1");
        String result = task3.findMin_Max_Values(scanner);
        assertEquals("1.0 was the smallest number and 12500.0 was the biggest number", result);

    }

    @Test
    public void testFind_Min_Max_Values_Non_Numeric() {

        Task3 task3 = new Task3();
        Scanner scanner = new Scanner("A B C");
        String result = null;
        try
        {
            result = task3.findMin_Max_Values(scanner);
            fail("Shouldn't get here.");
        } catch (IllegalArgumentException e)
        {
            assertEquals("Only numbers allowed!", e.getMessage());
        }

    }

    @Test
    public void testFind_Min_Max_Values_Alpha_Numeric() {

        Task3 task3 = new Task3();
        Scanner scanner = new Scanner("A 10 C 5");
        String result = null;
        try
        {
            result = task3.findMin_Max_Values(scanner);
            fail("Shouldn't get here.");
        } catch (IllegalArgumentException e)
        {
            assertEquals("Only numbers allowed!", e.getMessage());
        }

    }

    @Test
    public void testFind_Min_Max_Values_Decimals() {

        Task3 task3 = new Task3();
        Scanner scanner = new Scanner("1.25 10.10 8.99 50.25 -1");
        String result = task3.findMin_Max_Values(scanner);
        assertEquals("1.25 was the smallest number and 50.25 was the biggest number", result);

    }
}
