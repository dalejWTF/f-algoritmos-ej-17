package busquedaBinaria;


import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroes
 */
public class ArregloBinario1 {
   private int[] datos;
    

    // crea un arreglo de un tama�o dado y lo llena con enteros aleatorios
    public ArregloBinario1(int [] valores) {
    	datos = valores;
        Arrays.sort(datos);
    } // fin del constructor de ArregloBinario

    // realiza una b�squeda binaria en los datos
    public int busquedaBinaria(int elementoBusqueda) {
        int inferior = 0; // extremo inferior del �rea de b�squeda
        int superior = datos.length - 1; // extremo superior del �rea de b�squeda
        int medio = (inferior + superior + 1) / 2; // elemento medio
        int ubicacion = -1; // devuelve el valor; -1 si no lo encontr�
        
        System.out.println("medio antes de iterar en el while..." + medio);
        
        do // ciclo para buscar un elemento
        {
            // imprime el resto de los elementos del arreglo
            System.out.print(elementosRestantes(inferior, superior));

            // si el elemento se encuentra en medio
            if (elementoBusqueda == datos[medio]) {
                ubicacion = medio; // la ubicaci�n es el elemento medio actual
            } // el elemento medio es demasiado alto
            else if (elementoBusqueda < datos[medio]) {
                superior = medio - 1; // elimina la mitad superior
            } else // el elemento medio es demasiado bajo
            {
                inferior = medio + 1; // elimina la mitad inferior
            }
            medio = (inferior + superior + 1) / 2; // recalcula el elemento medio
            System.out.println("medio ..."+medio);
        } while ((inferior <= superior) && (ubicacion == -1));

        return ubicacion; // devuelve la ubicaci�n de la clave de b�squeda
    } // fin del m�todo busquedaBinaria

    // m�todo para imprimir ciertos valores en el arreglo
    public String elementosRestantes(int inferior, int superior) {
        StringBuilder temporal = new StringBuilder();

        // imprime espacios para alineaci�n
        for (int i = 0; i < inferior; i++) {
            temporal.append("   ");
        }

        // imprime los elementos que quedan en el arreglo
        for (int i = inferior; i <= superior; i++) {
            temporal.append(datos[i] + " ");
        }

        temporal.append("\n");
        return temporal.toString();
    } // fin del m�todo elementosRestantes

    // m�todo para imprimir los valores en el arreglo
    public String toString() {
        return elementosRestantes(0, datos.length - 1);
    } // fin del m�todo toString   
} // fin de la clase ArregloBinario

