/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ManejoArchivos {

    private Scanner entrada;

    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("archivo3.csv"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m?todo abrirArchivo

    // lee registro del archivo
    public ArrayList<Integer> leerRegistros() {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        try // lee registros del archivo, usando el objeto Scanner
        {

            while (entrada.hasNext()) {
                // System.out.println(entrada.nextLine());
                String cadena = entrada.nextLine();
                ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split("\n")));
                int num1 = Integer.parseInt(registro.get(0));
                if (num1 % 2 == 0) {
                    Integer e = new Integer(num1);
                    lista.add(e);
                }

            } // fin de while
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    }

    public int[] transforar_arrayList_arreglo(ArrayList<Integer> lista) {
        int[] arreglo = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            arreglo[i] = lista.get(i);
        }
        return arreglo;
    }
}
