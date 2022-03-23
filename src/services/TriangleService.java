package services;

import entities.Triangle;

import java.util.Scanner;

public class TriangleService {

    Scanner scanner = new Scanner(System.in);
    public void chooseAreaOrCircumference(){
        System.out.println("What do you want to calculate?");
        System.out.println("1.Area");
        System.out.println("2.Circumference");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                double area = calculateArea();
                System.out.println("Your triangle's area is:");
                System.out.println(area);
                break;
            case "2":
                double circumference =  calculateCircumference();
                System.out.println("Your triangle's circumference is:");
                System.out.println(circumference);
                break;
            default:
                System.out.println("Enter valid number choice");
                chooseAreaOrCircumference();

        }

    }
    public double calculateArea(){
        System.out.println("Enter height value");
        double height = scanner.nextDouble();
        System.out.println("Enter base value");
        double base = scanner.nextDouble();
        Triangle triangle = new Triangle();
        triangle.setHeight(height);
        triangle.setBase(base);
        return triangle.calculateArea();
    }

    public double calculateCircumference(){
        System.out.println("Enter first side value");
        double firstSide = scanner.nextDouble();
        System.out.println("Enter second side");
        double secondSide = scanner.nextDouble();
        System.out.println("Enter base value");
        double base = scanner.nextDouble();
        Triangle triangle = new Triangle();
        triangle.setFirstSide(firstSide);
        triangle.setSecondSide(secondSide);
        triangle.setBase(base);
        return triangle.calculateCircumference();
    }
}
