/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Asignatura {
    private int creditos;
    private String nombre;

    public int obtener_creditos() {
        return creditos;
    }

    public void agregar_creditos(int creditos) {
        this.creditos = creditos;
    }

    public String obtener_nombre() {
        return nombre;
    }


    public void agregar_nombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return String.format("Asignatura: %s con numero de creditos %d\n", obtener_nombre(), obtener_creditos());
    }
    
}
