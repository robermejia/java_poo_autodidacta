package Exeptions;

import javax.swing.*;
// Uso de recursividad con el método main(args) y System.exit(0) para mostrar 0 errores.;
public class Recursividad {
    public static void main(String[] args) {
        int x,y;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un número"));
            y = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese otro número"));
            JOptionPane.showConfirmDialog(null,"la division de " + x + " + " + y + " es: " + (x/y));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Este caracter no es admite letras.");
            main(args);
            System.exit(0);
        } catch (ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Este caracter no es admite cero.");
            main(args);
            System.exit(0);
        }
    }
}
