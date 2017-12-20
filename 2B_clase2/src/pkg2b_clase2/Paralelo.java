/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b_clase2;

import java.util.ArrayList;

/**
 *
 * @author daulloa2
 */
public class Paralelo {
    
    ArrayList<Estudiante>listaEstudiante= new ArrayList<>();

    public ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(ArrayList<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }
    
    public double MediaEdad(){
        double media = 0;
        for (Estudiante listaEstudiante1 : listaEstudiante) {
            media += listaEstudiante1.getEdad();
            
        }
        
        media/=listaEstudiante.size();
        return media;
    }
    
}
