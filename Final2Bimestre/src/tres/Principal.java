/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author dalejwtf
 */
public class Principal {

    public static void main(String[] args) {
        ManejoArchivos m = new ManejoArchivos();
        ArrayList<Integer> lista;
        int[] arreglo;
        m.abrirArchivo();
        lista = m.leerRegistros();
        m.cerrarArchivo();
        arreglo = m.transforar_arrayList_arreglo(lista);
        OrdenamientoInsercion oi = new OrdenamientoInsercion(arreglo);
        oi.sort();
        System.out.println("Lista ordenada con Collections Sort");
        Collections.sort(lista);
        for (Integer lista1 : lista) {
            System.out.print(lista1 + " ");

        }
        System.out.println("\nArreglo ordenado por Ordenamiento Insercion");
        System.out.println(Arrays.toString(arreglo));

    }

}
