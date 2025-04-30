import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rnd = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rnd.nextInt(2); // 0 = Cuadro, 1 = Círculo
            String color = rnd.nextBoolean() ? "Rojo" : "Azul";

            if (tipo == 0) {
                double lado = 1 + rnd.nextDouble() * 9;
                figuras[i] = new Cuadrado(color, lado);
            } else {
                double radio = 1 + rnd.nextDouble() * 5;
                figuras[i] = new Circulo(color, radio);
            }
        }

        // Mostrar resultados
        for (Figura fig : figuras) {
            System.out.println(fig.toString());
            System.out.printf("Área: %.2f, Perímetro: %.2f\n", fig.area(), fig.perimetro());

            if (fig instanceof Coloreado) {
                Coloreado c = (Coloreado) fig;
                System.out.println("Coloreado: " + c.comoColorear());
            }

            System.out.println("---------------------------");
        }
    }
}
