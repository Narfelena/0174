
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anio;
    private String displayString;
    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
       // initialise instance variables
       horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
       dia = new DisplayDosDigitos(31);
       mes = new DisplayDosDigitos(13);
       anio = new DisplayDosDigitos(100);
    }

    public void avanzarMomento()
    {
       minutos.increment();
       if(minutos.getValue() == 0 ){
           horas.increment();
           if(horas.getValue() == 0 ){
               dia.incrementaValor();
               if(dia.getValor() == 1 ){
                   mes.incrementaValor();
                   if(mes.getValor() == 1){
                       anio.incrementaValor();
                   }
               }
           }
       }
    }
    
    public void setMomento(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        if (nuevaHora >= 0 && nuevaHora < 24 && nuevoMinuto >= 0 && nuevoMinuto < 60 && 
        nuevoDia > 0 && nuevoDia < 31 && nuevoMes > 0 && nuevoMes < 13 && 
        nuevoAnio > 0 && nuevoAnio < 100) {
            minutos.setValue(nuevoMinuto);
            horas.setValue(nuevaHora);
            dia.setValor(nuevoDia);
            mes.setValor(nuevoMes);
            anio.setValor(nuevoAnio);
        }
    }
    
	public void setMomentoVersion2(int nuevaHora, int nuevoMinuto, 
		                         int nuevoDia, int nuevoMes, int nuevoAnio)
	{
		boolean seDebeCambiarElMomentoTemporal = true;

		if (nuevaHora < 0 || nuevaHora > 23) {
		  seDebeCambiarElMomentoTemporal = false;
		}
		if (nuevoMinuto < 0 || nuevoMinuto > 59) {
		  seDebeCambiarElMomentoTemporal = false;
		}
		if (nuevoDia < 1 || nuevoDia > 30) {
		  seDebeCambiarElMomentoTemporal = false;
		}
		if (nuevoMes < 1 || nuevoMes > 12) {
		  seDebeCambiarElMomentoTemporal = false;
		}
		if (nuevoAnio < 1 || nuevoAnio > 99) {
		  seDebeCambiarElMomentoTemporal = false;
		}
		if (seDebeCambiarElMomentoTemporal == true){
		  minutos.setValue(nuevoMinuto);
		  horas.setValue(nuevaHora);
		  dia.setValor(nuevoDia);
		  mes.setValor(nuevoMes);
		  anio.setValor(nuevoAnio);
		}
    
  	}
    
    public String getMomento()
    {
        return horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " +
        dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" +
        anio.getValorDelDisplay();
    }
}
