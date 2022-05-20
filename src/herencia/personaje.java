
package herencia;

import java.util.Random;


public class personaje {
    private int nivelVida;
    private int nivelCrecimiento;

    public int getNivelCrecimiento() {
        return nivelCrecimiento;
    }

    public void setNivelCrecimiento(int nivelCrecimiento) {
        this.nivelCrecimiento = nivelCrecimiento;
    }
    
    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    } 
    
    public void aumentarNivelVida(){
        nivelVida++;
    }
    
    public void disminuirNivelVida(){
        nivelVida--;
    }
}
