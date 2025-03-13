package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Map {
    public static void main(String[] args) {
        // Instanciar objeto
        Map<Integer, String> mapaEmpleado = new HashMap<>();
        
        // put()
        mapaEmpleado.put(10, "Roberto");
        mapaEmpleado.put(11, "Claudia");
        mapaEmpleado.put(12, "Gustavo");
        mapaEmpleado.put(13, "Nelly");
        mapaEmpleado.put(14, "Eliminar");
        
        // containValue(int)
        Boolean valor = mapaEmpleado.containsValue("Pedro");
        System.out.println("¿Contiene el mapa a Pedro? " + valor);
        // Salida: ¿Contiene el valor Pedro? false
        
        // containKey(Obj)
        Boolean clave = mapaEmpleado.containsKey(10);
        System.out.println("¿Contiene la clave 10? " + clave);
        // Salida: ¿Contiene la clave 10? true
        
        // value()
        System.out.println("Mostrar todos los valores del mapa: " + mapaEmpleado.values());
        // Salida: Mostrar todos los valores del mapa: [Roberto, Claudia, Gustavo, Nelly, Eliminar]
        
        // keySet()
        System.out.println("Mostrar todas las claves del mapa: " + mapaEmpleado.keySet());
        // Salida: Mostrar todas las claves del mapa: [10, 11, 12, 13]
        
        // get(int)
        String nombreEmpleado = mapaEmpleado.get(10);
        System.out.println("El valor de esta clave es: " + nombreEmpleado);
        // Salida: El valor de esta clave es: Roberto
        
        // remove()
        mapaEmpleado.remove(14);
        System.out.println("El mapa luego de eliminar la clave 14 queda así: " + mapaEmpleado.values());
        // Salida: El mapa luego de eliminar la clave 14 queda así: [Roberto, Claudia, Gustavo, Nelly]
    }
}
