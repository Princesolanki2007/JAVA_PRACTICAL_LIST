abstract class Shape {
    protected int numberOfSides; // Number of sides of the shape
    public abstract double calculateArea();
}
class Triangle extends Shape {
    private double base; // Base of the triangle
    private double height; // Height of the triangle
    public Triangle(double base, double height) {
        this.numberOfSides = 3; // Triangles have 3 sides
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
public class Practical14{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 8); // Triangle with base 5 and height 8
        System.out.println("Triangle Area: " + triangle.calculateArea());
	System.out.println("Number of Sides are ::"+triangle.numberOfSides);
    }
}
