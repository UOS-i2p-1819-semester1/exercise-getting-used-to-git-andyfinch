package uk.ac.uos.i2p.homeworkweek3;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 22/10/2018
 * Time: 14:07
 */

public class Task4Test {

    @Test
    public void test_Sum_Values() {

        Task4 task4 = new Task4();
        Scanner scanner = new Scanner("1 5 10");
        String result = task4.sumValues(scanner);
        assertEquals("The sum of the values is 16.0", result);

    }

    @Test
    public void test_Sum_Values_Stop_At_Negative() {

        Task4 task4 = new Task4();
        Scanner scanner = new Scanner("1 5 10 -1 55 66");
        String result = task4.sumValues(scanner);
        assertEquals("The sum of the values is 16.0", result);

    }

    @Test
    public void test_Sum_Values_Exceed_1024() {

        Task4 task4 = new Task4();
        Scanner scanner = new Scanner("1000 23 1 1 10");
        String result = task4.sumValues(scanner);
        assertEquals("The sum of the values is 1025.0", result);

    }

    @Test
    public void test_Sum_Values_Non_Numeric() {

        Task4 task4 = new Task4();
        Scanner scanner = new Scanner("A B C");
        String result = null;
        try
        {
            result = task4.sumValues(scanner);
            fail("Shouldn't get here.");
        } catch (IllegalArgumentException e)
        {
            assertEquals("Only numbers allowed!", e.getMessage());
        }

    }

    @Test
    public void test_Sum_Values_Alpha_Numeric() {

        Task4 task4 = new Task4();
        Scanner scanner = new Scanner("A 10 C 5");
        String result = null;
        try
        {
            result = task4.sumValues(scanner);
            fail("Shouldn't get here.");
        } catch (IllegalArgumentException e)
        {
            assertEquals("Only numbers allowed!", e.getMessage());
        }

    }

    @Test
    public void test_Sum_Values_Decimals() {

        Task4 task4 = new Task4();
        Scanner scanner = new Scanner("1.25 10.10 8.99 50.25");
        String result = task4.sumValues(scanner);
        assertEquals("The sum of the values is 70.59", result);

    }
}
