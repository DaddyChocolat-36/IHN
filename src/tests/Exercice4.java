package tests;

import base.Point;
import base.Rectangle;
import base.SlantedRectangle;

public class Exercice4 {
    public static void main(String[] args) {
        System.out.println("\n--- Exercice n°4 ---");

        Point p = new Point(1, 2);

        Rectangle r = new Rectangle(p, 2, 3);
        Rectangle t = new SlantedRectangle(p, 2, 3, 15); // Utilisation polymorphique
        SlantedRectangle s = new SlantedRectangle(p, 2, 3, 30); // Utilisation directe

        // Rectangle
        System.out.println("r.surface() = " + r.surface()); // Appelle Rectangle.surface()
        r.rotate(2); // Méthode vide ou par défaut
        System.out.println("r.contains(p) = " + r.contains(p)); // Rectangle.contains()

        // Polymorphisme
        System.out.println("t.surface() = " + t.surface()); // Appelle SlantedRectangle.surface()
        t.rotate(2); // Appelle SlantedRectangle.rotate() car méthode redéfinie
        System.out.println("t.contains(p) = " + t.contains(p)); // Appelle SlantedRectangle.contains()

        // SlantedRectangle
        System.out.println("s.surface() = " + s.surface()); // Appelle SlantedRectangle.surface()
        s.rotate(2); // SlantedRectangle.rotate()
        System.out.println("s.contains(p) = " + s.contains(p)); // SlantedRectangle.contains()
    }
}
