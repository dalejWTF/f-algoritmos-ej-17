/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevasolucion;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Docente {
    
    private String nombres, apellidos;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    
    
    public String obtener_nombres() {
        return nombres;
    }

    public void agregar_nombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void agregar_apellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Asignatura obtener_asignatura1() {
        return asignatura1;
    }

    public void agregar_asignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }
    
    public Asignatura obtener_asignatura2() {
        return asignatura2;
    }

    public void agregar_asignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    @Override
    public String toString(){
        return String.format("Datos Docente\n"
                + "Nombre: %s\n"
                + "Apellidos: %s\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "%s"
                + "%s"
                + "", obtener_nombres(),obtener_apellidos(),obtener_asignatura1(),obtener_asignatura2());
    }
    
}
