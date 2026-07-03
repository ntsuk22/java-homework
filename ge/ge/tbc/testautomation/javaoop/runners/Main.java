package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Triangle;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Abstract Figure: Circle ===");
        Circle circle = new Circle(5);
        System.out.println("Area:    " + circle.getArea());
        System.out.println("Length (circumference): " + circle.getLength());
        System.out.print("Package: ");
        circle.printPackageName();

        System.out.println("\n=== Abstract Figure: Triangle ===");
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area:    " + triangle.getArea());
        System.out.println("Length (perimeter): " + triangle.getLength());
        System.out.print("Package: ");
        triangle.printPackageName();

        System.out.println("\n=== IResizable: Circle ===");
        Circle resizableCircle = new Circle(3);
        System.out.println("Radius before doubleSize: " + resizableCircle.getRadius());
        resizableCircle.doubleSize();
        System.out.println("Radius after doubleSize:  " + resizableCircle.getRadius());
        resizableCircle.customSize(1.5);
        System.out.println("Radius after customSize(1.5): " + resizableCircle.getRadius());

        System.out.println("\n=== IResizable: Triangle ===");
        Triangle resizableTriangle = new Triangle(3, 4, 5);
        System.out.println("Perimeter before doubleSize: " + resizableTriangle.getLength());
        resizableTriangle.doubleSize();
        System.out.println("Perimeter after doubleSize:  " + resizableTriangle.getLength());
        resizableTriangle.customSize(0.5);
        System.out.println("Perimeter after customSize(0.5): " + resizableTriangle.getLength());

        System.out.println("\n=== IValidFigure: Circle ===");
        IValidFigure validCircle = new Circle(7);
        System.out.println("Circle(7) is valid: " + validCircle.validateFigure());

        System.out.println("\n=== IValidFigure: Triangle ===");
        IValidFigure validTriangle = new Triangle(5, 5, 5);
        System.out.println("Triangle(5,5,5) is valid: " + validTriangle.validateFigure());

        System.out.println("\n=== Validation on creation: invalid Circle ===");
        try {
            Circle invalidCircle = new Circle(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n=== Validation on creation: invalid Triangle ===");
        try {
            Triangle invalidTriangle = new Triangle(1, 2, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n=== IResizable via interface reference ===");
        IResizable r = new Circle(4);
        System.out.println("Circle(4) area before doubleSize: " + ((Circle) r).getArea());
        r.doubleSize();
        System.out.println("Circle(4) area after doubleSize:  " + ((Circle) r).getArea());
    }
}
