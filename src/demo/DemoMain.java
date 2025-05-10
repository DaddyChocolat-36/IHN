package demo;

import base.Point;
import base.Rectangle;
import base.SlantedRectangle;

public class DemoMain {
    public static void main(String[] args) {
        // Créer un point d'origine
        Point origin = new Point(0, 0);

        // Créer un rectangle normal
        Rectangle r = new Rectangle(origin, 4, 5);
        System.out.println(r);  // Affiche les détails du rectangle
        System.out.println("Surface: " + r.surface());

        // Créer un rectangle incliné
        SlantedRectangle sr = new SlantedRectangle(origin, 4, 5, 45);  // Angle à 45°
        System.out.println(sr);  // Affiche les détails du rectangle incliné
        System.out.println("Surface incliné: " + sr.surface());
        sr.rotate(10);  // Tourne le rectangle incliné de 10 degrés
    }
}
