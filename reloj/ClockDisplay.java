
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String muestraHora;
    
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        actualizaDisplay();
    }
    
    public ClockDisplay(int hora, int minuto)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        asignaHora(hora, minuto);
    }

    public void avanzaTiempo()
    {
        minutos.increment();
        if(minutos.getValue() == 0) {
            horas.increment();
        }
        actualizaDisplay();
    }

    public void asignaHora(int hora, int minuto)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
        actualizaDisplay();
    }

    public String mostrarHora()
    {
        return muestraHora;
    }
    
    private void actualizaDisplay()
    {
        muestraHora = horas.getDisplayValue() + ":" + 
                        minutos.getDisplayValue();
    }
}
