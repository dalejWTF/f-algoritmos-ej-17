/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dalejwtf
 */
public class Principal {

    public static void main(String[] args) {
        ManejoArchivos m = new ManejoArchivos();
        ArrayList<Numeros> lista;
        int[] arreglo;
        String continuar;
        int o, valorBusqueda;
        Scanner k = new Scanner(System.in).useDelimiter("\n");
        m.abrirArchivo();
        lista = m.leerRegistros();
        arreglo = m.transforar_arrayList_arreglo(lista);
        ArregloLineal al = new ArregloLineal(arreglo);
        ArregloBinario1 ab = new ArregloBinario1(arreglo);

        m.cerrarArchivo();
        do {
            System.out.print("[1] Busqueda Binaria\n[2]Busqueda Lineal\nOpcion: ");
            o = k.nextInt();
            if (o == 1) {
                System.out.print("Ingrese el numero a Buscar: ");
                valorBusqueda = k.nextInt();
                ab.busquedaBinaria(valorBusqueda);
            } else if (o == 2) {
                System.out.print("Ingrese el numero a Buscar: ");
                valorBusqueda = k.nextInt();
                System.out.println("Se encuentra en el indice: " + al.busquedaLineal(valorBusqueda));
            }
            System.out.print("Desea realizar otra busqueda?(s/n): ");
            continuar = k.next();
        } while (continuar.equalsIgnoreCase("S"));

    }

}
