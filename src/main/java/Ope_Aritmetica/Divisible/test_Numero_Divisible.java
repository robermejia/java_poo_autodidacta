package Ejer4_Numero_Divisible;

import javax.swing.JOptionPane;

public class test_Numero_Divisible {

    public static void main(String[] args) {
        // TODO code application logic here
        Numero_Divisible divisible = new Numero_Divisible();
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número para ver si es divisible entre 2."));
        String resultado = divisible.numeroDivisible(num);
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
