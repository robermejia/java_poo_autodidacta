
package Enum;

import javax.swing.JOptionPane;

public class Enun {

    public enum DIAS_SEMANA {
        LUNES, MARTES, MIERCOLES, JUEVES,VIERNES, SÁBADO, DOMINGO
    }
    
    public static void enunciado() {

        try {
            String diaIngresado = JOptionPane.showInputDialog(null, "Ingresa un día de la semana:");
            DIAS_SEMANA dia = DIAS_SEMANA.valueOf(diaIngresado.toUpperCase());
            JOptionPane.showMessageDialog(null, "El día del enum es: " + dia);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "El día ingresado no es válido.");
        }
    }
   
    
    public static void main(String[] args) {
       
        for (int i = 0; i < 4; i++) {
            enunciado();
        }
        
        for (DIAS_SEMANA dias : DIAS_SEMANA.values()) {
            System.out.println("ENUM: " + dias);
        }
        
    }
}
