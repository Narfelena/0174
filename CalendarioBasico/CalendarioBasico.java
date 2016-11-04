
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
    
    private String fecha;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        dia = 1;
        mes = 1;
        anio = 1;
        fecha = ""+dia+"-"+mes+"-"+anio+"";
    }

    public void avanzarFecha()
    {
        // put your code here
        dia++;
        if (dia >= 30) {    
            dia = 1;
            mes = mes + 1;
        }
        if (mes >= 12) {    
            mes = 1;
            anio = anio + 1;
        }
        if (anio < 2001 && anio > 2099 ) {    
            
        }
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        anio = nuevoAnio;
    }
    
   public String obtenerFecha()
   {
        return fecha;
   }
}
