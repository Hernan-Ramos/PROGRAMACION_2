import java.awt.*;
import javax.swing.*;

class Punto {
    int x, y;
    public Punto(int x, int y) { this.x = x; this.y = y; }
    public int[] coordCartesianas() { return new int[]{x, y}; }
    public double[] coordPolares() {
        double radio = Math.sqrt(x * x + y * y);
        double angulo = Math.atan2(y, x);
        return new double[]{radio, angulo};
    }
    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}

class Linea {
    Punto p1, p2;
    public Linea(Punto p1, Punto p2) { this.p1 = p1; this.p2 = p2; }
    public void mostrarVentana() {
        JFrame frame = new JFrame("Línea");
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(p1.x * 50, getHeight() - p1.y * 50, p2.x * 50, getHeight() - p2.y * 50);
            }
        });
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Circulo {
    Punto centro;
    int radio;
    public Circulo(Punto centro, int radio) { this.centro = centro; this.radio = radio; }
    public void mostrarVentana() {
        JFrame frame = new JFrame("Círculo");
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int cx = centro.x * 50;
                int cy = getHeight() - centro.y * 50;
                int r = radio * 50;
                g.drawOval(cx - r, cy - r, r * 2, r * 2);
            }
        });
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class tarea2 {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(4, 5);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 2);
        
        System.out.println("Coordenadas cartesianas: " + p1.coordCartesianas()[0] + ", " + p1.coordCartesianas()[1]);
        System.out.println("Coordenadas polares: " + p1.coordPolares()[0] + ", " + Math.toDegrees(p1.coordPolares()[1]));
        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);
        System.out.println("Línea: " + linea);
        System.out.println("Círculo: " + circulo);
        
        linea.mostrarVentana();
        circulo.mostrarVentana();
    }
}

