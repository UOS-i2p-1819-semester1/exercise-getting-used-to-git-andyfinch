package uk.ac.uos.i2p.homeworkweek3;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 22/10/2018
 * Time: 14:09
 */

public class Task6 {


    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.timeTables();
    }

    public int timeTables() {

        int sum = 0;
        for (int i = 1; i < 13; i++)
        {
            for (int j = 1; j < 13; j++)
            {

                sum+=i*j;
                System.out.println("Timestable for " + i + " X " + j + " = " + i*j);

            }

        }

        return sum;

    }
}
