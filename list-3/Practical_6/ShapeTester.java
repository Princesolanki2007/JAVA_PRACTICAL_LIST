package test;

import shapes.Shape;
import shapes.Rectangle;

public class ShapeTester{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw(); // Output: Drawing a shape

        Rectangle r = new Rectangle();
        r.draw(); // Output: Drawing a rectangle
    }
}
