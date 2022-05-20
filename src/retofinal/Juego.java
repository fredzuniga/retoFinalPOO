
package retofinal;

import java.util.Random;

public class Juego {
    private Ogro ogro;
    private Mago mago;
    private Jugador jugador;
    private Random random;
    private int partida;
    private int cantidadPartidas = 0;
    // mago
    private int topeHadasCapturadas;
    private int cantidadHadasCapturadas;
    // jugador
    private int cantidadHadasLiberadas; // contador_total_hadas
    private int topeHadasLiberadas; // 10 hadas
    private int topeCasasConstruidas = 0;
    
    public Juego(){
        ogro = new Ogro();
        mago = new Mago();
        jugador = new Jugador();
        random = new Random();
        mago.setPoder(10);
        jugador.setNivelVida(10);
    }
    
    public void iniciarJuego(){
        int hadasCapturadasPartida;
        int casasConstruidas;
        do{
            System.out.println("Número de partida --->" + (cantidadPartidas + 1) );
            partida = random.nextInt(3) + 1;
            // 1 mago
            // 2 jugador
            // ogro
            
            switch(partida){
                case 1:
                    
                    hadasCapturadasPartida = mago.capturarHadas();
                    System.out.println("El mago capturo hadas ---> " + hadasCapturadasPartida);
                    topeHadasCapturadas += hadasCapturadasPartida;
                    if(topeHadasCapturadas > 10){
                        cantidadHadasCapturadas += topeHadasCapturadas;
                        System.out.println("El mago tiene en su poder --->" + cantidadHadasCapturadas + "  hadas");
                        topeHadasCapturadas = 0;
                        mago.aumentarPoder();
                        System.out.println("El mago aumento su poder +1 ---->" + mago.getPoder());
                    }
                    break;
                case 2:
                    System.out.println("Partida del jugador");
                    casasConstruidas = jugador.construirCasas();
                    
                    if ( casasConstruidas > cantidadHadasCapturadas ){
                        System.out.println("El jugador construyo --->" + cantidadHadasCapturadas);
                        topeCasasConstruidas += cantidadHadasCapturadas;
                        cantidadHadasCapturadas = 0;
                    }else{
                        System.out.println("El jugador construyo --->" + casasConstruidas);
                        System.out.println("El jugador libero ---> " + casasConstruidas + "  hadas");
                        
                        cantidadHadasCapturadas -= casasConstruidas;
                        topeCasasConstruidas += casasConstruidas;
                        
                        System.out.println("Hadas aún atrapadas --->" + cantidadHadasCapturadas);
                    }
                    
                    if (topeCasasConstruidas > 10){
                        topeCasasConstruidas = 0;
                        jugador.aumentarNivelVida();
                        System.out.println("Aumento su nivel de vida +1 ---> " + jugador.getNivelVida());
                        mago.disminuirPoder();
                        System.out.println("Disminuyo el poder del mago -1 ---> " + mago.getPoder());
                    }
                    break;
                case 3:
                    ogro.atacarAJugador();
                    jugador.disminuirNivelVida();
                    System.out.println("Disminuyo el poder del jugador -1  ---> " + jugador.getNivelVida());
                    break;
                default:
                    break;
            }
            cantidadPartidas++;
            System.out.println("-------------------------");
            System.out.println("-------------------------");
        }while(mago.getPoder() > 0 && jugador.getNivelVida() > 0);
        
        if(mago.getPoder() == 0){
            System.out.println("El jugador gano la partida");
        }else{
            System.out.println("El mago gano la partida");
        }
    }
}
