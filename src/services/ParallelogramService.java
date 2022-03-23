package services;

import entities.Parallelogram;
import entities.Rectangle;

import java.util.Scanner;

public class ParallelogramService {
    Scanner scanner = new Scanner(System.in);
    public void chooseAreaOrCircumference(){
        System.out.println("What do you want to calculate?");
        System.out.println("1.Area");
        System.out.println("2.Circumference");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                try {
                    double area = calculateArea();
                    System.out.println("Your parallelogram's area is:");
                    System.out.println(area);
                }
                catch (Exception exception){
                    System.out.println("Invalid Input");
                }
                break;
            case "2":
                try {
                    double circumference = calculateCircumference();
                    System.out.println("Your parallelogram's circumference is:");
                    System.out.println(circumference);
                }
                catch (Exception exception){
                    System.out.println("Invalid Input");
                }
                break;
            default:
                System.out.println("Enter valid number choice");
                chooseAreaOrCircumference();

        }

    }
    public double calculateArea(){
        System.out.println("Enter base value");
        double base = scanner.nextDouble();
        System.out.println("Enter height value");
        double height = scanner.nextDouble();
        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setBase(base);
        parallelogram.setHeight(height);
        return parallelogram.calculateArea();
    }
    public double calculateCircumference(){
        System.out.println("Enter first side value");
        double firstSide = scanner.nextDouble();
        System.out.println("Enter second side value");
        double secondSide = scanner.nextDouble();
        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setFistSide(firstSide);
        parallelogram.setSecondSide(secondSide);
        return parallelogram.calculateCircumference();
    }
}
