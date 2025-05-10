class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Rectangle {
    protected Point origin;
    protected int width;
    protected int height;

    public Rectangle(Point origin, int width, int height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public double surface() {
        return width * height;
    }

    public void rotate(int degrees) {
        System.out.println("Rotating Rectangle by " + degrees + " degrees.");
    }

    public boolean contains(Point p) {
        return p.getX() >= origin.getX() && p.getX() <= origin.getX() + width &&
               p.getY() >= origin.getY() && p.getY() <= origin.getY() + height;
    }
}

class SlantedRectangle extends Rectangle {
    public SlantedRectangle(Point origin, int width, int height) {
        super(origin, width, height);
    }

    @Override
    public double surface() {
        return width * height * 0.9; 
    }

    @Override
    public void rotate(int degrees) {
        System.out.println("Rotating SlantedRectangle by " + degrees + " degrees.");
    }

    @Override
    public boolean contains(Point p) {
        return p.getX() >= origin.getX() && p.getX() <= origin.getX() + width &&
               p.getY() >= origin.getY() - 5 && p.getY() <= origin.getY() + height + 5; // Exemple de logique différente
    }
}

class Exercice4 {

    public static void main(String[] args) {
     Point p = new Point(1, 2);
        Rectangle r = new Rectangle(p, 2, 3);
        Rectangle t = new SlantedRectangle(p, 2, 3);
        SlantedRectangle s = new SlantedRectangle(p, 2, 3);

        System.out.println(r.surface());
        r.rotate(2);
        System.out.println(r.contains(p));

        System.out.println(t.surface());
        t.rotate(2);
        System.out.println(t.contains(p));

        System.out.println(s.surface());
        s.rotate(2);
        System.out.println(s.contains(p));   
}
}

