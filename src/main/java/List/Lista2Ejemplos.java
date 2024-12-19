package List;

public class Lista2Ejemplos {

    public String nombre;
    public String apellido;
    public String edad;
    public String ciudad;

    public Lista2Ejemplos(String nombre, String apellido, String edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Lista2Ejemplos{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ciudad=" + ciudad + '}';
    }
    
}
