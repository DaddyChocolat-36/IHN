package base;

public class SlantedRectangle extends Rectangle {
    private double angle;

    public SlantedRectangle(Point origin, double width, double height, double angle) {
        super(origin, width, height);
        this.angle = angle;
    }

    @Override
    public double surface() {
        return width * height;
    }

    @Override
    public boolean contains(Point p) {
        // Implémentation simple : même logique que Rectangle (sans rotation réelle)
        return p.getX() >= origin.getX() && p.getX() <= origin.getX() + width &&
               p.getY() >= origin.getY() && p.getY() <= origin.getY() + height;
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
        System.out.println("Rotation du SlantedRectangle de " + angle + " degrés. Nouvel angle: " + this.angle);
    }

    @Override
    public String toString() {
        return "SlantedRectangle[origin=" + origin + ", width=" + width + ", height=" + height + ", angle=" + angle + "]";
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

        // Conversion de l'objet en SlantedRectangle
        SlantedRectangle that = (SlantedRectangle) obj;

        // Comparaison des attributs width, height, origin et angle
        return Double.compare(that.width, width) == 0 &&
               Double.compare(that.height, height) == 0 &&
               Double.compare(that.angle, angle) == 0 &&
               origin.equals(that.origin);
    }
}
