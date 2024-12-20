package Casting;

public class Casting {
    public static void main(String[] args) {

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
