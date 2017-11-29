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
public class Libro extends Publicacion {
    private Autor revisor;

    public Libro(Autor revisor, int id, Autor autor_principal, Autor autor_secundario, int numPaginas) {
        super(id, autor_principal, autor_secundario, numPaginas);
        this.revisor = revisor;
    }

    public Autor getRevisor() {
        return revisor;
    }

    public void setRevisor(Autor revisor) {
        this.revisor = revisor;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "Revisor: %s\n"
                + "Numero de Paginas: %d\n",super.toString(),getRevisor(),getNumPaginas());
    }
}
