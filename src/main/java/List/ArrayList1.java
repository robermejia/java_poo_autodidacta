
package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        Lista2Ejemplos person1 = new Lista2Ejemplos("Rober", "Mejia", "25", "Lima");
        Lista2Ejemplos person2 = new Lista2Ejemplos("Agustín", "Mejia", "65", "Lima");
        Lista2Ejemplos person3 = new Lista2Ejemplos("Narda", "Collazos", "60", "Lima");
        
        List<Lista2Ejemplos>Personas = new ArrayList<>();
        Personas.add(person1);
        Personas.add(person2);
        Personas.add(person3);
        
        for (Lista2Ejemplos Persona : Personas) {
            System.out.print("Persona" + Persona + "\n");
        }
        

    }

}
