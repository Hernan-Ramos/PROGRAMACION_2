package laboratorio32;

public class AppJuego {
    public static void main(String[] args) {
        // Juego Adivina Número
        System.out.println("=== Juego Adivina Número ===");
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3, 0);
        juego1.juega();

        // Juego Adivina Par
        System.out.println("\n=== Juego Adivina Par ===");
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3, 0);
        juego2.juega();

        // Juego Adivina Impar
        System.out.println("\n=== Juego Adivina Impar ===");
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3, 0);
        juego3.juega();
    
    }
}
