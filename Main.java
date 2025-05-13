public class Main {

    // Rectangle classique (non incliné)
    static class Rectangle {
        protected double x, y, width, height;

        public Rectangle(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public boolean contains(double px, double py) {
            return (px >= x && px <= x + width && py >= y && py <= y + height);
        }
    }

    // Rectangle incliné d’un angle en radians
    static class SlantedRectangle extends Rectangle {
        private double angle; // en radians

        public SlantedRectangle(double x, double y, double width, double height, double angle) {
            super(x, y, width, height);
            this.angle = angle;
        }

        @Override
        public boolean contains(double px, double py) {
            // On fait une rotation inverse du point autour de (x, y)
            double cos = Math.cos(-angle);
            double sin = Math.sin(-angle);
            double dx = px - x;
            double dy = py - y;
            double rx = dx * cos - dy * sin;
            double ry = dx * sin + dy * cos;

            // Ensuite, on vérifie si le point tourné est dans le rectangle classique
            return (rx >= 0 && rx <= width && ry >= 0 && ry <= height);
        }
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0, 0, 4, 2);
        System.out.println("Point dans rectangle normal : " + rect.contains(2, 1)); // true

        SlantedRectangle srect = new SlantedRectangle(0, 0, 4, 2, Math.toRadians(30)); // 30°
        System.out.println("Point dans rectangle incliné : " + srect.contains(2, 1)); // dépend de l'angle
    }
}