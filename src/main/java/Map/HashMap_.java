package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ {
    public static void main(String[] args) {
        // Instanciar objeto
        Map<Integer, String> mapaEmpleado = new HashMap<>();
        
        // put() => Agregar elementos al mapa
        mapaEmpleado.put(10, "Roberto");
        mapaEmpleado.put(11, "Claudia");
        mapaEmpleado.put(12, "Gustavo");
        mapaEmpleado.put(13, "Nelly");
        mapaEmpleado.put(14, "Eliminar");
        
        // containValue(int) => Muestra true o false si un valor se encuentra en el mapa
        Boolean valor = mapaEmpleado.containsValue("Pedro");
        System.out.println("¿Contiene el mapa a Pedro? " + valor);
        // Salida: ¿Contiene el valor Pedro? false
        
        // containKey(Obj) => Muestra true o false si una clave se encuentra en el mapa
        Boolean clave = mapaEmpleado.containsKey(10);
        System.out.println("¿Contiene la clave 10? " + clave);
        // Salida: ¿Contiene la clave 10? true
        
        // value() => Muestra todos los valores del mapa en un array
        System.out.println("Mostrar todos los valores del mapa: " + mapaEmpleado.values());
        // Salida: Mostrar todos los valores del mapa: [Roberto, Claudia, Gustavo, Nelly, Eliminar]
        
        // keySet() => Muestra todas las claves del mapa en un array
        System.out.println("Mostrar todas las claves del mapa: " + mapaEmpleado.keySet());
        // Salida: Mostrar todas las claves del mapa: [10, 11, 12, 13]
        
        // get(int) => Muestra el valor específico de la clave ingresada
        String nombreEmpleado = mapaEmpleado.get(10);
        System.out.println("El valor de esta clave es: " + nombreEmpleado);
        // Salida: El valor de esta clave es: Roberto
        
        // remove() => Remuele o elimina el valor de la clave ingresada
        mapaEmpleado.remove(14);
        System.out.println("El mapa luego de eliminar la clave 14 queda así: " + mapaEmpleado.values());
        // Salida: El mapa luego de eliminar la clave 14 queda así: [Roberto, Claudia, Gustavo, Nelly]
    }
}
