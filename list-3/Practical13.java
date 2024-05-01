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
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double width, height; // Width and Height of the rectangle
    public Rectangle(String color, double width, double height) {
        super(color); // Call superclass constructor to initialize color
        this.width = width;
        this.height = height;
    }
    public String getInfo() {
        return super.getInfo() + ", Width: " + width + ", Height: " + height;
    }
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class Practical13{
    public static void main(String[] args) {
        Circle myCircle = new Circle("Red", 6); // Circle with color "Red" and radius 6
        Rectangle myRectangle = new Rectangle("Blue", 4, 6); // Rectangle with color "Blue", width 4, and height 6
        System.out.println("Circle Info: " + myCircle.getInfo() + ", Area: " + myCircle.calculateArea());
        System.out.println("Rectangle Info: " + myRectangle.getInfo() + ", Area: " + myRectangle.calculateArea() + ", Perimeter: " + myRectangle.calculatePerimeter());
    }
}
