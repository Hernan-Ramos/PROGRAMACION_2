package DIE;

import java.util.Scanner;

public class AppEcuaciones_Cuadraticas {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.print("ingresa la variable uno:");
		double a = var.nextDouble();
		System.out.print("ingresa la variable dos:");
		double b = var.nextDouble();
		System.out.print("ingresa la variable tres:");
		double c = var.nextDouble();
		 Ecuaciones_Cuadraticas ecuacion1 = new Ecuaciones_Cuadraticas(a, b, c);
		 System.out.println(ecuacion1.getDiscriminante());
	}
}
