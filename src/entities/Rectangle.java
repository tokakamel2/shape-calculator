package entities;

import repos.Shape;

public class Rectangle implements Shape {
    public double width;
    public double length;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return width * length;
    }
    @Override
    public double calculateCircumference(){
        return (width + length) * 2;
    }
}
