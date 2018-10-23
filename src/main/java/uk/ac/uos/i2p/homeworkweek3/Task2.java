package uk.ac.uos.i2p.homeworkweek3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task2 {

    /*Write a short program that computes areas of different shapes where user specifies first the desired shape
    - T for triangle, S for square, R for rectangle, and C for Circle - and program then acquires necessary dimensions from user.
    Program should be coded in two versions, one using nested if and the other a case construct.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task2 task2 =new Task2();
        //String shapeType = in.nextLine();
        task2.getShapeArea(in,true);

    }

    public double getShapeArea(Scanner scanner) {
        return getShapeArea(scanner, true);
    }

    public double getShapeArea(Scanner scanner, boolean useIf) {

        String shapeType = scanner.next();

        if (!shapeType.equalsIgnoreCase("C")
                && !shapeType.equalsIgnoreCase("T")
                && !shapeType.equalsIgnoreCase("S")
                && !shapeType.equalsIgnoreCase("R"))
        {
            throw new IllegalArgumentException("Shape type must C, T, S, or R");
        }


        double area = 0;

        if ( useIf) {
            if ("T".equalsIgnoreCase(shapeType)) {
                System.out.println("You entered triangle, please enter the base length");
                double base = scanner.nextDouble();
                System.out.println("Please enter the height");
                double height = scanner.nextDouble();
                area = (base * height) / 2;
                System.out.println("Triangle area is " + roundArea(area));
            } else if ("S".equalsIgnoreCase(shapeType)) {
                System.out.println("You entered Square, please enter the length");
                double length = scanner.nextDouble();
                area = (Math.pow(length, 2));
                System.out.println("Square area is " + roundArea(area));
            } else if ("R".equalsIgnoreCase(shapeType)) {
                System.out.println("You entered Rectangle, please enter the length");
                double length = scanner.nextDouble();
                System.out.println("Please enter the height");
                double height = scanner.nextDouble();
                area = length * height;
                System.out.println("Square area is " + roundArea(area));
            } else if ("C".equalsIgnoreCase(shapeType)) {
                System.out.println("You entered circle, please enter the radius");
                double circleRadius = scanner.nextDouble();
                area = Math.PI * (Math.pow(circleRadius, 2));
                System.out.println("Circle area is " + roundArea(area));

            }
        }
        else
        {
            switch(shapeType) {
                case "T" :
                    System.out.println("You entered triangle, please enter the base length");
                    double base = scanner.nextDouble();
                    System.out.println("Please enter the height");
                    double height = scanner.nextDouble();
                    area = (base * height) / 2;
                    System.out.println("Triangle area is " + roundArea(area));
                    break;
                case "S" :
                    System.out.println("You entered Square, please enter the length");
                    double length = scanner.nextDouble();
                    area = (Math.pow(length, 2));
                    System.out.println("Square area is " + roundArea(area));
                    break;
                case "R" :
                    System.out.println("You entered Rectangle, please enter the length");
                    double rLength = scanner.nextDouble();
                    System.out.println("Please enter the height");
                    double rHeight = scanner.nextDouble();
                    area = rLength * rHeight;
                    System.out.println("Square area is " + roundArea(area));
                    break;
                case "C" :
                    System.out.println("You entered circle, please enter the radius");
                    double circleRadius = scanner.nextDouble();
                    area = Math.PI * (Math.pow(circleRadius, 2));
                    System.out.println("Circle area is " + roundArea(area));


            }
        }


        return roundArea(area);


    }

    private double roundArea(double area)
    {
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();

    }




}
