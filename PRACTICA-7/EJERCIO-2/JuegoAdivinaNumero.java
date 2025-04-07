package laboratorio32;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    // atributos
    private int numeroAAdivinar;

    // constructor
    public JuegoAdivinaNumero(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas);
        this.numeroAAdivinar = numeroAAdivinar;
    }

    public void juega() {
        reiniciaPartida();
        System.out.println("¡Inicia el juego, ponte pilas!");

        int numeroAleatorio = (int) (Math.random() * 10) + 1;
        System.out.println("Intenta adivinar un número del 1 al 10");

        Scanner tec = new Scanner(System.in);

        while (hayVidas()) {
        	
            System.out.print("Tu intento: ");
            numeroAAdivinar = tec.nextInt();
            if(!validaNumero(numeroAAdivinar)) {
            	System.out.println("Error el numero no esta en el rango, intenta  nuevamente");
            	continue;
            }
            if (numeroAAdivinar == numeroAleatorio) {
                System.out.println("¡Acertaste!");
                actualizarRecord();
                break;
            } else {
            	quitaVida();
            	if (numeroAAdivinar < numeroAleatorio) {
                    System.out.println("Incorrecto. El número es **mayor**. Intenta nuevamente.");
                } else {
                    System.out.println("Incorrecto. El número es **menor**. Intenta nuevamente.");
                }
            }
        }

        if (!hayVidas()) {
            System.out.println("¡Perdiste! El número correcto era: " + numeroAleatorio);
        }
      
    }
    public boolean validaNumero( int numero) {
    	return numero>1 && numero<11 ;
    }
    
}
