/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos;

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
            entrada = new Scanner(new File("archivo2.csv"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m?todo abrirArchivo

    // lee registro del archivo
    public ArrayList<Numeros> leerRegistros() {

        ArrayList<Numeros> lista = new ArrayList<Numeros>();
        try // lee registros del archivo, usando el objeto Scanner
        {

            while (entrada.hasNext()) {
                // System.out.println(entrada.nextLine());
                String cadena = entrada.nextLine();
                ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split("\\|")));
                int num1 = Integer.parseInt(registro.get(0));
                int num2 = Integer.parseInt(registro.get(1));
                int num3 = Integer.parseInt(registro.get(2));
                Numeros e = new Numeros(num1, num2, num3);
                lista.add(e);

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

    public int[] transforar_arrayList_arreglo(ArrayList<Numeros> lista) {
        int c = 0;
        int[] arreglo = new int[lista.size() * 3];

        for (int i = 0; i < lista.size(); i++) {
            arreglo[c] = lista.get(i).getNum1();
            c++;
            arreglo[c] = lista.get(i).getNum2();
            c++;
            arreglo[c] = lista.get(i).getNum3();
            c++;
        }
        return arreglo;
    }

}
