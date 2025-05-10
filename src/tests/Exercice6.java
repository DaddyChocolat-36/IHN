/*Réponse
La méthode toString() est héritée de la classe java.lang.Object.
Donc la méthode qu'on écrit dans Rectangle est une redéfinition (@Override), pas une définition.
*/
package tests;

import base.Point;
import base.Rectangle;
import base.SlantedRectangle;

public class Exercice6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Point(0, 0), 5, 3);
        SlantedRectangle sr = new SlantedRectangle(new Point(1, 1), 4, 2, 45);

        System.out.println(r.toString());
        System.out.println(sr.toString());
    }
}
