/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author dauloa2 <danielulloam@gmail.com>
 */
public class Computadora3 {
    private double velocidad_procesador;

    public double obtener_velocidad_procesador() {
        return velocidad_procesador;
    }

    public void establecer_velocidad_procesador(double velocidad_procesador){
        if (velocidad_procesador > 5.0) 
            this.velocidad_procesador=5;
           
        else
            this.velocidad_procesador = velocidad_procesador;
    }   
    
    @Override
    public String toString(){
        return String.format("%s con velocidad de: %.2fGHz", "Computadora",obtener_velocidad_procesador());
    }
}
