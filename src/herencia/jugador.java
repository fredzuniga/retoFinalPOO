/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Random;

/**
 *
 * @author osx
 */
public class jugador extends personaje{
    private Random random;
    
    public jugador() {
        random = new Random();
    }

    public int construirCasas(){
        return random.nextInt(9) + 1;
    }
}
