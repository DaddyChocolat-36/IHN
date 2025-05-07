# IHN
TD POO by IHN Légendes
EXERCICE 2:Définir une méthode rotate dans l'esprit de la méthode translate.
public class Point2D {
    private double x;
    private double y;

    // Constructeur
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Méthode pour déplacer le point
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Méthode pour faire une rotation autour de l'origine
    public void rotate(double angleRadians) {
        double newX = x * Math.cos(angleRadians) - y * Math.sin(angleRadians);
        double newY = x * Math.sin(angleRadians) + y * Math.cos(angleRadians);
        this.x = newX;
        this.y = newY;
    }

    // Affichage des coordonnées
    public void print() {
        System.out.printf("Point(x = %.2f, y = %.2f)\n", x, y);
    }

    // Main pour tester
    public static void main(String[] args) {
        Point2D point = new Point2D(1, 0);
        System.out.println("Avant rotation :");
        point.print();

        point.rotate(Math.PI / 2);  // Rotation de 90 degrés (π/2 radians)
        System.out.println("Après rotation de 90° :");
        point.print();

        point.translate(2, 3);  // Déplacement de (2, 3)
        System.out.println("Après translation :");
        point.print();
    }
}
