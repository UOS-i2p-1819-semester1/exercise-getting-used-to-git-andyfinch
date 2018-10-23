package uk.ac.uos.i2p.homeworkweek2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 22/10/2018
 * Time: 14:07
 */

public class Task6Test {

    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @BeforeEach
    void redirectSystemOutStream() {

        originalSystemOut = System.out;

        // given
        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }

    @AfterEach
    void restoreSystemOutStream() {
        System.setOut(originalSystemOut);
    }


    @Test
    public void test_Sum_Values() {

        Task6 task6 = new Task6();
        int result = task6.timeTables();
        assertEquals(6084, result);
        assertEquals("Timestable for 1 X 1 = 1\r\n" +
                "Timestable for 1 X 2 = 2\r\n" +
                "Timestable for 1 X 3 = 3\r\n" +
                "Timestable for 1 X 4 = 4\r\n" +
                "Timestable for 1 X 5 = 5\r\n" +
                "Timestable for 1 X 6 = 6\r\n" +
                "Timestable for 1 X 7 = 7\r\n" +
                "Timestable for 1 X 8 = 8\r\n" +
                "Timestable for 1 X 9 = 9\r\n" +
                "Timestable for 1 X 10 = 10\r\n" +
                "Timestable for 1 X 11 = 11\r\n" +
                "Timestable for 1 X 12 = 12\r\n" +
                "Timestable for 2 X 1 = 2\r\n" +
                "Timestable for 2 X 2 = 4\r\n" +
                "Timestable for 2 X 3 = 6\r\n" +
                "Timestable for 2 X 4 = 8\r\n" +
                "Timestable for 2 X 5 = 10\r\n" +
                "Timestable for 2 X 6 = 12\r\n" +
                "Timestable for 2 X 7 = 14\r\n" +
                "Timestable for 2 X 8 = 16\r\n" +
                "Timestable for 2 X 9 = 18\r\n" +
                "Timestable for 2 X 10 = 20\r\n" +
                "Timestable for 2 X 11 = 22\r\n" +
                "Timestable for 2 X 12 = 24\r\n" +
                "Timestable for 3 X 1 = 3\r\n" +
                "Timestable for 3 X 2 = 6\r\n" +
                "Timestable for 3 X 3 = 9\r\n" +
                "Timestable for 3 X 4 = 12\r\n" +
                "Timestable for 3 X 5 = 15\r\n" +
                "Timestable for 3 X 6 = 18\r\n" +
                "Timestable for 3 X 7 = 21\r\n" +
                "Timestable for 3 X 8 = 24\r\n" +
                "Timestable for 3 X 9 = 27\r\n" +
                "Timestable for 3 X 10 = 30\r\n" +
                "Timestable for 3 X 11 = 33\r\n" +
                "Timestable for 3 X 12 = 36\r\n" +
                "Timestable for 4 X 1 = 4\r\n" +
                "Timestable for 4 X 2 = 8\r\n" +
                "Timestable for 4 X 3 = 12\r\n" +
                "Timestable for 4 X 4 = 16\r\n" +
                "Timestable for 4 X 5 = 20\r\n" +
                "Timestable for 4 X 6 = 24\r\n" +
                "Timestable for 4 X 7 = 28\r\n" +
                "Timestable for 4 X 8 = 32\r\n" +
                "Timestable for 4 X 9 = 36\r\n" +
                "Timestable for 4 X 10 = 40\r\n" +
                "Timestable for 4 X 11 = 44\r\n" +
                "Timestable for 4 X 12 = 48\r\n" +
                "Timestable for 5 X 1 = 5\r\n" +
                "Timestable for 5 X 2 = 10\r\n" +
                "Timestable for 5 X 3 = 15\r\n" +
                "Timestable for 5 X 4 = 20\r\n" +
                "Timestable for 5 X 5 = 25\r\n" +
                "Timestable for 5 X 6 = 30\r\n" +
                "Timestable for 5 X 7 = 35\r\n" +
                "Timestable for 5 X 8 = 40\r\n" +
                "Timestable for 5 X 9 = 45\r\n" +
                "Timestable for 5 X 10 = 50\r\n" +
                "Timestable for 5 X 11 = 55\r\n" +
                "Timestable for 5 X 12 = 60\r\n" +
                "Timestable for 6 X 1 = 6\r\n" +
                "Timestable for 6 X 2 = 12\r\n" +
                "Timestable for 6 X 3 = 18\r\n" +
                "Timestable for 6 X 4 = 24\r\n" +
                "Timestable for 6 X 5 = 30\r\n" +
                "Timestable for 6 X 6 = 36\r\n" +
                "Timestable for 6 X 7 = 42\r\n" +
                "Timestable for 6 X 8 = 48\r\n" +
                "Timestable for 6 X 9 = 54\r\n" +
                "Timestable for 6 X 10 = 60\r\n" +
                "Timestable for 6 X 11 = 66\r\n" +
                "Timestable for 6 X 12 = 72\r\n" +
                "Timestable for 7 X 1 = 7\r\n" +
                "Timestable for 7 X 2 = 14\r\n" +
                "Timestable for 7 X 3 = 21\r\n" +
                "Timestable for 7 X 4 = 28\r\n" +
                "Timestable for 7 X 5 = 35\r\n" +
                "Timestable for 7 X 6 = 42\r\n" +
                "Timestable for 7 X 7 = 49\r\n" +
                "Timestable for 7 X 8 = 56\r\n" +
                "Timestable for 7 X 9 = 63\r\n" +
                "Timestable for 7 X 10 = 70\r\n" +
                "Timestable for 7 X 11 = 77\r\n" +
                "Timestable for 7 X 12 = 84\r\n" +
                "Timestable for 8 X 1 = 8\r\n" +
                "Timestable for 8 X 2 = 16\r\n" +
                "Timestable for 8 X 3 = 24\r\n" +
                "Timestable for 8 X 4 = 32\r\n" +
                "Timestable for 8 X 5 = 40\r\n" +
                "Timestable for 8 X 6 = 48\r\n" +
                "Timestable for 8 X 7 = 56\r\n" +
                "Timestable for 8 X 8 = 64\r\n" +
                "Timestable for 8 X 9 = 72\r\n" +
                "Timestable for 8 X 10 = 80\r\n" +
                "Timestable for 8 X 11 = 88\r\n" +
                "Timestable for 8 X 12 = 96\r\n" +
                "Timestable for 9 X 1 = 9\r\n" +
                "Timestable for 9 X 2 = 18\r\n" +
                "Timestable for 9 X 3 = 27\r\n" +
                "Timestable for 9 X 4 = 36\r\n" +
                "Timestable for 9 X 5 = 45\r\n" +
                "Timestable for 9 X 6 = 54\r\n" +
                "Timestable for 9 X 7 = 63\r\n" +
                "Timestable for 9 X 8 = 72\r\n" +
                "Timestable for 9 X 9 = 81\r\n" +
                "Timestable for 9 X 10 = 90\r\n" +
                "Timestable for 9 X 11 = 99\r\n" +
                "Timestable for 9 X 12 = 108\r\n" +
                "Timestable for 10 X 1 = 10\r\n" +
                "Timestable for 10 X 2 = 20\r\n" +
                "Timestable for 10 X 3 = 30\r\n" +
                "Timestable for 10 X 4 = 40\r\n" +
                "Timestable for 10 X 5 = 50\r\n" +
                "Timestable for 10 X 6 = 60\r\n" +
                "Timestable for 10 X 7 = 70\r\n" +
                "Timestable for 10 X 8 = 80\r\n" +
                "Timestable for 10 X 9 = 90\r\n" +
                "Timestable for 10 X 10 = 100\r\n" +
                "Timestable for 10 X 11 = 110\r\n" +
                "Timestable for 10 X 12 = 120\r\n" +
                "Timestable for 11 X 1 = 11\r\n" +
                "Timestable for 11 X 2 = 22\r\n" +
                "Timestable for 11 X 3 = 33\r\n" +
                "Timestable for 11 X 4 = 44\r\n" +
                "Timestable for 11 X 5 = 55\r\n" +
                "Timestable for 11 X 6 = 66\r\n" +
                "Timestable for 11 X 7 = 77\r\n" +
                "Timestable for 11 X 8 = 88\r\n" +
                "Timestable for 11 X 9 = 99\r\n" +
                "Timestable for 11 X 10 = 110\r\n" +
                "Timestable for 11 X 11 = 121\r\n" +
                "Timestable for 11 X 12 = 132\r\n" +
                "Timestable for 12 X 1 = 12\r\n" +
                "Timestable for 12 X 2 = 24\r\n" +
                "Timestable for 12 X 3 = 36\r\n" +
                "Timestable for 12 X 4 = 48\r\n" +
                "Timestable for 12 X 5 = 60\r\n" +
                "Timestable for 12 X 6 = 72\r\n" +
                "Timestable for 12 X 7 = 84\r\n" +
                "Timestable for 12 X 8 = 96\r\n" +
                "Timestable for 12 X 9 = 108\r\n" +
                "Timestable for 12 X 10 = 120\r\n" +
                "Timestable for 12 X 11 = 132\r\n" +
                "Timestable for 12 X 12 = 144\r\n", systemOutContent.toString());

    }

    
}
