public class FigurasGeometricas {
	public double area(double radio){
		return Math.PI * radio * radio;
		
	}
	public int area(int base , int altura) {
		return base * altura;
	}
	public float area(float base , float altura) {
		return ((base * altura) / 2);
	}
	public float area(float  base1, float base2 , float altura) {
		float baset = base1 + base2;
		return  (baset * altura) /2;
		
	}
	public double area(double lado, double apotema) {
		return (5 * lado * apotema)/2;
	}
	
	

	public static void main(String[] args) {
		FigurasGeometricas circulo = new FigurasGeometricas();
		FigurasGeometricas rectangulo = new FigurasGeometricas();
		FigurasGeometricas triangulo = new FigurasGeometricas();
		FigurasGeometricas trapecio =new FigurasGeometricas();
		FigurasGeometricas pentagono= new FigurasGeometricas();
		System.out.println(circulo.area(3));
		System.out.println(rectangulo.area(5, 6));
		System.out.println(triangulo.area(5, 3));
		System.out.println(trapecio.area(4, 5, 4));
		System.out.println(pentagono.area(20, 5));
		

	}

}
