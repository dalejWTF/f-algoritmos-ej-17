/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Asignatura {
    private String nombre;
    private double costo;
    private String tipo;

    public Asignatura(String nombre, double costo, String tipo) {
        setNombre(nombre);
        setCosto(costo);
        setTipo(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s\n"
                + "Tipo: %s\n"
                + "Costo: %.2f\n",getNombre(),getTipo(),getCosto());
    }
    
}
