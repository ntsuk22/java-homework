package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.util.*;

public class ContainersAndComparing {

    public static void main(String[] args) {

        // ---- Step 2
        ArrayList<String> phones = new ArrayList<>();
        phones.add("555-542-231");
        phones.add("555-887-987");
        phones.add("555-161-143");
        phones.add("555-189-6667");

        // ---- Step 3
        System.out.println("=== Phone list (Iterator) ===");
        Iterator<String> iterator = phones.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ---- Step 4
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("ana",  "555-542-231");
        phoneBook.put("nino",    "555-887-987");
        phoneBook.put("irakli",    "555-161-143");
        phoneBook.put("mariami", "555-189-6667");

        // ---- Step 5
        System.out.println("\n=== Names with '8' in phone ===");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains("8")) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        // ---- Step 7
        System.out.println("\n=== TreeSet<Circle> (10 added, some duplicate radii) ===");
        TreeSet<Circle> treeSet = new TreeSet<>();
        treeSet.add(new Circle(5));
        treeSet.add(new Circle(3));
        treeSet.add(new Circle(7));
        treeSet.add(new Circle(1));
        treeSet.add(new Circle(3));
        treeSet.add(new Circle(9));
        treeSet.add(new Circle(2));
        treeSet.add(new Circle(7));
        treeSet.add(new Circle(4));
        treeSet.add(new Circle(6));
        System.out.println(treeSet);

        // ---- Step 8
        System.out.println("\n=== HashSet<Circle> (same 10 added, some duplicate radii) ===");
        HashSet<Circle> hashSet = new HashSet<>();
        hashSet.add(new Circle(5));
        hashSet.add(new Circle(3));
        hashSet.add(new Circle(7));
        hashSet.add(new Circle(1));
        hashSet.add(new Circle(3));
        hashSet.add(new Circle(9));
        hashSet.add(new Circle(2));
        hashSet.add(new Circle(7));
        hashSet.add(new Circle(4));
        hashSet.add(new Circle(6));
        System.out.println(hashSet);

        // ---- Step 9
        System.out.println("\n=== Rectangles sorted by area descending (reverse Comparator) ===");
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(5, 6));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(7, 8));

        Comparator reverseByArea = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Rectangle r1 = (Rectangle) o1;
                Rectangle r2 = (Rectangle) o2;
                return Double.compare(r2.getArea(), r1.getArea());
            }
        };

        rectangles.sort(reverseByArea);
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }
    }
}
