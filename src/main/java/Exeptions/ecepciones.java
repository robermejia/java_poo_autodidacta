package Exeptions;

import javax.swing.JOptionPane;

public class ecepciones {
    public static void main(String[] args) {
        int x, y;
        
        for (int i = 0; i < 4; i++) {
            
            try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Ingrese un número"));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Ingrese otro número"));
            JOptionPane.showConfirmDialog(null,"la division de " + x + " + " + y + " es: " + (x/y));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Este caracter no es admite letras.");
            } catch (ArithmeticException c){
                JOptionPane.showMessageDialog(null, "Este caracter no es admite cero.");
            }     
        }
        
    }
}