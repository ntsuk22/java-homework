package ge.tbc.testautomation.javaoop.figures;

public class Circle {

    private double radius;

    public static int numberOfCircleInstances;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstances++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}