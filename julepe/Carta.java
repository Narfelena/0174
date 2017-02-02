
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Valor de la carta 1 a 7 y de 10 a 12
    private int valor;
    // Valor del palo: 0 es oros, 1 es copas, 2 es espadas y 3 es bastos.
    private int palo;

    /**
     * Crear una clase llamada Carta con un constructor que admita dos prametros enteros.
     * El primer parametro indica el valor de la carta y puede ser desde 1 a 7 o desde 10 a 12.
     * El segundo, indica el palo de la carta y puede ser de 0 a 3 (0 es oros, 1 es copas, 2 es espadas y 3 es bastos).
     * Crear el metodo toString que devuelve el nombre de la carta (del tipo "as de oros", "7 de espadas", "3 de copas",
     * "caballo de bastos") y los metodos getter de ambos atributos que devuelven enteros. 
     * El nombre de la carta se devuelve en minusculas. El constructor asume que los valores de los parámetros son legales.
     */
    public Carta(int valor, int palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor()
    {
        return valor;
    }
    
    public int getPalo()
    {
        return palo;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        
        String textoValor = valor + "";
        String textoPalo = "";
        
        switch(palo) {
            case 0:
            textoPalo = "oros";
            case 1:
            textoPalo = "copas";
            case 2:
            textoPalo = "espadas";
            case 3:
            textoPalo = "bastos";
            break;
        }
        
        if(valor == 1){
            textoValor = "as";
        }
        else if(valor == 10){
            textoValor = "sota";
        }
        else if(valor == 11){
            textoValor = "caballo";
        }
        else if(valor == 12){
            textoValor = "rey";
        }

        return textoADevolver;
    }
    
    /**
     * Modificar la clase Carta para que:
     * - Exista un método llamado ganaA que reciba un parámetro de tipo Carta y
     * un parámetro de tipo entero que indica el palo que pinta.
     * El método devuelve true en caso de que la carta sea superior a la carta
     * pasada como parámetro conforme a las reglas del tute recogidas en la Wikipedia y false en caso contrario.
     * No hace falta comproar que el parámetro sea null o no, se asume que no lo es.
     */
    public boolean ganaA(Carta cartaAComparar, int paloQuePinta )
    {
        boolean gana = false;
        if(palo == cartaAComparar.getPalo()){
            // En caso de que tengan distinto palo....
            if(getPosicionEscalaTute() > cartaAComparar.getPosicionEscalaTute()) {
                gana = true;
            }
        }
        else {
            // En caso de que tengan distinto palo...
            if(cartaAComparar.getPalo() == paloQuePinta) {
                gana = false;
            }
            else {
                gana = true;
            }
            
        }
        return gana;
    }
    
    public int getPosicionEscalaTute() 
    {
        int posicion = valor;
        
        if (valor == 3) {
            posicion = 13;
        }
        else if (valor == 1) {
            posicion = 14;
        }
        
        return posicion;    
    }
}

