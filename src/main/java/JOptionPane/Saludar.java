package JOptionPane;

public class Saludar {
    String name;
    
    public String saludar(String name){
    String mensaje = "Bienvenido " + name;
    System.out.println(mensaje);
    return mensaje;
    }
}
