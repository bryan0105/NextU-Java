/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch.ejecicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Torres
 */
public class TrycatchEjecicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero entero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero entero"));
        int menu=0;
        do{
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n1.Sumar\n2.Restar\n3.Multiplicar\n0.Salir"));
           
                switch(menu){
                
                    case 1:
                        JOptionPane.showMessageDialog(null, "La suma de los valores es "+ (num1 + num2));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "La  Resta de los valores es " + (num1 - num2));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "La multiplicacion de los valores es " + (num1 * num2));
                        break;
                
                }
            } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "El dato ingresado debe ser numerico ");
            } catch (NumberFormatException er) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan datos numericos");
            }
             
        }while(menu!=0);{}
    }
    
}
