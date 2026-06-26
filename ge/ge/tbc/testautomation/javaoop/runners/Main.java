package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle2 = new Circle(10);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle3 = new Circle(15);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle4 = new Circle(20);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle5 = new Circle(25);
        System.out.println(Circle.numberOfCircleInstances);

        // BONUS

        Random random = new Random();

        Circle c1 = new Circle(random.nextInt(20) + 1); // 1-20
        Circle c2 = new Circle(random.nextInt(20) + 1);
        Circle c3 = new Circle(random.nextInt(20) + 1);

        System.out.println("Radius 1: " + c1.getRadius());
        System.out.println("Radius 2: " + c2.getRadius());
        System.out.println("Radius 3: " + c3.getRadius());

        String circle1String = Util.circleToString(circle1);
        System.out.println(circle1String);

        String circle2String = Util.circleToString(circle2);
        System.out.println(circle2String);

        String circle3String = Util.circleToString(circle3);
        System.out.println(circle3String);

        String circle4String = Util.circleToString(circle4);
        System.out.println(circle4String);

        String circle5String = Util.circleToString(circle5);
        System.out.println(circle5String);
    }
}