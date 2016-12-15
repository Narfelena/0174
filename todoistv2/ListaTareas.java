import java.util.ArrayList;
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
    private ArrayList<Tarea> listaTareas;
    
    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
      listaTareas = new ArrayList<Tarea>();  
    }
    
    public void añadirTarea()
    {
      listaTareas.add(Tarea.getNombrar);
    }
    
    public void verTareas()
    {
        int num = 1;
        for(String nombreTarea : listaTareas){
            System.out.println(num +"-"+ tarea);
            num = num + 1;
        }
        
    }
}
