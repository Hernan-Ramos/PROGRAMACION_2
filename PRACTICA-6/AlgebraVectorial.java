class AlgebraVectorial {

    public String Perpendicular(int v1, int v2, int v3, int v4) {
        double sumaX = v1 + v3;
        double sumaY = v2 + v4;
        double restaX = v1 - v3;
        double restaY = v2 - v4;

        double moduloSuma = Math.sqrt(sumaX * sumaX + sumaY * sumaY);
        double moduloResta = Math.sqrt(restaX * restaX + restaY * restaY);

        if (Math.abs(moduloSuma - moduloResta) < 1e-6) {
            return "a es perpendicular a b";
        } else {
            return "a no es perpendicular a b";
        }
    }

   
    
    public String Perpendicular(double v1, double v2, double v3, double v4) {
        double productoEscalar = (v1 * v3) + (v2 * v4);
        if (productoEscalar == 0) {
            return "a es ortogonal a b";
        } else {
            return "a no es ortogonal a b";
        }
    }

    
    public String Paralela(int v1, int v2, int v3, int v4) {
        if (v1 == 0 && v2 == 0 || v3 == 0 && v4 == 0) {
            return "a es paralela a b"; 
        }

        if (v1 == 0 || v3 == 0) { 
            return "a no es paralela a b"; 
        }

        if (v1 * v4 == v2 * v3) {
            return "a es paralela a b";
        } else {
            return "a no es paralela a b";
        }
    }

   
    public String Paralela(float v1, float v2, float v3, float v4) {
        float productoCruzado = v1 * v4 - v2 * v3;
        if (productoCruzado == 0) {
            return "a es paralela a b";
        } else {
            return "a no es paralela a b";
        }
    }

   
    public String Proyeccion_de_a_sobre_b(int v1, int v2, int v3, int v4) {
        double productoEsc = (v1 * v3) + (v2 * v4);
        double moduloB = (v3 * v3) + (v4 * v4);
        if (moduloB == 0) {
            return "No se puede proyectar sobre un vector nulo";
        }
        double proyeccion = productoEsc / moduloB;
        double componente1 = proyeccion * v3;
        double componente2 = proyeccion * v4;
        return "La proyección de a sobre b es: " + componente1 + "i + " + componente2 + "j";
    }

    
    public double Componente_de_a_en_b(float v1, float v2, float v3, float v4) {
        double productoEsc = (v1 * v3) + (v2 * v4);
        double moduloB = Math.sqrt(v3 * v3 + v4 * v4);
        if (moduloB == 0) {
            return 0; 
        }
        return productoEsc / moduloB;
    }

    public static void main(String[] args) {
        AlgebraVectorial av = new AlgebraVectorial();

       
        System.out.println(av.Perpendicular(2, 4, -4, -8)); 
        System.out.println(av.Paralela(2, 4, 1, 2)); 
        System.out.println(av.Paralela(3, 4, 2, 3)); 
        System.out.println(av.Proyeccion_de_a_sobre_b(3, 4, 1, 2));
        System.out.println(av.Componente_de_a_en_b(3, 4, 1, 2));
    }
}