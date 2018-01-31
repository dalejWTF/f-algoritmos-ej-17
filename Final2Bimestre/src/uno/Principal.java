/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Principal {

    public static void main(String[] args) {
        ManejoArchivos m = new ManejoArchivos();
        ArrayList<Numeros> lista;
        m.abrirArchivo();
        lista = m.leerRegistros();
        m.cerrarArchivo();
        for (Numeros lista1 : lista) {
            System.out.println(lista1);

        }
        m.Sumatoria_Promedio(lista);
    }

}
