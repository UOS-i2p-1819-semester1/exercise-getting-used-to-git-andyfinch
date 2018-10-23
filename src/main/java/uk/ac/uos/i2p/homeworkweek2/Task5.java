package uk.ac.uos.i2p.homeworkweek2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 23/10/2018
 * Time: 09:27
 */

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task5 task5 = new Task5();
        task5.showPowers(in);
    }


    public double showPowers(Scanner scanner) {

        double enteredValue = 0;

        while (scanner.hasNext() )
        {
            enteredValue = scanner.nextDouble();
            if ( enteredValue <= 0)
            {
                System.out.println("please enter a positive integer");

            }
            else
            {
                break;
            }



        }

        int sum = 0;
        for (int i = 0; i < 21; i++)
        {

            sum += Math.pow(enteredValue, i);
            System.out.println(enteredValue + " to the power of " + i + " = " + Math.pow(enteredValue, i));

        }

        return sum;


    }
}
