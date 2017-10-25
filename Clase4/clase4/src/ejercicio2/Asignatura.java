/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;

    public Asignatura(Carrera carrera) {
        this.nombre = "Informatica";
        this.creditos = 5;
        this.carrera = carrera;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public void establecer_creditos(int creditos) {
        this.creditos = creditos;
    }

    public Carrera obtener_carrera() {
        return carrera;
    }

    public void establecer_carrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String toString(){
        return String.format("Asignatura\n"
                + "Nombre: %s\n"
                + "Creditos:%d\n"
                + "Carrera: %s\n"
                + "Modalidad: %s"
                ,obtener_nombre(),obtener_creditos(),obtener_carrera().obtener_nombre(),obtener_carrera().obtener_modalidad() );
    }
    
}
