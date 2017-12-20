/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b_clase2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author daulloa2
 */
public class ManejoArchivo {
    private Scanner entrada;
    
       public void abrirArchivo()
   {
      try
      {
         entrada = new Scanner( new File( "archivo.csv" ) );
      } // fin de try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error al abrir el archivo." );
         System.exit( 1 );
      } // fin de catch
   } // fin del m�todo abrirArchivo

   // lee registro del archivo
   public ArrayList<Estudiante> leerRegistros()
   {
      
      ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
      try // lee registros del archivo, usando el objeto Scanner
      {
         
         while ( entrada.hasNext() )
         {
             // System.out.println(entrada.nextLine());
             String cadena = entrada.nextLine();
             ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split(",")));

             String apellidos = registro.get(0);
             String nombre = registro.get(1);
             int edad = Integer.parseInt(registro.get(2));
             Estudiante e = new Estudiante(nombre, apellidos, edad);
             lista.add(e);
                    
         } // fin de while
      } // fin de try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "El archivo no esta bien formado." );
         entrada.close();
         System.exit( 1 );
      } // fin de catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error al leer del archivo." );
         System.exit( 1 );
      } // fin de catch
      return lista;
   } 
    
   public void cerrarArchivo()
   {
      if ( entrada != null )
         entrada.close(); // cierra el archivo
   } 
    
}
