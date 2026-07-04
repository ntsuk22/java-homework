package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IValidFigure;

public class Circle extends Figure implements IResizable, IValidFigure {

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
        radius += radius;
    }

    @Override
    public void customSize(double byValue) {
        radius *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return radius > 0;
    }
}
