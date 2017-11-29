/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion del primer objeto tipo Futbolista(nombre, apellido)
        Futbolista f = new Futbolista("Antonio", "Valencia");
        //Creacion del segundo objeto tipo Futbolista(nombre, apellido, posicion, equipo)
        Futbolista f2 = new Futbolista("Alex", "Aguinaga","mediocentro","Necaxa");
        //Creacion del segundo objeto tipo Futbolista(nombre, apellido, equipo)
        Futbolista f3 = new Futbolista("Felipe", "Caicedo", "Lazio");

        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
    }
    
}
