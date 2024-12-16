package Ope_Aritmetica;

import javax.swing.JOptionPane;

public class test_Operacion_Aritmetico {

    public static void main(String[] args) {
        Operacion_Aritmetica ope1 = new Operacion_Aritmetica();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
     
        int resultado1 = ope1.suma(num1, num2);
        int resultado2 = ope1.resta(num1, num2);
        int resultado3 = ope1.multiplicacion(num1, num2);
        int resultado4 = ope1.division(num1, num2);
        int resultado5 = ope1.modulo(num1, num2);
        
        System.out.println("La suma es: " + resultado1);
        System.out.println("La resta es: " + resultado2);
        System.out.println("La multiplicación es: " + resultado3);
        System.out.println("La division es: " + resultado4);
        System.out.println("El módulo es: " + resultado5);
    }

}
