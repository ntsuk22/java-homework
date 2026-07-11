package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.generics.AnyPair;
import ge.tbc.testautomation.javaoop.generics.FigurePair;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

    public static void main(String[] args) {

        Integer someInteger = 42;
        String someString = "Hello, generics!";

        AnyPair<Field[], Field[]> declaredFields = getDeclaredFields(someInteger, someString);

        System.out.println("Integer class fields:");
        for (Field field : Arrays.asList(declaredFields.getElementOne())) {
            System.out.println(field);
        }

        System.out.println("String class fields:");
        for (Field field : Arrays.asList(declaredFields.getElementTwo())) {
            System.out.println(field);
        }

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);

        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);

        System.out.println(figurePair);
    }
}