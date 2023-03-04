package Modelo;

/**
 *
 * @author Dylan Meza
 */
public class Persona {
    
    //Atributos
    private String nombre;
    private String provincia;
    private int edad;

    /**
    * Crea una instancia de la clase Persona con los datos proporcionados.
    * @param nombre el nombre de la persona
    * @param provincia la provincia donde reside la persona
    * @param edad la edad de la persona
    */
    public Persona(String nombre, String provincia, int edad) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.edad = edad;
    }

    /**
    * Devuelve el nombre de la persona.
    * @return el nombre de la persona
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * @param nombre el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la provincia donde reside la persona.
     * @return la provincia donde reside la persona
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Establece la provincia donde reside la persona.
     * @param provincia la provincia donde reside la persona
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Devuelve la edad de la persona.
     * @return la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * @param edad la edad de la persona
     */
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodo toString que hace que se muestren los atributos dados a los objetos
    @Override
    public String toString(){
        return getNombre() +", "+ getEdad()+" Años, de "+getProvincia();
           
    }
    
        
    
}
