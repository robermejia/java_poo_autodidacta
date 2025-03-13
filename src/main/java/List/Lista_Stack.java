package List;

import java.util.Stack;
import java.util.Vector;

public class Lista_Stack {

    public static void main(String[] args) {

        // Modo 1
        // No es una pila en el sentido estricto
        /* Aunque puedes usar un Vector para simular el comportamiento de una pila 
        (por ejemplo, usando add() para agregar elementos y remove() para eliminarlos), 
        no tiene los métodos específicos de una pila como push(), pop(), y peek().
         */
        Vector<Integer> pila = new Vector<Integer>();

        // Modo 2
        // Es una pila.
        /* Tiene métodos dedicados para operar como una pila, como push(), pop(), y peek()
         */
        Stack<Integer> pila2 = new Stack<Integer>();

        // ==================== Métodos Stack =======================
        // Agregar elementos a la pila
        // add()
        pila.add(1);
        pila.add(2);
        pila.add(3);
        pila.add(4);
        pila.add(5);

        // Agregar elementos a la pila2
        // push()
        pila2.push(1);
        pila2.push(2);
        pila2.push(3);
        pila2.push(4);
        pila2.push(5);
    
        // Recorrer Vector
        System.out.println("Elementos en Vector:");
        for (Integer elemento : pila) {
            System.out.println(elemento);
        }
        //Salida: Elementos en Vector 1 2 3 4 5

        // Recorrer Stack
        System.out.println("Elementos en Stack:");
        for (Integer elemento : pila2) {
            System.out.println(elemento);
        }
        //Salida: Elementos en Stack 1 2 3 4 5
    
        // isEmpty()
        System.out.println("¿Pila vacia?" + pila2.isEmpty());
        //Salida: ¿Pila vacia? False
    
        // pop()
        System.out.println("Pila luego de eliminar la ultima en entrar: " + pila2.pop());
        //Salida: Pila luego de eliminar la ultima en entrar 1 2 3 4
        
        System.out.println("¿Está el 3? " + pila2.search(3));
        //Salida: ¿Está el 3? True
        
        System.out.println("Ultimo agregado: " + pila2.peek());
        //Salida: Ultimo agregado: 4

    }
}
