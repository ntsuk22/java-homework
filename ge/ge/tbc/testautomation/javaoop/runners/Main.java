package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        try {
            Circle invalidCircle = new Circle(-5);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }

        try {
            Circle c1 = new Circle(1);
            Circle c2 = new Circle(2);
            Circle c3 = new Circle(3);
            Circle c4 = new Circle(4);
            Circle c5 = new Circle(5);
            Circle c6 = new Circle(6);
            Circle c7 = new Circle(7);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }

        String sentence = "Test Automation Bootcamp 12, 2025";

        System.out.println(sentence.substring(5, 15).toLowerCase());

        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(sentence.length());

        sentence = sentence.replace(",", "");
        System.out.println(sentence.replace(" ", "-"));

        String[] phoneNumbers = {
                "599-14-15-16",
                "555-00-11-22",
                "595-33-44-55",
                "592-99-88-77",
                "123-45-67-89",
                "599-1-2-3",
                "599-123456",
                "500-12-34-56"
        };

        for (String number : phoneNumbers) {
            System.out.println(number + " -> " + phoneNumberValidation(number));
        }
    }

    private static boolean phoneNumberValidation(String phoneNumber) {
        String cleaned = phoneNumber.replace("-", "");
        return Pattern.matches("(555|595|592|599)[0-9]{6}", cleaned);
    }
}