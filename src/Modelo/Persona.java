package Modelo;

/**
 *
 * @author Dylan Meza
 */
public class Persona {
    private String nombre;
    private String provincia;
    private int edad;

    public Persona(){
        
    }

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
    @Override
    public String toString(){
        return getNombre() +", "+ getEdad();
           
    }
    
        
    
}
