package tests;

import base.Point;
import base.Rectangle;
import base.SlantedRectangle;

public class TestsRectangles {
    public static void main(String[] args) {
        System.out.println("=== Tests des exercices 4 à 13 ===");

        // === Exercice n°4 ===
        System.out.println("\n--- Exercice n°4 ---");

        Point p = new Point(1, 2);
        Rectangle r = new Rectangle(p, 2, 3);
        SlantedRectangle s = new SlantedRectangle(p, 2, 3, 30); 

        
        System.out.println("r.surface() = " + r.surface()); 
        r.rotate(2); // Appelle Rectangle.rotate()
        System.out.println("r.contains(p) = " + r.contains(p)); // Rectangle.contains

        // Tests pour le rectangle incliné
        System.out.println("s.surface() = " + s.surface()); 
        s.rotate(2); // Appelle SlantedRectangle.rotate()
        System.out.println("s.contains(p) = " + s.contains(p)); 

        // === Fin des tests ===
        System.out.println("\n--- Fin des tests ---");
    }
}
