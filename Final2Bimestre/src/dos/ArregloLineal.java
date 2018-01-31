package dos;

// Fig 16.2: ArregloLineal.java
// Clase que contiene un arreglo de enteros aleatorios y un m�todo 
// que busca en ese arreglo, en forma secuencial.
import java.util.Random;

public class ArregloLineal {

    private int[] datos; // arreglo de valores

    // crea un arreglo de un tama�o dado, y lo rellena con enteros aleatorios
    public ArregloLineal(int[] valores) {
        datos = valores; // crea un espacio para el arreglo

    } // fin del constructor de ArregloLineal

    // realiza una b�squeda lineal en los datos
    public int busquedaLineal(int claveBusqueda) {
        // itera a trav�s del arreglo en forma secuencial
        for (int indice = 0; indice < datos.length; indice++) {
            if (datos[indice] == claveBusqueda) {
                return indice; // devuelve el �ndice del entero
            }
        }
        return -1; // no se encontr� el entero
    } // fin del m�todo busquedaLineal

    // m�todo para imprimir los valores del arreglo
    @Override
    public String toString() {
        StringBuilder temporal = new StringBuilder();

        // itera a trav�s del arreglo
        for (int elemento : datos) {
            temporal.append(elemento + "\t");
        }

        temporal.append("\n"); // agrega el car�cter de nueva l�nea
        return temporal.toString();
    } // fin del m�todo toString
} // fin de la clase ArregloLineal

