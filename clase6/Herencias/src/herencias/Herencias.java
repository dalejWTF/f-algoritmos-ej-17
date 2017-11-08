/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import ejemplo1.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Asignatura_Presencial asignaturas[]= new Asignatura_Presencial[2];
        
        asignaturas[0]= new Asignatura_Presencial(180,"Programacion",100,"Comun");
        asignaturas[1]= new Asignatura_Presencial(200,"Literatura",300,"Tronal");
        
        
        Estudiante e= new Estudiante("Rene","Elizalde",34,asignaturas);
        System.out.println(e);
    }
    
}
