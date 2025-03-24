package DIE;
import java.util.Scanner;

public class ECUACIONES_ESTRUC {
	public static String getDiscriminante(float a, float b, float c){
		 float discriminante = b * b - 4 * a * c;
		 if(discriminante > 0) {
			 return String.format("La ecuacion tiene dos raices %.5f y %.5f ",getRaiz1(a,b,discriminante), getRaiz2(a,b,discriminante));
		 }
		 else{
			 if(discriminante == 0){
				 return String.format("La ecuacion tiene una solucion %.0f", getRaiz1(a,b,discriminante));
			 }
			 else{
				 return "la ecuacion no tiene soluciones reales";
			 }
		 }
	}
	public static double getRaiz1( float a, float b, float discriminante) {
		return (-b + Math.sqrt(discriminante)) / (2 * a);
	}
	public static double getRaiz2( float a, float b, float discriminante) {
		return (-b - Math.sqrt(discriminante)) / (2 * a);
	}
	public static void main (String[] args) {
		
		Scanner datos = new Scanner(System.in);
		System.out.println("ingresa a ,b, c: ");
		float a = datos.nextFloat();
		float b = datos.nextFloat();
		float c = datos.nextFloat();
		System.out.print(getDiscriminante(a, b ,c));
		datos.close();
		
		
		
		
	}

}
