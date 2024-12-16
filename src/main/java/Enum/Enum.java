// Enum parte 1

package Enum;

import javax.swing.JOptionPane;


public class Enum {
    
    public enum DIAS_SEMANA {
        LUNES, MARTES, MIERCOLES, JUEVES,VIERNES, SÁBADO, DOMINGO
    }
    
    public static void enuncito() {
        String diaIngresado = JOptionPane.showInputDialog(null, "Ingresa un día de la semana:");

        try {
            DIAS_SEMANA dia = DIAS_SEMANA.valueOf(diaIngresado.toUpperCase());
            JOptionPane.showMessageDialog(null, "El día del enum es: " + dia);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "El día ingresado no es válido.");
        }
    }
   
    
    public static void main(String[] args) {
       
        for (DIAS_SEMANA dias : DIAS_SEMANA.values()) {
            JOptionPane.showMessageDialog(null, "ENUM: " + dias);
        }
        
        
    }
    
}
