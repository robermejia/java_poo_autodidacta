package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Lista_ArrayList {

    public static void main(String[] args) {
        // Añadiendo datos a la clase "FamiliaNuclear"
        FamiliaNuclear person1 = new FamiliaNuclear("Rober", "Mejia", "25", "Lima");
        FamiliaNuclear person2 = new FamiliaNuclear("Agustín", "Mejia", "65", "Lima");
        FamiliaNuclear person3 = new FamiliaNuclear("Narda", "Collazos", "60", "Lima");

        // Sintaxis Forma 1: Cuando se hace referencia a una clase (FamiliaNuclear)
        List<FamiliaNuclear> personas = new ArrayList<>();
        // Sintaxis Forma 2: Cuando se hace referencia a una clase (FamiliaNuclear)
        ArrayList<FamiliaNuclear> personas2 = new ArrayList<>();

        // Método "add" para añadir elemento a la lista
        personas.add(person1);
        personas.add(person2);
        personas.add(person3);

        // Imprimiendo la lista
        for (FamiliaNuclear per : personas) {
            System.out.print("Nombre: " + per.getNombre() + "\n"
                    + "Apellido: " + per.getApellido() + "\n"
                    + "Edad: " + per.getEdad() + "\n"
                    + "Ciudad: " + per.getCiudad() + "\n");
        }
        System.out.println("==================================================");

        // Sintaxis Forma 3: Cuando se hace referencia a un tipo de dato, ejemplo: String
        ArrayList<String> familia = new ArrayList<>();

        // Método "add" para añadir elemento a la lista
        familia.add("Luisa");
        familia.add("Pedro");
        familia.add("Marcos");

        // Imprimiendo la lista
        for (String fam : familia) {
            System.out.print("Familia: " + fam + "\n");
        }

        
        // Ejemplos de métodos
        // Añadir un elemento a la lista
        familia.add("Luis");
        System.out.println(familia);
        System.out.println("=================================================");

        // Añadir un elemento a la lista en un posición específica "3"
        familia.add(3, "Pedro");
        System.out.println(familia);
        System.out.println("=================================================");

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + familia.size());
        System.out.println("=================================================");
        
        // Obtener elemento de la lista
        System.out.println("Elemento en posición 2: " + familia.get(2));
        System.out.println("=================================================");

        // Comprobando si contiene un elemento
        System.out.println("¿Contiene 'Pedro'? " + familia.contains("Pedro"));
        System.out.println("=================================================");

        // Removiendo un elemento
        familia.remove(4);
        System.out.println(familia);
        System.out.println("=================================================");

        // Limpiando la lista
        familia.clear();
        System.out.println("Lista después de limpiar: " + familia);
        System.out.println("=================================================");

        // Comprobando si está vacía
        System.out.println("¿Está vacía? " + familia.isEmpty());
        System.out.println("=================================================");

        // Copiando un ArrayList
        ArrayList<String> arrayListCopia = (ArrayList<String>) familia.clone();
        System.out.println("Copia de la lista: " + arrayListCopia);
        System.out.println("=================================================");

        // Pasando el ArrayList a un Array
        FamiliaNuclear[] famArray = personas.toArray(new FamiliaNuclear[0]);

        // Convertir el array a una cadena (usando Arrays.toString)
        System.out.println("Array: " + Arrays.toString(famArray));
        System.out.println("=================================================");
    }
}
