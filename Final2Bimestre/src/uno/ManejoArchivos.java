/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

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
            entrada = new Scanner(new File("archivo1.csv"));
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
                int num4 = Integer.parseInt(registro.get(3));
                Numeros e = new Numeros(num1, num2, num3, num4);
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

    public void Sumatoria_Promedio(ArrayList<Numeros> lista) {
        int suma = 0;
        double promedio;
        int div = lista.size() * 4;
        for (Numeros lista1 : lista) {
            suma += lista1.getNum1();
            suma += lista1.getNum2();
            suma += lista1.getNum3();
            suma += lista1.getNum4();
        }
        promedio = (double) suma / (lista.size() * 4);
        System.out.printf("La sumatoria es: %d y el promedio es: %.2f\n", suma, promedio);

    }

}
