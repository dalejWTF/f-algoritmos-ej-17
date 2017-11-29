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
public class Tecnologia extends Estudiante{
    private double costoAdicionalFijo;

    public Tecnologia(double costoAdicionalFijo, String nombre, String apellido, String cedula, int numMaterias, int edad, double costoMateria) {
        super(nombre, apellido, cedula, numMaterias, edad, costoMateria);
        this.costoAdicionalFijo = costoAdicionalFijo;
    }

    public double getCostoAdicionalFijo() {
        return costoAdicionalFijo;
    }

    public void setCostoAdicionalFijo(double costoAdicionalFijo) {
        this.costoAdicionalFijo = costoAdicionalFijo;
    }
    
    @Override
    public double costoMatricula() {
        return (getNumMaterias()*getCostoMateria())+getCostoAdicionalFijo();
    }
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "Costo adicional fijo: $%.2f\n" 
                + "Costo de matricula: $%.2f\n", super.toString(),getCostoAdicionalFijo(),costoMatricula());
    }
}
