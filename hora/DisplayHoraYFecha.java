
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    // instance variables - replace the example below with your own
    private int minuto;
    private int hora;
    private int dia;
    private int mes;
    private int anio;
    private NumberDisplay nhora;
    private NumberDisplay nminuto;
    private String displayString;
    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
       // initialise instance variables
       nhora = new NumberDisplay(24);
       nminuto = new NumberDisplay(60);
    }

    public void avanzarMomento()
    {
       // put your code here
    }
    
    public void setMomento(int hora, int minuto, int dia, int mes, int anio)
    {
        // put your code here
        ;
    }
    
    public void getMomento()
    {
        // put your code here
        ;
    }
}
