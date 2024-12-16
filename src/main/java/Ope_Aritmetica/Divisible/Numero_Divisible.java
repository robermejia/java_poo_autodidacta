package Ejer4_Numero_Divisible;

public class Numero_Divisible {

    int num;

    public String numeroDivisible(int num) {
        if (num % 2 == 0) {
            return "Este número 'SI' es divisible entre 2.";
        } else {
            return "Este número 'NO' es divisible entre 2.";
        }
    }
}
