package ge.tbc.testautomation.javaoop.figures;

public abstract class Figure {

    public static int numberOfInstances;

    public Figure() {
        numberOfInstances++;
    }

    public abstract double getArea();

    public abstract double getLength();

    public abstract void printPackageName();
}
