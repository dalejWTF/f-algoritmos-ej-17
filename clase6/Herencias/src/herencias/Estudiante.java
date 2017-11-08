/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import ejemplo1.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private Asignatura_Presencial asignaturas[];
    private double costo;
    public Estudiante(String n, String a, int e, Asignatura_Presencial[] asignaturas){
        super(n, a, e);
        setAsignaturas(asignaturas);
        obtener_valor_matricula();
        //verificar_Edad();
    }

    public Asignatura_Presencial[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura_Presencial[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    public double obtener_valor_matricula(){
        for (Asignatura_Presencial asignatura : this.asignaturas) {
            costo+=asignatura.getCosto();
        }
        return costo;
    }
    
    @Override
    public void setEdad(int edad){
        if(edad<18)
            this.edad=18;
        else
            this.edad=edad;
    }
    /*public void verificar_Edad(){
        if(super.getEdad()<18){
            System.err.println("El estudiante no puede ser menor a 18");
            super.setEdad(18);
        }
            
    }*/
    
    
    @Override
    public String toString(){
        String cadena="";
        for (Asignatura_Presencial asignatura : this.asignaturas) {
            cadena+=asignatura.toString()+"\n";
        }
        return String.format("%s\n"
                + "Costo Matricula: %.2f\n\n"
                + "Listado de Asignaturas\n"
                + "%s", super.toString(),obtener_valor_matricula(), cadena);
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
