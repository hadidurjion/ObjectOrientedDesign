//****************************************************************************
// Title : Demonstrating the Liskov Substitution Principle (LSP)
// Author: Hadidur Rahman Jion
//         Undergraduate Student
//         Khulna University
//****************************************************************************

/*
 * Represents a shape with a method to calculate its area.
 * This interface defines the contract for shapes and requires implementations to provide an area calculation method.
 */
interface Shape {
    /**
     * Calculates the area of the shape.
     *
     * @return The area of the shape.
     */
    double calculateArea();
}

/*
 * Represents a rectangle shape.
 * This class implements the Shape interface and calculates the area of a rectangle.
 */
class Rectangle implements Shape {
    private double width;
    private double height;

    /**
     * Constructs a new rectangle with the given width and height.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

/*
 * Represents a square shape, a special case of a rectangle.
 * This class implements the Shape interface and calculates the area of a square.
 */
class Square implements Shape {
    private double sideLength;

    /**
     * Constructs a new square with the given side length.
     *
     * @param sideLength The length of each side of the square.
     */
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}

/*
 * Calculates the total area of shapes.
 * This class provides functionality to calculate the total area of an array of shapes.
 */
class AreaCalculator {
    /*
     * Calculates the total area of an array of shapes.
     *
     * @param shapes The array of shapes.
     * @return The total area of all shapes.
     */
    public double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

/*
 * Demonstrates the usage of shapes and area calculation.
 * This class contains the main method to demonstrate the calculation of total area using shapes.
 */
class LSP {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 4),
                new Square(3)
        };

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.getTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}

/*
Both Rectangle and Square classes implement the Shape interface, maintaining the Liskov Substitution Principle.
The Square class, a subtype of Rectangle, can be substituted for a Rectangle without affecting program correctness.
*/
