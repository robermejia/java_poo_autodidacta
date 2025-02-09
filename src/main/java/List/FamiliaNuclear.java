package List;

public class FamiliaNuclear {

    public String nombre;
    public String apellido;
    public String edad;
    public String ciudad;

    public FamiliaNuclear(String nombre, String apellido, String edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + edad + ", " + ciudad + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    
    
}
