/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner(System.in);
        
        int numero=0, respuesta;
        
        System.out.print("Ingrese el numero que desea la tabla de multiplicar: ");
        numero= teclado.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            
            respuesta= numero *i;
            System.out.printf("%d x %d = %d\n",numero,i,respuesta);
            
        }
    }
    
}
