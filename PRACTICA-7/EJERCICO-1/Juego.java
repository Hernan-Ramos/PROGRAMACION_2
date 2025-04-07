package laboratorio3;

public class Juego {
    private int vidasIniciales;
    private int numeroDeVidas;
    private int record;

    public Juego(int numeroDeVidas) {
        this.vidasIniciales = numeroDeVidas;
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        this.numeroDeVidas = vidasIniciales;
  
    }

    public void actualizarRecord() {
        this.record = this.record + 1;
    }

    public void  quitaVida() {
        if (numeroDeVidas > 0) {
            numeroDeVidas--;
        }
    }

    public boolean hayVidas() {
        return numeroDeVidas > 0;
    }

    public void muestraVidasRestantes() {
        System.out.println("Vidas restantes: " + numeroDeVidas);
    }
    
}