package Ejer2_Numero_Mayor;

public class Numero_Mayor {
    int num1;
    int num2;
    
    public String numeroMayor(int num1, int num2){
        if (num1 > num2) {
            return "El primer número 'SI' es mayor al segundo.";
        } else {
            return "El primer número 'NO' es mayor al segundo";
        }
    }
}
