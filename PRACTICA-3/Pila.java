package DIE;

public class Pila {
	private long[] arreglo;
	private int top;
	private int n;
	public Pila(int n){
		this.n = n;
		this.top = -1;
		this.arreglo = new long [n];
	}
	public void push(int e) {
		if(this.isFull()) {
			System.out.println("Pila llena");
		}else {
			this.top = this.top + 1;
			this.arreglo[this.top] = e;
		}
	}
	public long pop(){
		if (this.isEmpty()){
			System.out.println("Pila vacia");
			return -1;
		}else {
			 long valor = arreglo[this.top];
	         this.top = this.top - 1;
	         return valor;
			
		}
	}
	public long peek() {
		if(this.isEmpty()){
			System.out.println("Pila vacia");
			return -1;
		} else {
			return arreglo[this.top];
		}
		
	}
	public boolean isEmpty(){
		if(this.top == -1){
			return true;
		}else {
			return false;
		}
	}
	public boolean isFull(){
		if(this.top == this.n - 1) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String args[]){
		Pila pila = new Pila(5);
		pila.push(10);
		pila.push(20);
		pila.push(30);
		pila.push(40);
		System.out.println(pila.peek());		
		System.out.println("pop, estoy eliminando el siguiente elemento:  "+ pila.pop());
		System.out.println(pila.peek());		
	}
	

}
