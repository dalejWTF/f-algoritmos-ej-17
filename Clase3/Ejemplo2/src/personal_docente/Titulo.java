/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_docente;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Titulo {
    private String nombre, nombre_universidad;

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_nombre_universidad() {
        return nombre_universidad;
    }

    public void agregar_nombre_universidad(String nombre_universidad) {
        this.nombre_universidad = nombre_universidad;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %s\n",obtener_nombre(),obtener_nombre_universidad());
    }    
}
