/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;
import java.lang.Exception;
/**
 *
 * @author dauloa2 <danielulloam@gmail.com>
 */
public class Computadora2 {
    private double velocidad_procesador;

    public double obtener_velocidad_procesador() {
        return velocidad_procesador;
    }

    public void establecer_velocidad_procesador(double velocidad_procesador) {
        if (velocidad_procesador > 5.0) 
            this.velocidad_procesador=5;
           
        else
            this.velocidad_procesador = velocidad_procesador;
    }   
    
    
}
