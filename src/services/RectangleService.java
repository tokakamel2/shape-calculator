package services;

import entities.Rectangle;
import entities.Square;

import java.util.Scanner;

public class RectangleService {

    Scanner scanner = new Scanner(System.in);
    public void chooseAreaOrCircumference(){
        System.out.println("What do you want to calculate?");
        System.out.println("1.Area");
        System.out.println("2.Circumference");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                double area = calculateArea();
                System.out.println("Your rectangle's area is:");
                System.out.println(area);
                break;
            case "2":
                double circumference =  calculateCircumference();
                System.out.println("Your rectangle's circumference is:");
                System.out.println(circumference);
                break;
            default:
                System.out.println("Enter valid number choice");
                chooseAreaOrCircumference();

        }

    }
    public double calculateArea(){
        System.out.println("Enter length value");
        double length = scanner.nextDouble();
        System.out.println("Enter width value");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setWidth(width);
        return rectangle.calculateArea();
    }
    public double calculateCircumference(){
        System.out.println("Enter length value");
        double length = scanner.nextDouble();
        System.out.println("Enter width value");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setWidth(width);
        return rectangle.calculateCircumference();
    }
}
