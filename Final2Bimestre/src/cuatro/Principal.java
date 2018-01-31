/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import java.util.Scanner;

/**
 *
 * @author dalejwtf
 */
public class Principal {

    public static void main(String[] args) {
        RecursividadMCD mcd = new RecursividadMCD();
        int num1, num2;
        Scanner k = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = k.nextInt();
        System.out.print("Ingrese el primer numero: ");
        num2 = k.nextInt();

        int rta = mcd.obtener_mcd(num1, num2);
        System.out.printf("El MCD de %d y %d es %d\n", num1, num2, rta);
    }

}
