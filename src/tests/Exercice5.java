package tests;

import base.Point;
import base.Rectangle;
import base.SlantedRectangle;
import java.util.ArrayList;
import java.util.List;

public class Exercice5 {

    // Classe interne simulant Dessin sans créer Dessin.java
    static class DessinSimule {
        private List<Rectangle> formes;

        public DessinSimule() {
            formes = new ArrayList<>();
        }

        public void ajouter(Rectangle r) {
            formes.add(r);
        }

        public double surface() {
            double total = 0.0;
            for (Rectangle r : formes) {
                total += r.surface();
            }
            return total;
        }

        public boolean contains(Point p) {
            for (Rectangle r : formes) {
                if (r.contains(p)) return true;
            }
            return false;
        }

        public Rectangle hull() {
            if (formes.isEmpty()) return null;

            double minX = Double.MAX_VALUE, minY = Double.MAX_VALUE;
            double maxX = Double.MIN_VALUE, maxY = Double.MIN_VALUE;

            for (Rectangle r : formes) {
                Point o = r.getOrigin();
                minX = Math.min(minX, o.getX());
                minY = Math.min(minY, o.getY());
                maxX = Math.max(maxX, o.getX() + r.getWidth());
                maxY = Math.max(maxY, o.getY() + r.getHeight());
            }

            return new Rectangle(new Point(minX, minY), maxX - minX, maxY - minY);
        }
    }

    public static void main(String[] args) {
        DessinSimule dessin = new DessinSimule();

        Rectangle r1 = new Rectangle(new Point(0, 0), 4, 2);
        SlantedRectangle sr1 = new SlantedRectangle(new Point(5, 1), 3, 2, 45);

        dessin.ajouter(r1);
        dessin.ajouter(sr1);

        System.out.println("Surface totale : " + dessin.surface());
        System.out.println("Contains (2,1) ? " + dessin.contains(new Point(2, 1)));
        System.out.println("Hull : " + dessin.hull());
    }
}
