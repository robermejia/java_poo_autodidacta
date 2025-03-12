package Casting_y_Conversion;

public class Casting {
    public static void main(String[] args) {
        
        /* Casteo: Es un tipo específico de conversión que se refiere a la 
        transformación de tipos de datos dentro de la jerarquía de tipos de 
        Java, ya sea de forma implícita o explícita.
        Conversión: Es un término más amplio que incluye cualquier tipo de 
        transformación de datos, incluyendo el casteo, pero también abarca otras 
        transformaciones que pueden no estar relacionadas con la jerarquía de 
        tipos.
        */
        
        int numero = 100;
        double decimal = numero; // Casteo implícito
        int otroNumero = (int) 9.99; // Casteo explícito

        int num = 10;
        double numDouble = (double) num;
        System.out.println("Casteo exitosa: " + numDouble);

        int numInt = 30000;
        short numShort = (short) numInt;
        System.out.println("Casteo exitosa: " + numShort);

        int num2Int = 40000;
        long numLong = (long) num2Int;
        System.out.println("Casteo exitosa: " + numLong);

        // NOTA: Esto es una conversion no un casteo
        int num3Int = 50000;
        String cadenaInteger = Integer.toString(num3Int);
        System.out.print("La conversion fue exitosa: " + cadenaInteger);
    }
}
