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
public class Futbolista {
    private String nombre;
    private String apellido;
    private String posicion;
    private int dorsal;
    private Equipo equipo;

    public Futbolista(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        setPosicion("LATERAL");
        setDorsal(25);
        this.equipo= new Equipo("Manchester United","Inglaterra");
        
    }

    public Futbolista(String nombre, String apellido, String posicion, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        setDorsal(7);
        this.equipo= new Equipo(equipo,"Mexico");
       
    }

    public Futbolista(String nombre, String apellido, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.equipo= new Equipo(equipo,"Italia");
        setPosicion("DELANTERO");
        setDorsal(32);
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s \n"
                + "%s,\n"
                + "su posición es %S y\n"
                + "su dorsal es el número %d.\n"
                , getNombre(),getApellido(),equipo.toString(),getPosicion(),getDorsal());
    }
    
}
