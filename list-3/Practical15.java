abstract class Shape {
    public abstract double calculateArea();
}
class Rectangle extends Shape {
    private double l; // Length of the rectangle
    private double w; // Width of the rectangle
    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    public double calculateArea() {
        return l * w;
    }
}
class Triangle extends Shape {
    private double b; // Base of the triangle
    private double h; // Height of the triangle
    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    public double calculateArea() {
        return (b * h) / 2;
    }
}
public class Practical15{
    public static void printShapeArea(Shape shape) {
        System.out.println("Area of the shape: " + shape.calculateArea());
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6); // Rectangle with length 4 and width 6
        Triangle t = new Triangle(5, 8); // Triangle with base 5 and height 8
        System.out.println("Rectangle:");
        printShapeArea(r); // Print area of the rectangle
        System.out.println("\nTriangle:");
        printShapeArea(t); // Print area of the triangle
    }
}
