package Casting_y_Conversion;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

public class Conversion {

    public static void main(String[] args) {

        // Ejemplo #1
        // Conversión de String a int
        String numeroComoCadena = "123";
        int numeroConvertido = Integer.parseInt(numeroComoCadena);
        System.out.println(numeroConvertido); // Salida: 123

        // Ejemplo #2
        // Conversión de String a double
        String decimalComoCadena = "45.67";
        double decimalConvertido = Double.parseDouble(decimalComoCadena);
        System.out.println(decimalConvertido); // Salida: 45.67

        // Ejemplo #3
        // Conversión de int a String
        int numero = 100;
        String numeroComoCadena1 = String.valueOf(numero);
        System.out.println(numeroComoCadena1); // Salida: "100"

        // O usando concatenación
        String otroNumeroComoCadena = numero + "";
        System.out.println(otroNumeroComoCadena); // Salida: "100"

        // Ejemplo #4
        // Conversión de double a String
        double decimal = 9.99;
        String decimalComoCadena2 = String.valueOf(decimal);
        System.out.println(decimalComoCadena2); // Salida: "9.99"

        // O usando Double.toString()
        String otroDecimalComoCadena = Double.toString(decimal);
        System.out.println(otroDecimalComoCadena); // Salida: "9.99"

        // Ejemplo #5
        // Conversión de tipos de datos numéricos
        float numeroFloat = 10.5f;
        int numeroEntero = (int) numeroFloat; // Casteo explícito
        System.out.println(numeroEntero); // Salida: 10

        int otroNumeroEntero = 20;
        double numeroDouble = otroNumeroEntero; // Casteo implícito
        System.out.println(numeroDouble); // Salida: 20.0

        // Ejemplo #6
        // Conversión de objetos
        class Animal {
        }
        class Perro extends Animal {
        }

        Animal animal = new Perro(); // Casteo implícito
        Perro perro = (Perro) animal; // Casteo explícito

        // Ejemplo #7
        // Conversión de ArrayList a Array
        ArrayList<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        String[] array = lista.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s); // Salida: uno, dos, tres
        }
        // Ejemplo #8
        // Conversión de tipos de datos de fecha
        Date fecha = new Date();
        LocalDate fechaLocal = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(fechaLocal); // Salida: fecha actual en formato LocalDate
        
        // =====================================================================
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
