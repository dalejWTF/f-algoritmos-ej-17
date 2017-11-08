/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Asignatura_Distancia extends Asignatura {
    private int numCreditos;

    public Asignatura_Distancia(int numCreditos, String nombre, double costo, String tipo) {
        super(nombre, costo, tipo);
        this.numCreditos = numCreditos;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }
    
    @Override
    public String toString(){
        return String.format("%s"
                + "Numero de Creditos: %d\n", super.toString(),getNumCreditos());
        
    }
}
