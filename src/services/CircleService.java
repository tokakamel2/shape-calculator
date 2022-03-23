package services;

import entities.Circle;

import java.util.Scanner;

public class CircleService {
    Scanner scanner = new Scanner(System.in);

    public void chooseAreaOrCircumference(){
        System.out.println("What do you want to calculate?");
        System.out.println("1.Area");
        System.out.println("2.Circumference");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
               double area = calculateArea();
               System.out.println("Your circle's area is:");
               System.out.println(area);
                break;
            case "2":
                double circumference =  calculateCircumference();
                System.out.println("Your circle's circumference is:");
                System.out.println(circumference);
                break;
            default:
                System.out.println("Enter valid number choice");
                chooseAreaOrCircumference();

        }

    }
    public double calculateArea(){
        System.out.println("Enter radius value");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        return circle.calculateArea();
    }
    public double calculateCircumference(){
        System.out.println("Enter radius value");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        return circle.calculateCircumference();
    }
}
