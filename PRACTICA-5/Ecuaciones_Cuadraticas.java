package DIE;
import java.util.Scanner;

public class Ecuaciones_Cuadraticas {
	double a ;
	double b ;
	double c ;
	
	//metodos 
	
	public Ecuaciones_Cuadraticas(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;	
	}
	
	public String getDiscriminante(){
		if (this.a == 0){
			return "no hay solucion para esta ecuacion";
		}else {
			double discriminante = (this.b * this.b) - (4 * this.a * this.c);
			 if (discriminante > 0) {
				 return String.format("La ecuacion tiene dos raices %.5f y %.5f", this.getRaiz1(), getRaiz2());
				 
			 } else {
				 if(discriminante == 0) {
					 return String.format("La ecuacion tiene una raiz %.0f", this.getRaiz1());
				 } else {
					 return "La ecuacion no tiene raices";
				 }
			 }	
		}
		 
	}
	public double getRaiz1(){
		return (-this.b + Math.sqrt((this.b * this.b) -(4 * this.a * this.c))) / (2 * this.a);
	}
	public double getRaiz2(){
		return (-this.b - Math.sqrt((this.b * this.b) - (4 * this.a * this.c))) / (2 * this.a);
	}
}
