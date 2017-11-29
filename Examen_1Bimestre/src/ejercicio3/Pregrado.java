/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Pregrado extends Estudiante {
    private String area;
    private double costoAdicional;

    public Pregrado(String area, double costoAdicional, String nombre, String apellido, String cedula, int numMaterias, int edad, double costoMateria) {
        super(nombre, apellido, cedula, numMaterias, edad, costoMateria);
        this.area = area;
        this.costoAdicional = costoAdicional;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    @Override
    public double costoMatricula() {
        return getNumMaterias()*getCostoMateria()+(getNumMaterias()*getCostoAdicional());
    }
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "Área de estudios: %s\n" 
                + "Costo adicional por materia: $%.2f\n" 
                + "Costo de matricula: $%.2f\n",super.toString(),getArea(),getCostoAdicional(),costoMatricula());
    }
}
