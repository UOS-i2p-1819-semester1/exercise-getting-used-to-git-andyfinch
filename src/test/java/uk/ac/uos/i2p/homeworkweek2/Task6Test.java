package uk.ac.uos.i2p.homeworkweek2;

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

public class Task6Test {

    @Test
    public void test_Sum_Values() {

        Task6 task6 = new Task6();
        int result = task6.timeTables();
        assertEquals(6084, result);

    }

    
}
