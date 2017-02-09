
/**
 * Write a description of class Persona here.
 * 
 * @author (Francisco) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean hombre;
    private int peso;
    private int altura;
    private int edad;
    private int caloriasConsumidas;
    private int metabolismoBasal;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, boolean hombre, int peso, int altura, int edad)
    {
        this.nombre = nombre;
        this.hombre = hombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        caloriasConsumidas = 0;
        if(hombre = true)
        {
           metabolismoBasal = 10*peso + 6*altura - 5*edad + 5;
        }
        else
        {
           metabolismoBasal = 10*peso + 6*altura - 5*edad - 161;
        }
    }

    public int comer(Comida calorias)
    {
        int ingerirCalorias = -1;
        ingerirCalorias = calorias.getComida();
        if(metabolismoBasal < caloriasConsumidas){
            System.out.println("Has sobrepasado el limite de calorias");
        }
        else{
            if(ingerirCalorias != -1){
                caloriasConsumidas = caloriasConsumidas + ingerirCalorias;
            }
            else{
                System.out.println("No se ha comido");
            }
        }
        return ingerirCalorias;
    }
    
    public int getCaloriasIngeridas()
    {
        return caloriasConsumidas;
    }
}
