package entities;

import repos.Shape;

public class Parallelogram implements Shape {

    public double firstSide;
    public double secondSide;
    public double base;
    public double height;

    public void setFistSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public double calculateCircumference() {
        return (firstSide * 2)+(secondSide * 2);
    }
}
