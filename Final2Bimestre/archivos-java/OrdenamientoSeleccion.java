package seleccion;

import java.util.Random;

public class OrdenamientoSeleccion
{
   private int[] datos; // arreglo de valores
   
   // usa el constructor 
   public OrdenamientoSeleccion( int [] valores )
   {
      datos = valores;
   } // fin del constructor de OrdenamientoSeleccion

   // ordena el arreglo usando el ordenamiento por selecci�n
   public void ordenar()
   {
      int masPequenio; // �ndice del elemento m�s peque�o

      // itera a trav�s de datos.length - 1 elementos
      for ( int i = 0; i < datos.length - 1; i++ )
      {
         masPequenio = i; // primer �ndice del resto del arreglo

         // itera para buscar el �ndice del elemento m�s peque�o
         for ( int indice = i + 1; indice < datos.length; indice++ )
            if ( datos[ indice ] < datos[ masPequenio ] )
               masPequenio = indice;

         intercambiar( i, masPequenio ); // intercambia el elemento m�s peque�o en la posici�n
         imprimirPasada( i + 1, masPequenio ); // imprime la pasada del algoritmo
      } // fin de for exterior
   } // fin del m�todo ordenar

   // m�todo ayudante para intercambiar los valores de dos elementos
   public void intercambiar( int primero, int segundo )
   {
      int temporal = datos[ primero ]; // almacena primero en temporal
      datos[ primero ] = datos[ segundo ]; // sustituye primero con segundo
      datos[ segundo ] = temporal; // coloca temporal en segundo
   } // fin del m�todo intercambiar

   // imprime una pasada del algoritmo
   public void imprimirPasada( int pasada, int indice )
   {
      System.out.print( String.format( "despues de pasada %2d: ", pasada ) );

      // imprime elementos hasta el elemento seleccionado
      for ( int i = 0; i < indice; i++ )
         System.out.print( datos[ i ] + "  " );

      System.out.print( datos[ indice ] + "* " ); // indica intercambio

      // termina de imprmir el arreglo en pantalla
      for ( int i = indice + 1; i < datos.length; i++ )
         System.out.print( datos[ i ] + "  " );
     
      System.out.print( "\n               " ); // para alineaci�n

      // indica la cantidad del arreglo que est� almacenada
      for( int j = 0; j < pasada; j++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // agrega fin de l�nea
   } // fin del m�todo imprimirPasada

   // m�todo para imprimir los valores del arreglo
   public String toString()
   {
      StringBuilder temporal = new StringBuilder();

      // itera a trav�s del arreglo
      for ( int elemento : datos )
         temporal.append( elemento + "  " );

      temporal.append( "\n" ); // agrega car�cter de nueva l�nea
      return temporal.toString();
   } // fin del m�todo toString
} // fin de la clase OrdenamientoSeleccion



