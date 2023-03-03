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

    //Constructor
    public Persona(String nombre, String provincia, int edad) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.edad = edad;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodo toString que hace que se muestren los atributos dados a los objetos
    @Override
    public String toString(){
        return getNombre() +", "+ getEdad()+" Años, de "+getProvincia();
           
    }
    
        
    
}
