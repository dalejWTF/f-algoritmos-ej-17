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
public abstract class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private int numMaterias;
    private int edad;
    private double costoMateria;

    public Estudiante(String nombre, String apellido, String cedula, int numMaterias, int edad, double costoMateria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numMaterias = numMaterias;
        this.edad = edad;
        this.costoMateria = costoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCostoMateria() {
        return costoMateria;
    }

    public void setCostoMateria(double costoMateria) {
        this.costoMateria = costoMateria;
    }
    
    public abstract double costoMatricula();

    @Override
    public String toString(){
        return String.format("%s %s\n"
                + "Cedula: %s\n"
                + "Edad: %d\n"
                + "Numero de Materias: %d\n"
                + "Costo de Materia: %.2f",getNombre(),getApellido(),getCedula(),getEdad(),getNumMaterias(),getCostoMateria());
    }
}
