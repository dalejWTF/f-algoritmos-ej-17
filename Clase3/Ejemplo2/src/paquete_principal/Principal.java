/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import institucion.Asignatura;
import personal_docente.Titulo;
import personal_docente.Docente;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Objetos titulos para los Docentes en caso 1 y 2
        Titulo t1= new Titulo();
        Titulo t2= new Titulo();
        Titulo t3= new Titulo();
        Titulo t4= new Titulo();
        
        //Objetos asignaturas para los docentes en caso 1 y 2
        Asignatura a1= new Asignatura();
        Asignatura a2= new Asignatura();
        Asignatura a3= new Asignatura();
        Asignatura a4= new Asignatura();
        //Objetos docentes para los casos 1 y 2
        Docente d1= new Docente();
        Docente d2= new Docente();
        
        //Los Datos del 1 objeto Docente
        //Se procede a llenar los objetos con la informacion dada
        d1.agregar_nombres("Luis V.");
        d1.agregar_apellidos("Perez J.");
        
        a1.agregar_nombre("Matematica");
        a1.agregar_creditos(8);
        a2.agregar_nombre("Fisica");
        a2.agregar_creditos(6);
        
        d1.agregar_asignatura1(a1);
        d1.agregar_asignatura2(a2);
        
        t1.agregar_nombre("3er nivel: Licenciado en Físico Matemáticas");
        t1.agregar_nombre_universidad("Universidad Politécnica");
        t2.agregar_nombre("4er nivel: Magister en Docencia Matemática");
        t2.agregar_nombre_universidad("Universidad Valenciana");
        
        d1.agregar_titulo_tercer_nivel(t1);
        d1.agregar_titulo_cuarto_nivel(t2);
        
        //Los Datos del 2 objeto Docente
        //Se llena los datos de nombre y apellidos
        
        d2.agregar_nombres("Ana M.");
        d2.agregar_apellidos("Velez P.");
        
        a3.agregar_nombre("Socuales");
        a3.agregar_creditos(9);
        a4.agregar_nombre("Literatura");
        a4.agregar_creditos(10);
        
        d2.agregar_asignatura1(a1);
        d2.agregar_asignatura2(a2);
        
        t3.agregar_nombre("3er nivel: Licenciado en Ciencias Sociales");
        t3.agregar_nombre_universidad("Universidad Salesiana");
        t4.agregar_nombre("4er nivel: Magister en Docencia Social");
        t4.agregar_nombre_universidad("Universidad Cataluña");
        
        d2.agregar_titulo_tercer_nivel(t3);
        d2.agregar_titulo_cuarto_nivel(t4);
        //Presentacion de los 2 objetos docentes
        System.out.println(d1);
        System.out.println(d2);
    }
    
}
