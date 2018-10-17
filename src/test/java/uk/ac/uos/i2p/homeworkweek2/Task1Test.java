package uk.ac.uos.i2p.homeworkweek2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    /*Write a short program which takes two numbers and outputs them in ascending order.
    if the numbers are equal, the program should just output one value and a message regarding their equality.
    use if-else construct for this*/

    @Test
    void test_Non_Equal_Numbers_1_2() {

        Task1 task1 = new Task1();
        String result = task1.sort(1, 2);
        assertEquals("1, 2", result);

    }

    @Test
    void test_Non_Equal_Numbers_2_1() {

        Task1 task1 = new Task1();
        String result = task1.sort(2, 1);
        assertEquals("1, 2", result);

    }

    @Test
    void test_Non_Equal_Numbers_Minus1_1() {

        Task1 task1 = new Task1();
        String result = task1.sort(-1, 1);
        assertEquals("-1, 1", result);

    }

    @Test
    void test_Non_Equal_Numbers_Low_High_Int_Range() {

        Task1 task1 = new Task1();
        String result = task1.sort(-2147483648, 2147483647);
        assertEquals("-2147483648, 2147483647", result);

    }

    @Test
    void test_Equal_Numbers_1_1() {

        Task1 task1 = new Task1();
        String result = task1.sort(1, 1);
        assertEquals("1, The 2 numbers are equal", result);

    }

    @Test
    void test_Equal_Numbers_0_0() {

        Task1 task1 = new Task1();
        String result = task1.sort(0, 0);
        assertEquals("0, The 2 numbers are equal", result);

    }


}