package DIE;
import java.util.Scanner;

public class ESTADISTICA_ESTRUCT {
	public static float Promedio(float [] vector,int n){
		float sumador = 0;
		for (int i = 0; i < n; i++) {
			sumador = sumador + vector[i];
		}
		sumador = sumador / n;
		return sumador;
	}
	public static double  Desviacion( float [] vector, int n){
		float promedio = Promedio(vector, n);
		float sumador = 0 ;
		for (int i = 0; i < n; i++ ) {
			sumador = sumador + (vector[i] - promedio) * (vector[i] - promedio);
		}
		return Math.sqrt((sumador) / (n - 1));
	}

	
	

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		System.out.print("ingresas el numero de datos: ");
		int n = datos.nextInt();
		float [] vector = new float [n];
		System.out.println("ingresa " + n + "  numero(s)");
		for(int i = 0; i < n; i++) {
			vector[i] = datos.nextFloat();
			
		}
		datos.close();
		System.out.println(Promedio(vector, n));
		System.out.println(Desviacion(vector, n));
		
	}

}
