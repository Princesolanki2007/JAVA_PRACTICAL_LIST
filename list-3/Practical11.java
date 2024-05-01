import java.util.*;
class Shape {
    protected String color; 
    public Shape(String color) {
        this.color = color;
    }
}
class Circle extends Shape {
    private double r; // Radius of the circle
    public Circle(String color, double radius) {
        super(color); // Call superclass constructor to initialize color
        this.r = radius; // Assign the value of radius to r
    }
    public double getArea() {
        return Math.PI * r * r; 
    }
}


class Practical11 {
    public static void main(String[] args) {
        Circle myCircle = new Circle("Red", 6); // Circle with color "Red" and radius 6


        System.out.println("Circle Color: " + myCircle.color + ", Area: " + myCircle.getArea());

    }
}
