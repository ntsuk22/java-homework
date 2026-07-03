package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.interfaces.IValidFigure;

public class Triangle extends Figure implements IResizable, IValidFigure {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!validateFigure()) {
            throw new IllegalArgumentException(
                    "Sides (" + a + ", " + b + ", " + c + ") do not form a valid triangle");
        }
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public void doubleSize() {
        a *= Math.sqrt(2);
        b *= Math.sqrt(2);
    }

    @Override
    public void customSize(double byValue) {
        a *= byValue;
        b *= byValue;
        c *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return a > 0 && b > 0 && c > 0
                && (a + b > c) && (a + c > b) && (b + c > a);
    }
}
