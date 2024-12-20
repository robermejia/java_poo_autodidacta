package Conversiones;

public class Conversiones {

    public static void main(String[] args) {
        //  MODO 1
        String numeroString = "300";
        int num = Integer.parseInt(numeroString);
        System.out.println(num);

        String numeroCadena = "300.5";
        double num2 = Double.parseDouble(numeroCadena);
        System.out.println(num2);

        String cadenaBolean = "TRUE";
        boolean verdadero = Boolean.parseBoolean(cadenaBolean);
        System.out.println(verdadero);

        int numeroLetras = 100;
        String num3 = Integer.toString(numeroLetras);
        System.out.println(num3);

        // MODO 2
        short numShort = 10;
        String cadenaShort = String.valueOf(numShort);
        System.out.println(cadenaShort);

        int numInteger = 100;
        String cadenaInteger = String.valueOf(numInteger);
        System.out.println(cadenaInteger);

        long numLong = 1000;
        String cadenaLong = String.valueOf(numLong);
        System.out.println(cadenaLong);

        double numDouble = 100.5d;
        String cadenaDouble = String.valueOf(numDouble);
        System.out.println(cadenaDouble);

        float numFloat = 200.5f;
        String cadenaFloat = String.valueOf(numFloat);
        System.out.println(cadenaFloat);

        boolean booleanVerdadero = false;
        String cadenaVerdadero = String.valueOf(booleanVerdadero);
        System.out.println(booleanVerdadero);

    }
}
