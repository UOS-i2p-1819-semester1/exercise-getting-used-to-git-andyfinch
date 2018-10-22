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

public class Task3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task3 task3 = new Task3();
        task3.findMin_Max_Values(in);
    }

    public String findMin_Max_Values(Scanner scanner) {

        List<Double> numberList = new ArrayList<>();

        double enteredValue = -1;
        do
        {
            
            try
            {
                enteredValue = Double.parseDouble(scanner.next());
            } catch (NumberFormatException e)
            {
                throw new IllegalArgumentException("Only numbers allowed!");
            }


            if (enteredValue != -1)
            {
                numberList.add(enteredValue);
            }

            System.out.println("Entered value = " + enteredValue);

        } while (enteredValue != -1);

        double minimumNumber = Collections.min(numberList);
        double maximumNumber = Collections.max(numberList);


        return minimumNumber + " was the smallest number and " + maximumNumber + " was the biggest number";

    }
}
