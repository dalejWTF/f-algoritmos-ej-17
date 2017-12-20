/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b_clase2;

import java.util.ArrayList;

/**
 *
 * @author daulloa2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManejoArchivo aplicacion = new ManejoArchivo();

        aplicacion.abrirArchivo();
        ArrayList<Estudiante> lista =  aplicacion.leerRegistros();
        Paralelo p = new Paralelo();
        p.setListaEstudiante(lista);
        aplicacion.cerrarArchivo();
        System.out.println(p.MediaEdad());
        
    }
    
}
