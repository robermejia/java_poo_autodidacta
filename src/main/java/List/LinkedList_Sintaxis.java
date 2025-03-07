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
        System.out.println("LibrosLinkedList1 = " + LibrosLinkedList1);
        System.out.println("add(No ficción)==================================");
        LibrosLinkedList1.add("No ficción");
        System.out.println("LibrosLinkedList1 = " + LibrosLinkedList1);
        System.out.println("add(0,Poesía)====================================");
        LibrosLinkedList1.add(0,"Poesía");
        System.out.println("LibrosLinkedList1 = " + LibrosLinkedList1);
        System.out.println("add(1,Cómic)=====================================");
        LibrosLinkedList1.add(1,"Cómics");
        System.out.println("LibrosLinkedList1 = " + LibrosLinkedList1);
        // .add(index, obj)
        System.out.println("add(0,Novelas)===================================");
        LibrosLinkedList1.add(0,"Novelas");
        System.out.println("LibrosLinkedList1 = " + LibrosLinkedList1);
        // .add(index, obj)
        System.out.println("add(1,Arte)======================================");
        LibrosLinkedList1.add(1,"Arte");
        System.out.println("LibrosLinkedList1 = " + LibrosLinkedList1);
        // .addFirst(obj)
        System.out.println("firstIndexOf('No ficción')========================");
        LibrosLinkedList1.addFirst("No ficción");
        System.out.println("LibrosLinkedList1.addFirst('No ficción') = " + LibrosLinkedList1);
        // .addAll()
        LibrosLinkedList2.addAll(LibrosLinkedList1);
        System.out.println("addAll()=========================================");
        System.out.println("LibrosLinkedList2" + LibrosLinkedList2);
        // .get(index)
        System.out.println("get(0)===========================================");
        String libro = LibrosLinkedList1.get(0);
        System.out.println("LibrosLinkedList1.get(0) = " + libro);
        // .set(index, obj)
        System.out.println("set(0, 'No ficción')=============================");
        LibrosLinkedList1.set(0, "No ficción");
        System.out.println("LibrosLinkedList1.set(0,'No ficción') = " + LibrosLinkedList1);
        // .remove(index)
        System.out.println("remove(0)========================================");
        LibrosLinkedList1.remove(0);
        System.out.println("LibrosLinkedList1.remove('No ficción') = " + LibrosLinkedList1);
        // .remove(obj)
        System.out.println("remove('No ficción')=============================");
        LibrosLinkedList1.remove("No ficción");
        System.out.println("LibrosLinkedList1.remove('No ficción') = " + LibrosLinkedList1);
        // .size()
        System.out.println("size()===========================================");
        Integer libro1 = LibrosLinkedList1.size();
        System.out.println("LibrosLinkedList1.size() = " + libro1);
        // .contains()
        System.out.println("contains('No ficción')===========================");
        Boolean libro2 = LibrosLinkedList1.contains("No ficción");
        System.out.println("LibrosLinkedList1.contains('No ficción') = " + libro2);
        // .indexOf()
        System.out.println("indexOf('No ficción')============================");
        Integer libro3 = LibrosLinkedList1.indexOf("No ficción");
        System.out.println("LibrosLinkedList1.indexOf('No ficción') = " + libro3);
        // .lastIndexOf()
        System.out.println("lastIndexOf('No ficción')========================");
        Integer libro4 = LibrosLinkedList1.lastIndexOf("No ficción");
        System.out.println("LibrosLinkedList1.lastIndexOf('No ficción') = " + libro4);
        // .toArray()
        System.out.println("toArray()========================================");
        Object[] libro6 = LibrosLinkedList1.toArray();
        System.out.println("LibrosLinkedList1.toArray() = " + libro6);
        // .clear()
        System.out.println("clear()==========================================");
        LibrosLinkedList1.clear();
        System.out.println("LibrosLinkedList1.clear() = " + LibrosLinkedList1);
        // .isEmpty()
        System.out.println("isEmpty()========================================");
        Boolean libro7 = LibrosLinkedList1.isEmpty();
        System.out.println("LibrosLinkedList1.isEmpty() = " + libro7);
        
    }

}
