package tests;

import base.Point;
import base.Rectangle;
import base.SlantedRectangle;

public class Exercice7 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(0, 0), 5, 3);
        Rectangle r2 = new Rectangle(new Point(0, 0), 5, 3);
        Rectangle r3 = new Rectangle(new Point(1, 1), 5, 3);

        SlantedRectangle sr1 = new SlantedRectangle(new Point(0, 0), 5, 3, 45);
        SlantedRectangle sr2 = new SlantedRectangle(new Point(0, 0), 5, 3, 45);
        SlantedRectangle sr3 = new SlantedRectangle(new Point(1, 1), 5, 3, 45);

        // Test de égalité pour Rectangle
        System.out.println("r1 equals r2: " + r1.equals(r2));  // Doit être true
        System.out.println("r1 equals r3: " + r1.equals(r3));  // Doit être false

        // Test de égalité pour SlantedRectangle
        System.out.println("sr1 equals sr2: " + sr1.equals(sr2));  // Doit être true
        System.out.println("sr1 equals sr3: " + sr1.equals(sr3));  // Doit être false
    }
}
