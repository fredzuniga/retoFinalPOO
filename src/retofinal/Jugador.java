
package retofinal;

import java.util.Random;

public class Jugador {
    private int nivelVida;
    private Random random;
    //private int cantidadHadasLiberadas; // contador_total_hadas
    //private int topeHadasLiberadas; // 10 hadas
    
    public Jugador() {
        random = new Random();
    }
    
    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    } 
     
    public int construirCasas(){
        return random.nextInt(10) + 1;
    }
    
    public void aumentarNivelVida(){
        nivelVida++;
    }
    
    public void disminuirNivelVida(){
        nivelVida--;
    }
}
