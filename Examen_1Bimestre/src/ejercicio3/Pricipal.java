/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Pricipal {
    public static void main(String[] args) {
        double total=0;
            ArrayList <Estudiante> estudiantes= new ArrayList<>();
            //Constructor Objeto Estudiante Postgrado( modalidad, descuento, nombre, apellido, cedula,  numMaterias, edad, costoMateria)
            estudiantes.add(new Postgrado("Distancia",20,"Julio","Andrade","345678",10,20,200));
            //Constructor Objeto Estudiante Pregrado( area, costoAdicional, nombre, apellido, cedula, numMaterias, edad, costoMateria)
            estudiantes.add(new Pregrado("Informatica",50,"Monica","Auquilla","219875",5,21,500));
            //Construcor Objeto Estudiante Tecnologia( costoAdicionalFijo, nombre, apellido, cedula, numMaterias, edad, costoMateria)
            estudiantes.add(new Tecnologia(400,"Marco","Hidalgo","765431",8,22,400));
            
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
            total+=estudiante.costoMatricula();
        }
            System.out.printf("El precio total de Matriculas es: $%.2f\n",total);
    }       
    
    
}
