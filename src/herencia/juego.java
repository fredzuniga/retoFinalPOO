/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author osx
 */
public class juego {
    private mago magoMalvado;
    private jugador participante;
    private ogro ogroFeo;
    
    public juego(){
        magoMalvado = new mago();
        participante = new jugador();
    }
    
    public void iniciarJuego(){
        magoMalvado.setNivelVida(100);
        participante.setNivelVida(100);
        ogroFeo.atacarAJugador();
        ogroFeo.getNivelCrecimiento();
    
    }
}
