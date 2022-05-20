
package retofinal;

import java.util.Random;

public class Mago {
    private int poder;
    private Random random;
    //private int cantidadHadasCapturadas; // contador_total_hadas
    //private int topeHadasCapturadas; // 10 hadas
    
    public Mago() {
        random = new Random();
    }
    
    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    public void aumentarPoder(){
        poder++;
    }
    
    public void disminuirPoder(){
        poder--;
    }
    
    public int capturarHadas(){
        return random.nextInt(10) + 1;
    }
}
