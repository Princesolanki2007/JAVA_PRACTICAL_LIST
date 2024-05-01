class Shape {
    protected String color; // Color of the shape
    public Shape(String color) {
        this.color = color;
    }
    public String getInfo() {
        return "Color: " + color;
    }
}
class Circle extends Shape {
    private double radius; // Radius of the circle
    public Circle(String color, double radius) {
        super(color); // Call superclass constructor to initialize color
        this.radius = radius;
    }
    public String getInfo() {
        return super.getInfo() + ", Radius: " + radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Practical12{
    public static void main(String[] args) {
        Circle myCircle = new Circle("Red", 6); // Circle with color "Red" and radius 6
        System.out.println("Circle Info: " + myCircle.getInfo() + ", Area: " + myCircle.getArea());
    }
}
