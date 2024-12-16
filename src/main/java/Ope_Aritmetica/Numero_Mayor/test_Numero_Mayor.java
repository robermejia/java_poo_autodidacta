package Ejer2_Numero_Mayor;

import javax.swing.JOptionPane;

public class test_Numero_Mayor {

    public static void main(String[] args) {
        Numero_Mayor ope1 = new Numero_Mayor();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        
        String resultado = ope1.numeroMayor(num1, num2);
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }

}
