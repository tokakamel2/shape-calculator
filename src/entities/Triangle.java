package entities;

import repos.Shape;

public class Triangle implements Shape {

    public double height;
    public double base;
    public double firstSide;
    public double secondSide;

    public Triangle() {
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }


    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea(){
        return ( height * base )/2;
    }
    @Override
    public double calculateCircumference(){
        return firstSide + secondSide + base;
    }
}
