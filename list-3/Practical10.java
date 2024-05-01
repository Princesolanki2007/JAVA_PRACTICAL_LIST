class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle {
    private double width; // Width of the rectangle
    private double height; // Height of the rectangle

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
}
class Triangle {
    private double base; // Base of the triangle
    private double height; // Height of the triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
     public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Practical10{
    public static void main(String[] args) {
        Circle circle = new Circle(6); // Circle with radius 5
        Rectangle rectangle = new Rectangle(4, 6); // Rectangle with width 4 and height 6
        Triangle triangle = new Triangle(3, 4); // Triangle with base 3 and height 4


        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
