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
public class Asignatura_Presencial extends Asignatura{
    private int numHoras;

    public Asignatura_Presencial(int numHoras, String nombre, double costo, String tipo) {
        super(nombre, costo, tipo);
        this.numHoras = numHoras;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }
    
    @Override
    public String toString(){
        return String.format("%s"
                + "Numero de Horas: %d\n",super.toString(),getNumHoras());
    }
    
}
