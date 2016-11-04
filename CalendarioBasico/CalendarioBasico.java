
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    
    private int mes;
    
    private int anio;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        dia = 01;
        mes = 01;
        anio = 01;
    }

    public void avanzarFecha()
    {
        // put your code here
        dia++;
        if (dia >= 30) {    
        
        }
        if (mes >= 12) {    
        
        }
        if (anio < 2001 && anio > 2099 ) {    
        
        }
    }
    
    public void fijarFecha(int dia, int mes, int anio)
    {
        // put your code here
        ;
    }
    
   public String obtenerFecha()
   {
        // put your code here
        System.out.println(""+dia+"-"+mes+"-"+anio+"");
   }
}
