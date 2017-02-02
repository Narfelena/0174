
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    private String nombre;
    private Carta[] cartasQueTienenEnLaMano;
    // Numero de cartas en la mano
    private int numeroDeCartaEnMano;
    
    /**
    * Añadir la clase Jugador que permita a un jugador identificado por un nombre (en formato String) ser 
    * capaz de tener hasta 5 cartas. El constructor debe admitir el nombre del jugador como parámetro. Además 
    * debe haber un método llamado recibirCarta que permita un parametro de tipo Carta y un método llamado verCartasJugador 
    * que imprima por pantalla las cartas del jugador, una por linea, y que funcione tenga las cartas que tenga.
    *
    * Es obligatorio usar un array para guardar las cartas del jugador.
    */
    public Jugador(String nombreN)
    {
        nombre = nombreN;
        cartasQueTienenEnLaMano = new Carta[5];
        numeroDeCartaEnMano = 0;
    }

    public Carta recibirCarta(Carta cartaRecibida)
    {
        if (numeroDeCartaEnMano < 5){
            cartasQueTienenEnLaMano[numeroDeCartaEnMano] = cartaRecibida;
            numeroDeCartaEnMano++;
        }  
    }
    
    public Carta tirarCarta(String nombreCarta)
    {
        Carta cartaTirada = null;
        if(numeroDeCartaEnMano > 0){
            int cartaActual = 0;
            boolean buscando = true;
            while(cartaActual < cartasQueTienenEnLaMano.length && buscando){
                if(nombreCarta.equals(cartasQueTienenEnLaMano(cartaActual).toString())){
                    buscando = false;
                    cartaTirada = cartasQueTienenEnLaMano(cartaActual);
                    cartasQueTienenEnLaMano(cartaActual) = null;
                    numeroCartasEnLaMano--;
                    System.out.println(nombre + "ha tirado" + cartaTirada);
                }
                cartaActual++;
            }
        }
        return cartaTirada;
    }
    
    public void verCartasJugador()
    {
        for (Carta cartaActual : cartasQueTienenEnLaMano){
            if (cartaActual != null){
                System.out.println(cartasQueTienenEnLaMano);
            }
        }
    }
    
    /**
     * Método que tira una carta aleatoria
     */
    public Carta tirarCartaAleatoria()
    {
       if(numeroCartasEnLaMano > 0) {
           Random aleatorio = new Random();
           boolean elJugadorHaTiradoUnaCarta = false;
           while(elJugadorHaTiradoUnaCarta == false){
               int posicionAleatoria = aleatorio.nextInt(5);
               if(cartasQueTienenEnLaMano(posicionAleatoria) != null){
                   cartaTirada = cartasQueTienenEnLaMano(posicionAleatoria);
                   cartasQueTienenEnLaMano(posicionAleatoria) = null;
                   numeroCartasEnLaMano--;
                   System.out.println(nombre + " ha tirado " + cartaTirada);
                }
            }
       }
    }
    
    public String getNombre(){
        return nombre;
    }
}
