 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosfor;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Torres
 */
public class Ciclosfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ciclos=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
    
        for(int i=0; i<ciclos;i++){
            
            JOptionPane.showMessageDialog(null,"Esta es la iteracion del numero "+i);
            JOptionPane.showMessageDialog(null,"Su iteracion a terminado" );
    }
        
    }
    
    
    
    
    
}
