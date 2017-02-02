import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    private ArrayList<Carta> mazo;

    /** 
     * Crear una clase llamaza Mazo. El constructor de la clase Mazo debe encargarse
     * de crear las 40 cartas de la baraja española y de dejarlas guardadas de alguna forma.
     * Crear un método verCartasDelMazo que muestra linea a linea todas los nombres de las
     * cartas existentes en el mazo.
     */
    public Mazo()
    {
        mazo = new ArrayList<Carta>();
        
        for(int paloActual = 0; paloActual < 4; paloActual++) {
            for (int valorActual = 1; valorActual <= 12; valorActual++){
                if(valorActual != 0 && valorActual != 9){
                    mazo.add(new Carta(valorActual, paloActual));
                }
            }
        }
    }

    public void verCartasDelMazo()
    {
        for(int i = 0; i < mazo.size(); i++) {
            System.out.println(mazo.get(i));
        }
    }
    
    /**
    * Implementa un metodo llamado barajar en la clase Mazo que no devuelva nada
    * y consiga mezclar las cartas existentes en ese momento en el mazo.
    */
    public void barajarCartas()
    {
        for (int posicionActual = 0; posicionActual < mazo.size(); posicionActual++) {
            Carta carta1 = mazo.get(0);
            Random aleatorio = new Random();
            int posicionAleatoria = aleatorio.nextInt(mazo.size());
            mazo.set(posicionActual, mazo.get(posicionAleatoria));
            mazo.set(posicionAleatoria, carta1);
        }
    }
    
    /**
    * Implementar un metodo llamado sacarCarta en la clase Mazo que devuelva un objeto Carta.
    * Concretamente debe devolver la primera carta del mazo, eliminando esta del mazo.
    */
   public Carta sacarCarta()
   {
       Carta cartaADevolver = null;
       if(mazo.size() > 0){
           cartaADevolver = mazo.remove(0);
       }
       return cartaADevolver;
   }
}
