/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

/**
 *
 * @author dalejwtf
 */
public class RecursividadMCD {
        
    public int obtener_mcd(int x, int y) {
       if(y==0)
           return x;
       else
           return obtener_mcd(y, x % y);
   } 
}

