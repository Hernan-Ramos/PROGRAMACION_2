package laboratorio32;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas, numeroAAdivinar);
    }

    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Número inválido. Solo se permiten números PARES entre 0 y 10.");
                return false;
            }
        } else {
            System.out.println("Número fuera de rango. Debe estar entre 0 y 10.");
            return false;
        }
    }
}
