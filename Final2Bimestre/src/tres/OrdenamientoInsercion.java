package tres;

import java.util.Random;

public class OrdenamientoInsercion {

    private int[] datos; // arreglo de valores

    // crea un arreglo 
    public OrdenamientoInsercion(int[] valores) {
        datos = valores;
    } // fin del constructor de OrdenamientoInsercion

    // ordena el arreglo usando el ordenamiento por inserci�n
    public void sort() {
        int insercion; // variable temporal para contener el elemento a insertar

        // itera a trav�s de datos.length - 1 elementos
        for (int siguiente = 1; siguiente < datos.length; siguiente++) {
            // almacena el valor en el elemento actual
            insercion = datos[siguiente];

            // inicializa ubicaci�n para colocar el elemento
            int moverElemento = siguiente;

            // busca un lugar para colocar el elemento actual
            while (moverElemento > 0 && datos[moverElemento - 1] > insercion) {
                // desplaza el elemento una posici�n a la derecha
                datos[moverElemento] = datos[moverElemento - 1];
                moverElemento--;
            } // fin de while

            datos[moverElemento] = insercion; // coloca el elemento insertado
            imprimirPasada(siguiente, moverElemento); // imprime la pasada del algoritmo
        } // fin de for
    } // fin del m�todo ordenar

    // imprime una pasada del algoritmo
    public void imprimirPasada(int pasada, int indice) {
        System.out.print(String.format("despues de pasada %2d: ", pasada));

        // imprime los elementos hasta el elemento intercambiado
        for (int i = 0; i < indice; i++) {
            System.out.print(datos[i] + "  ");
        }

        System.out.print(datos[indice] + "* "); // indica intercambio

        // termina de imprimir el arreglo en pantalla
        for (int i = indice + 1; i < datos.length; i++) {
            System.out.print(datos[i] + "  ");
        }

        System.out.print("\n               "); // para alineaci�n

        // indica la cantidad del arreglo que est� ordenado
        for (int i = 0; i <= pasada; i++) {
            System.out.print("--  ");
        }
        System.out.println("\n"); // agrega fin de l�nea
    } // fin del m�todo imprimirPasada

    // m�todo para mostrar los valores del arreglo en pantalla
    public String toString() {
        StringBuilder temporal = new StringBuilder();

        // itera a trav�s del arreglo
        for (int elemento : datos) {
            temporal.append(elemento + "  ");
        }

        temporal.append("\n"); // agrega car�cter de fin de l�nea
        return temporal.toString();
    } // fin del m�todo toString
} // fin de la clase OrdenamientoInsercion

