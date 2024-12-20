package Exeptions;

import javax.swing.JOptionPane;

public class Throw {

    public static void main(String[] args) {
      
    int x,y,n,m;
        
    for (int i = 0; i < 2; i++) {
            try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para sumarlo."));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número para sumarlo."));
                sumar(x, y); 
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para dividirlo."));
            m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número para dividirlo."));
                dividir(n, m);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Este valor es una letra y no un número.");
            } catch (ArithmeticException a) {
                JOptionPane.showMessageDialog(null, "Este valor no es un valor válido, no se puede dividir entre 0.");
            }
        }
    }
    public static int sumar(int num1, int num2) {
        int num3 = 0;
        num3 = num1 + num2;
        JOptionPane.showMessageDialog(null, "La suma de " + num1 + " y " + num2 + " es: " + num3);
        return num3;
    }
    
    public static int dividir(int num1, int num2) throws ArithmeticException {
        int num3 = 0;
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        num3 = num1 / num2;
        JOptionPane.showMessageDialog(null, "La division de " + num1 + " y " + num2 + " es: " + num3);
        return num3;
    }
}
