package List;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Sintaxis {
    
        public static void main(String[] args) {
        
        // Modo 1
        LinkedList<String> LibrosLinkedList1 = new LinkedList<String>();
        LinkedList<String> LibrosLinkedList2 = new LinkedList<String>();
        
        // Modo 2
        List<String> MusicaLinkedList1 = new LinkedList<String>();
        List<String> MusicaLinkedList2 = new LinkedList<String>();
        
        // Usando Métodos más conocidos
        // .add()
        System.out.println("==================== MÉTODOS ====================");
        System.out.println("add(Novelas)=====================================");
        LibrosLinkedList1.add("Novelas");
        System.out.println("LibrosLinkedList1" + LibrosLinkedList1);
        System.out.println("add(No ficción)==================================");
        LibrosLinkedList1.add("No ficción");
        System.out.println("LibrosLinkedList1" + LibrosLinkedList1);
        System.out.println("add(0,Poesía)====================================");
        LibrosLinkedList1.add(0,"Poesía");
        System.out.println("LibrosLinkedList1" + LibrosLinkedList1);
        System.out.println("add(1,Cómic)=====================================");
        LibrosLinkedList1.add(1,"Cómics");
        System.out.println("LibrosLinkedList1" + LibrosLinkedList1);
        System.out.println("add(0,Novelas)===================================");
        LibrosLinkedList1.add(0,"Novelas");
        System.out.println("LibrosLinkedList1" + LibrosLinkedList1);
        System.out.println("add(1,Arte)======================================");
        LibrosLinkedList1.add(1,"Arte");
        System.out.println("LibrosLinkedList1" + LibrosLinkedList1);
        
        // .addAll()
        LibrosLinkedList2.addAll(LibrosLinkedList1);
        System.out.println("addAll()=========================================");
        System.out.println("LibrosLinkedList2" + LibrosLinkedList2);
            
    }

}
