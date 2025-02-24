import java.lang.Math;

class Punto {
    float x, y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] coordCartesianas() {
        return new float[]{x, y};
    }

    public double[] coordPolares() {
        double radio = Math.sqrt(x * x + y * y);
        double angulo = Math.atan2(y, x);
        return new double[]{radio, angulo};
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class tarea1 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2.0f, 3.0f);
        float[] cartesianas = punto1.coordCartesianas();
        System.out.println(cartesianas[0] + " " + cartesianas[1]);

        double[] polares = punto1.coordPolares();
        System.out.println(polares[0] + " " + polares[1]);

        System.out.println(punto1);
    }
}
