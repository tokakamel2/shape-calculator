import services.*;

import java.util.Scanner;

public class Main {


    public static void displayMainMenu(){
        System.out.println("Enter the number of the shape you want : ");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("4.Triangle");
        System.out.println("5.Parallelogram");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                CircleService circleService = new CircleService();
                circleService.chooseAreaOrCircumference();
                break;
            case "2":
                RectangleService rectangleService = new RectangleService();
                rectangleService.chooseAreaOrCircumference();
                break;
            case "3":
                SquareService squareService = new SquareService();
                squareService.chooseAreaOrCircumference();
                break;
            case "4":
                TriangleService triangleService = new TriangleService();
                triangleService.chooseAreaOrCircumference();
                break;
            case "5":
                ParallelogramService parallelogramService = new ParallelogramService();
                parallelogramService.chooseAreaOrCircumference();
                break;
            default:
                System.out.println("Enter valid choice");
                displayMainMenu();

        }
    };

    public static void main(String[] args){
        displayMainMenu();
    }

}
