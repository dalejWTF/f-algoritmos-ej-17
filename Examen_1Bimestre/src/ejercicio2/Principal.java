    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Principal {
    public static void main(String[] args) {
        //Objetos Autor necesarios para el objeto Libro
        Autor a1= new Autor("Luis","Alcivar");
        Autor a2= new Autor("Ana","Salas");
        Autor a3= new Autor("Hugo","Suarez");
        //Constructor Libro( revisor,  id,  autor_principal,  autor_secundario,  numPaginas) 
        Libro l1= new Libro(a3,12345,a1,a2,500);
        
        //Objetos Autor necesarios para objeto Investigacion
        Autor au1= new Autor("Carlos","Morales");
        Autor au2= new Autor("Fabian","Gallardo");
        //Constructor Investigacion(universidad, areaInvestigacion, id, autor_principal, autor_secundario, numPaginas)
        Investigacion i1= new Investigacion("Universidad Técnica Particular de Loja","Biológica",14789,au1,au2,50);
        
        //Objetos Autor necesarios para el objeto Revista_Deportiva
        Autor autor1= new Autor("Luis","Alcivar");
        Autor autor2= new Autor("Ximena","Delgado");
        Autor reportero= new Autor("Angel","Leon");
        //Constructor Revista_Deportiva(nombre, nombreDeporte, reportero, id, autor_principal, autor_secundario, numPaginas)
        RevistaDeportiva r1= new RevistaDeportiva("Estadio","Futbol",reportero,54321,autor1,autor2,100);
        
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(r1);
    }
    
}
