package DIE;
import java.util.Scanner;
public class Estadistica {
	public int n ;
	public float [] vector;
	
	public Estadistica(int n) {
		this.n = n;
		this.vector = new float [n];
	}
	public  float Promedio() {
		float contador = 0 ;
		for( int i = 0; i < this.n; i++ ) {
					contador =  contador + this.vector[i]; 
		}
		contador = contador/ this.n;
		return contador;		
	}
	 public double Desviacion() {
	        float promedio = Promedio(); 
	        float sumaDiferenciasCuadradas = 0;

	        for (int i = 0; i < this.n; i++) {
	            sumaDiferenciasCuadradas += (this.vector[i] - promedio) * (this.vector[i] - promedio);
	        }

	        if (this.n == 1) return 0;

	        return Math.sqrt(sumaDiferenciasCuadradas / (this.n - 1)); 
	
	}
}
