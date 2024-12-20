package JOptionPane;

import javax.swing.JOptionPane;

public class test_Saludar {

    public static void main(String[] args) {
        Saludar saludo = new Saludar();
        String name = JOptionPane.showInputDialog("Ingresa el nombre de la persona a saludar.");
        
        String resultado = saludo.saludar(name);
        
        JOptionPane.showMessageDialog(null, resultado);
    }

}
