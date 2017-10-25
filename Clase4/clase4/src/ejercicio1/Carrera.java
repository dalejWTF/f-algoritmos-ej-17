/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Carrera {
    private String nombre;
    private String modalidad;

    public Carrera(){}
    public Carrera(String modalidad) {
        this.modalidad = modalidad;
    }

    public Carrera(String nombre, String modalidad) {
        this.nombre = nombre;
        this.modalidad = modalidad;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_modalidad() {
        return modalidad;
    }

    public void establecer_modalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
    
}
