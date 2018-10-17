package uk.ac.uos.i2p.homeworkweek2;

import java.util.Arrays;

public class Task1 {


    /**
     * Write a short program which takes two numbers and outputs them in ascending order.
     * if the numbers are equal, the program should just output one value and a message regarding their equality.
     * use if-else construct for this
     * @param int1
     * @param int2
     * @return
     */
    public String sort(int int1, int int2) {

        if ( int1 != int2)
        {
            int [] unsortedInts  = new int[]{int1, int2 };
            Arrays.sort(unsortedInts);
            return unsortedInts[0] + ", " + unsortedInts[1];
        }
        else
        {
           return int1 + ", The 2 numbers are equal";
        }

    }
}
