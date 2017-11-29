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
public class Postgrado extends Estudiante{
    private String modalidad;
    private double descuento;

    public Postgrado(String modalidad, double descuento, String nombre, String apellido, String cedula, int numMaterias, int edad, double costoMateria) {
        super(nombre, apellido, cedula, numMaterias, edad, costoMateria);
        this.modalidad = modalidad;
        this.descuento = descuento;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    @Override
    public double costoMatricula() {
        return getNumMaterias()*getCostoMateria()-(getNumMaterias()*getCostoMateria()*(getDescuento()/100));
    }
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "Modalidad: %s\n"
                + "Porcentaje Descuento: %.2f\n"
                + "Costo de Matricula: %.2f\n", super.toString(),getModalidad(),getDescuento(), costoMatricula());
    }
    
}
