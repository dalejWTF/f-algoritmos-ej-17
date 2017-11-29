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
public class Equipo {
    private String nombre;
    private String pais;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString(){
        return String.format("pertenece al equipo %s del país %s",getNombre(),getPais());
    }
    
}
