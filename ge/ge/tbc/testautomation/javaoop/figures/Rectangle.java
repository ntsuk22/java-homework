package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure {

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getLength() {
        return 2 * (a + b);
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }
}
