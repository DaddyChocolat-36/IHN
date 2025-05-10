package tests;

import base.*;

public class Exercice12 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        // Création d'un Rectangle et d'un SlantedRectangle
        Rectangle rect = new Rectangle(p1, 5, 5);
        SlantedRectangle slantedRect = new SlantedRectangle(p2, 3, 3, 45);

        // Test contains(Point) sur le Rectangle
        System.out.println("Rect contient Point (p1): " + rect.contains(p1)); // Devrait être true
        System.out.println("Rect contient Point (p2): " + rect.contains(p2)); // Devrait être false

        // Test contains(Point) sur le SlantedRectangle
        System.out.println("SlantedRect contient Point (p2): " + slantedRect.contains(p2)); // Devrait être true
        System.out.println("SlantedRect contient Point (p1): " + slantedRect.contains(p1)); // Devrait être false
    }
}
