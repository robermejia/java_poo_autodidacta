package Ope_Aritmetica.Factorial;

import javax.swing.JOptionPane;

public class test_Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        String num1 = JOptionPane.showInputDialog("INGRESA EL NÚMERO: ");
        int num2 = Integer.parseInt(num1);
        int num3 = Factorial.calcularFactorial(num2);
        JOptionPane.showMessageDialog(null, num3);
        // 5+4+3+2+1=15
    }
    
}
