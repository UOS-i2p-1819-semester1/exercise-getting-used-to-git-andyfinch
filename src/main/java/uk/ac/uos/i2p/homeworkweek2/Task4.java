package uk.ac.uos.i2p.homeworkweek2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 22/10/2018
 * Time: 14:09
 */

public class Task4 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task4 task4 = new Task4();
        task4.sumValues(in);
    }

    public String sumValues(Scanner scanner) {

        double sum = 0;

        double enteredValue = 0;
        while (scanner.hasNext())
        {
            
            try
            {
                enteredValue = Double.parseDouble(scanner.next());

                if ( enteredValue < 0 )
                {
                    break;
                }

                sum += enteredValue;

                if (sum > 1024)
                {
                    break;
                }
            } catch (NumberFormatException e)
            {
                throw new IllegalArgumentException("Only numbers allowed!");
            }


            System.out.println("Entered value = " + enteredValue);

        }


        return "The sum of the values is " + sum;

    }
}
