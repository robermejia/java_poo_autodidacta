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

        
        // add(String/Obj) => Método para añadir elemento a la lista
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
        
        // Salida: Nombre: Rober
        // Salida: Apellido: Mejia
        // Salida: Edad: 25
        // Salida: Ciudad: Lima
        // Salida: Nombre: Agust�n
        // Salida: Apellido: Mejia
        // Salida: Edad: 65
        // Salida: Ciudad: Lima
        // Salida: Nombre: Narda
        // Salida: Apellido: Collazos
        // Salida: Edad: 60
        // Salida: Ciudad: Lima
        // =================================================

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
        
        // Salida: Familia: Luisa
        // Salida: Familia: Pedro
        // Salida: Familia: Marcos
        // =================================================
        System.out.println("=================================================");
        
        // Ejemplos de métodos
        // add(String/obj) => Añadir un elemento a la lista
        familia.add("Luis");
        System.out.println(familia);
        // Salida: [Luisa, Pedro, Marcos, Luis]
        // =================================================
        System.out.println("=================================================");

        // add(index, obj) => Añadir un elemento a la lista en un posición específica "3"
        familia.add(3, "Pedro");
        System.out.println(familia);
        // Salida: [Luisa, Pedro, Marcos, Pedro, Luis]
        // =================================================
        System.out.println("=================================================");

        // .size() => Tamaño de la lista
        System.out.println("Tamaño de la lista: " + familia.size());
        // Salida: Tama�o de la lista: 5
        //=================================================

        System.out.println("=================================================");
        
        // .get(index) => Obtener elemento de la lista
        System.out.println("Elemento en posición 2: " + familia.get(2));
        // Salida: Elemento en posici�n 2: Marcos
        //=================================================
        System.out.println("=================================================");

      
        // .constain(obj) => Comprobando si contiene un elemento
        System.out.println("¿Contiene 'Pedro'? " + familia.contains("Pedro"));
        // Salida: ¿Contiene 'Pedro'? true
        //=================================================
        System.out.println("=================================================");

        // .remove(index) => Removiendo un elemento
        familia.remove(4);
        System.out.println(familia);
        // Salida: [Luisa, Pedro, Marcos, Pedro]
        //=================================================
        System.out.println("=================================================");

        // .clear() => Limpiando la lista
        familia.clear();
        System.out.println("Lista después de limpiar: " + familia);
        // Salida: Lista despu�s de limpiar: []
        //=================================================
        System.out.println("=================================================");

        // .isEmpty() => Comprobando si está vacía
        System.out.println("¿Está vacía? " + familia.isEmpty());
        //Salida: ¿Est� vacía? true
        //=================================================
        System.out.println("=================================================");

        // .clone() => Copiando un ArrayList
        ArrayList<String> arrayListCopia = (ArrayList<String>) familia.clone();
        System.out.println("Copia de la lista: " + arrayListCopia);
        // Salida: Copia de la lista: []
        //=================================================
        System.out.println("=================================================");

        // .toArray() => Pasando el ArrayList a un Array
        FamiliaNuclear[] famArray = personas.toArray(new FamiliaNuclear[0]);
        // Convertir el array a una cadena (usando Arrays.toString)
        System.out.println("Array: " + Arrays.toString(famArray));
        // Salida: Array: [Rober Mejia (25, Lima), Agust�n Mejia (65, Lima), Narda Collazos (60, Lima)]
        //=================================================
        System.out.println("=================================================");
    }
}
