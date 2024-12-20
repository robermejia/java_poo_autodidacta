package Lanbda;

public class Lanbda {
    public static void main(String[] args) {

        // .transform()
        // Expresiones Lanbda con Strings
        String curso = "Java";
        String profesor = "Roberto Mejía";

        String concatenado = curso.transform(c -> {
            return c + " Realizado por el profesor " + profesor;
        });

        System.out.println(concatenado);
    }
}
