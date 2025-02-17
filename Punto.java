public class Punto {
    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String coord_cartesianas() {
        return "(" + x + ", " + y + ")";
    }
    public String coord_polares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x); 
        return "(r: " + r + ", θ: " + Math.toDegrees(theta) + "°)";
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println("Coordenadas Cartesianas: " + p.coord_cartesianas());
        System.out.println("Coordenadas Polares: " + p.coord_polares());
        System.out.println("Representación String: " + p.toString());
    }
}