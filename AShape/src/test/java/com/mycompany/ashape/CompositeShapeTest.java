package com.mycompany.ashape;

import junit.framework.TestCase;

public class CompositeShapeTest extends TestCase {
    public void testConstructor() {
        new CompositeShape(new Square(new CartesianPoint(20, 40), 20), new Circle(new CartesianPoint(40, 30), 15));

        CartesianPoint point1 = new CartesianPoint(100, 200);
        CartesianPoint point2 = new CartesianPoint(20, 50);
        CartesianPoint point3 = new CartesianPoint(0, 0);

        AShape square1 = new Square(point1, 40);
        AShape square2 = new Square(point2, 30);
        AShape circle1 = new Circle(point3, 20);

        AShape shape1 = new Square(point1, 40);
        AShape shape2 = new Circle(point3, 20);
        AShape shape3 = new CompositeShape(new Circle(point3, 20), new Square(point1, 40));
        AShape shape4 = new CompositeShape(new Square(point1, 40), new CompositeShape(new Circle(point2, 30), new Square(point1, 300)));
    }
}
