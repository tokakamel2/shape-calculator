package entities;

import repos.Shape;

public class Square implements Shape {
    public double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
    @Override
    public double calculateCircumference(){
        return 4 * side;
    }
}
