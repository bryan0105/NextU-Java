/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores1.operaciones.arismeticas;

import java.util.Scanner;

/**
 *
 * @author Bryan Torres
 */
public class Operadores1OperacionesArismeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el numero que desea calcular ");
        int a = teclado.nextInt();
        int b=5;
        
        System.out.println("Esta es la suma "+ (a+b));
        System.out.println("Esta es la Resta "+ (a-b));
        System.out.println("Esta es la Multiplicacion "+ (a*b));
        System.out.println("Esta es la Division "+ (a/b));
        System.out.println("Esta es el modulo "+ (a%b));
        
        a+=6;
        b-=5;
        System.out.println("Este es el resultado "+ a);
        System.out.println("Este es el resultado "+ b);
    }
    
}
