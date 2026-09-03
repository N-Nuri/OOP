public class Main {
    public static void main(String[] args) {
        // Exercise 4.0.4 - translate the three graphical shape examples
        // from the problem statement (slide "Examples") into instances.
        Square square = new Square(new CartesianPoint(30, 60), 30);
        Circle circle = new Circle(new CartesianPoint(0, 0), 30);
        Dot dot = new Dot(new CartesianPoint(100, 200));

        System.out.println("Square, Circle and Dot created successfully.");
    }
}
