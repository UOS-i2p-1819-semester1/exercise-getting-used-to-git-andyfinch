package uk.ac.uos.i2p.homeworkweek2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 23/10/2018
 * Time: 09:25
 */

public class Task5Test {

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
    void testShowPowers() {
        Task5 task5 = new Task5();
        Scanner scanner = new Scanner("2");
        double result = task5.showPowers(scanner);
        assertEquals(2097151.0, result);
        assertEquals("2.0 to the power of 0 = 1.0\r\n" +
                "2.0 to the power of 1 = 2.0\r\n" +
                "2.0 to the power of 2 = 4.0\r\n" +
                "2.0 to the power of 3 = 8.0\r\n" +
                "2.0 to the power of 4 = 16.0\r\n" +
                "2.0 to the power of 5 = 32.0\r\n" +
                "2.0 to the power of 6 = 64.0\r\n" +
                "2.0 to the power of 7 = 128.0\r\n" +
                "2.0 to the power of 8 = 256.0\r\n" +
                "2.0 to the power of 9 = 512.0\r\n" +
                "2.0 to the power of 10 = 1024.0\r\n" +
                "2.0 to the power of 11 = 2048.0\r\n" +
                "2.0 to the power of 12 = 4096.0\r\n" +
                "2.0 to the power of 13 = 8192.0\r\n" +
                "2.0 to the power of 14 = 16384.0\r\n" +
                "2.0 to the power of 15 = 32768.0\r\n" +
                "2.0 to the power of 16 = 65536.0\r\n" +
                "2.0 to the power of 17 = 131072.0\r\n" +
                "2.0 to the power of 18 = 262144.0\r\n" +
                "2.0 to the power of 19 = 524288.0\r\n" +
                "2.0 to the power of 20 = 1048576.0\r\n", systemOutContent.toString());
    }

    @Test
    void testShowPowers_Non_Postive() {
        Task5 task5 = new Task5();
        Scanner scanner = new Scanner("0 2");
        double result = task5.showPowers(scanner);
        assertEquals(2097151.0, result);
        assertEquals("please enter a positive integer\r\n" +
                "2.0 to the power of 0 = 1.0\r\n" +
                "2.0 to the power of 1 = 2.0\r\n" +
                "2.0 to the power of 2 = 4.0\r\n" +
                "2.0 to the power of 3 = 8.0\r\n" +
                "2.0 to the power of 4 = 16.0\r\n" +
                "2.0 to the power of 5 = 32.0\r\n" +
                "2.0 to the power of 6 = 64.0\r\n" +
                "2.0 to the power of 7 = 128.0\r\n" +
                "2.0 to the power of 8 = 256.0\r\n" +
                "2.0 to the power of 9 = 512.0\r\n" +
                "2.0 to the power of 10 = 1024.0\r\n" +
                "2.0 to the power of 11 = 2048.0\r\n" +
                "2.0 to the power of 12 = 4096.0\r\n" +
                "2.0 to the power of 13 = 8192.0\r\n" +
                "2.0 to the power of 14 = 16384.0\r\n" +
                "2.0 to the power of 15 = 32768.0\r\n" +
                "2.0 to the power of 16 = 65536.0\r\n" +
                "2.0 to the power of 17 = 131072.0\r\n" +
                "2.0 to the power of 18 = 262144.0\r\n" +
                "2.0 to the power of 19 = 524288.0\r\n" +
                "2.0 to the power of 20 = 1048576.0\r\n", systemOutContent.toString());
    }


}
