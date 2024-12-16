package Ope_Aritmetica.Factorial;

public class Factorial {
    
    public static int calcularFactorial(int n) {
        int factorial = 0;
        for (int i = 1; i <= n; i++) {
            factorial += i;
        }
        return factorial;
    }
}
