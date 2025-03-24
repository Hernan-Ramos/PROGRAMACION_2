package DIE;

import java.util.Scanner;

public class AppEstadistica {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        Estadistica estadistica = new Estadistica(cantidad);
        System.out.print("ingrese los nuemeros separados por un espacio ");
        for (int i = 0; i < cantidad; i++) {
            estadistica.vector[i] = scanner.nextFloat();
        }
        System.out.println("Promedio: " + estadistica.Promedio());
        System.out.println("Desviación estándar: " + estadistica.Desviacion());
        scanner.close();
    }
}
