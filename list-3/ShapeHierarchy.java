class Shape {
      public void displayShape() {
        System.out.println("This is a generic shape.");
    }
}
class Circle extends Shape {
    public void displayShape() {
        System.out.println("This is a Circle shape.");
    }
}
class Rectangle extends Shape {
    public void displayShape() {
        System.out.println("This is a Rectangle shape.");
    }
}
class Triangle extends Shape {
    public void displayShape() {
        System.out.println("This is a Triangle shape.");
    }
}
public class ShapeHierarchy{
    public static void main(String[] args) {
 
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
	Shape s = new Shape();
        circle.displayShape(); // Calls displayShape method of Circle class
        rectangle.displayShape(); // Calls displayShape method of Rectangle class
        triangle.displayShape(); // Calls displayShape method of Triangle class
	s.displayShape();
    }
}
