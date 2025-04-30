class A {
    int x, z;

    public A(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public void incrementaXZ() {
        x++;
        z++;
    }

    public void incrementaZ() {
        z++;
    }

    public int getZ() {
        return z;
    }
}

class B {
    int y, z;

    public B(int y, int z) {
        this.y = y;
        this.z = z;
    }

    public void incrementaYZ() {
        y++;
        z++;
    }

    public void incrementaZ() {
        z += 2;
    }

    public int getZ() {
        return z;
    }
}

public class D {
    A a;
    B b;

    public D(int x, int y, int z) {
        a = new A(x, z);
        b = new B(y, z);
    }

    public void incrementaXYZ() {
        a.x++;
        b.y++;
        a.z++;
        b.z++;
    }

    public void mostrarDatos() {
        System.out.println("x: " + a.x);
        System.out.println("y: " + b.y);
        System.out.println("z en A: " + a.getZ());
        System.out.println("z en B: " + b.getZ());
    }

    public static void main(String[] args) {
        D obj = new D(1, 2, 3);    
        obj.incrementaXYZ();       
        obj.mostrarDatos();      
    }
}
