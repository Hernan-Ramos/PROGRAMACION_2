package die;

public class Cola {
    private long arreglo[];
    private int inicio;
    private int fin;
    private int n;

    public Cola(int n) {
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = 0;
        this.n = n;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("Cola llena");
        } else {
            this.arreglo[this.fin] = e;
            this.fin++;
        }
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return -1;
        } else {
            long dato = this.arreglo[this.inicio];
            this.inicio++;

            if (this.inicio == this.fin) {
                this.inicio = 0;
                this.fin = 0;
            }
            return dato;
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return -1;
        }
        return this.arreglo[this.inicio];
    }

    public boolean isEmpty() {
        return this.inicio == this.fin;
    }

    public boolean isFull() {
        return this.fin == this.n;
    }

    public int size() {
        return this.fin - this.inicio;
    }

    public static void main(String[] args) {
        Cola cola = new Cola(10);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println("Primer elemento: " + cola.peek());
        System.out.println("Elemento removido: " + cola.remove());
        System.out.println("¿La cola está vacía? " + cola.isEmpty());
        System.out.println("Tamaño de la cola: " + cola.size());
        cola.insert(40);
        cola.insert(50);
        cola.insert(60);
        System.out.println("Tamaño final de la cola: " + cola.size());
    }
}
