package ge.tbc.testautomation.javaoop.figures;

public class Triangle extends Figure {

    double a;
    double b;
    double c;
    double h;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = 4.0;
    }

    @Override
    public double getArea() {
        return 0.5 * a * h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
