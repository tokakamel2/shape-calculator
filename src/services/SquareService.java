package services;


import entities.Square;

import java.util.Scanner;

public class SquareService {
    Scanner scanner = new Scanner(System.in);
    public void chooseAreaOrCircumference(){
        System.out.println("What do you want to calculate?");
        System.out.println("1.Area");
        System.out.println("2.Circumference");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                double area = calculateArea();
                System.out.println("Your square's area is:");
                System.out.println(area);
                break;
            case "2":
                double circumference =  calculateCircumference();
                System.out.println("Your square's circumference is:");
                System.out.println(circumference);
                break;
            default:
                System.out.println("Enter valid number choice");
                chooseAreaOrCircumference();

        }

    }
    public double calculateArea() {
        System.out.println("Enter side's value");
        double side = scanner.nextDouble();
        Square square = new Square();
        square.setSide(side);
        return square.calculateArea();
    }
    public double calculateCircumference(){
        System.out.println("Enter side's value");
        double side = scanner.nextDouble();
        Square square = new Square();
        square.setSide(side);
        return square.calculateCircumference();
    }
}
