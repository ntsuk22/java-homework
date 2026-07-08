package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.javaoop.annotationsAndStreams.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int unUsedInt = 10;
        @SuppressWarnings("unused")
        String unUsedString = "Hello";
        @SuppressWarnings("unused")
        double unUsedDouble = 5.5;

        Field[] fields = Analyzable.class.getDeclaredFields();

        List<Field> matchingFields = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    String annotationName = annotation.name();
                    String capitalizedFieldName = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                    return capitalizedFieldName.equals(annotationName);
                })
                .collect(Collectors.toList());

        List<Field> nonMatchingFields = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    String annotationName = annotation.name();
                    String capitalizedFieldName = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                    return !capitalizedFieldName.equals(annotationName);
                })
                .collect(Collectors.toList());

        System.out.println("--- Matching Fields ---");
        matchingFields.forEach(f -> System.out.println(f.getName() + " -> " + f.getAnnotation(VariableNameAnnotation.class).name()));

        System.out.println("\n--- Non-Matching Fields ---");
        nonMatchingFields.forEach(f -> System.out.println(f.getName() + " -> " + f.getAnnotation(VariableNameAnnotation.class).name()));
    }
}