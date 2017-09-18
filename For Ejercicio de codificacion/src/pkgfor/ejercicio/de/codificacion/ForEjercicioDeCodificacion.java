/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.ejercicio.de.codificacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Torres
 */
public class ForEjercicioDeCodificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ciclo=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de repeticiones del letrero"));
        
        for(int i =0; i<ciclo;i++){
        
         JOptionPane.showMessageDialog(null,"Restaurante para programadores "+i);
    
    }
        
    }
    
}
