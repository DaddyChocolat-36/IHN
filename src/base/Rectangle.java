package base;

public class Rectangle {
    protected Point origin;
    protected double width;
    protected double height;

    public Rectangle(Point origin, double width, double height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public double surface() {
        return width * height;
    }

    public boolean contains(Point p) {
        return p.getX() >= origin.getX() && p.getX() <= origin.getX() + width &&
               p.getY() >= origin.getY() && p.getY() <= origin.getY() + height;
    }

    public void rotate(int angle) {
        System.out.println("Rotation du rectangle de " + angle + " degrés.");
    }

    @Override
    public String toString() {
        return "Rectangle[origin=" + origin + ", width=" + width + ", height=" + height + "]";
    }

    // ✅ Getters ajoutés ici
    public Point getOrigin() {
        return origin;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        // Vérifie si les deux objets sont identiques en mémoire
        if (this == obj) return true;

        // Vérifie si l'objet est nul ou si les classes ne correspondent pas
        if (obj == null || getClass() != obj.getClass()) return false;

        // Conversion de l'objet en Rectangle
        Rectangle rectangle = (Rectangle) obj;

        // Comparaison des attributs width, height et origin
        return Double.compare(rectangle.width, width) == 0 &&
               Double.compare(rectangle.height, height) == 0 &&
               origin.equals(rectangle.origin);
    }
}
