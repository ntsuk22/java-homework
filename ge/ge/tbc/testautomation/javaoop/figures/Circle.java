package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IValidFigure;

public class Circle extends Figure implements IResizable, IValidFigure, Comparable<Circle> {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (!validateFigure()) {
            throw new IllegalArgumentException("Circle radius must be a positive value, got: " + radius);
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public void doubleSize() {
        radius *= Math.sqrt(2);
    }

    @Override
    public void customSize(double byValue) {
        radius *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return radius > 0;
    }

    @Override
    public int compareTo(Circle other) {
        if (this.radius > other.radius) return 1;
        if (this.radius < other.radius) return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return Double.compare(this.radius, other.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

    @Override
    public String toString() {
        return "Circle(radius=" + radius + ")";
    }
}
