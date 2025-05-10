package base;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Redéfinition de equals pour comparer les coordonnées (x, y)
    @Override
    public boolean equals(Object obj) {
        // Vérifie si les deux objets sont identiques
        if (this == obj) return true;

        // Vérifie si l'objet est nul ou si les classes ne correspondent pas
        if (obj == null || getClass() != obj.getClass()) return false;

        // Conversion de l'objet en Point
        Point point = (Point) obj;

        // Comparaison des coordonnées x et y
        return Double.compare(point.x, x) == 0 &&
               Double.compare(point.y, y) == 0;
    }

    // Optionnel : pour mieux afficher les Points dans toString()
    @Override
    public String toString() {
        return "Point[x=" + x + ", y=" + y + "]";
    }
}
