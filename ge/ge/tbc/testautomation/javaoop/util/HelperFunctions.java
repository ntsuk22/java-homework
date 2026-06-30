package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {

    public static void compareRectangles(Rectangle r1, Rectangle r2) {
        if (r1.getPerimeter() > r2.getPerimeter()) {
            System.out.println("parameter 1 > parameter 2");
        } else if (r1.getPerimeter() < r2.getPerimeter()) {
            System.out.println("parameter 1 < parameter 2");
        } else {
            System.out.println("parameter 1 = parameter 2");
        }
    }
}
