/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Principal {
    public static void main(String[] args) {
        Asignatura_Presencial ap1= new Asignatura_Presencial(180,"Programacion",100,"Comun");
        System.out.println(ap1);
        
        Asignatura_Distancia ad1= new Asignatura_Distancia(6,"Literatura",300,"Tronal");
        System.out.println(ad1);
    }
}
