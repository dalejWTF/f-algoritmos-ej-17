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
public class Publicacion {
    
    
    private int id;
    private Autor autor_principal;
    private Autor autor_secundario;
    private int numPaginas;
    
    public Publicacion(int id, Autor autor_principal, Autor autor_secundario, int numPaginas) {
        this.id = id;
        this.autor_principal = autor_principal;
        this.autor_secundario = autor_secundario;
        this.numPaginas = numPaginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Autor getAutor_principal() {
        return autor_principal;
    }

    public void setAutor_principal(Autor autor_principal) {
        this.autor_principal = autor_principal;
    }

    public Autor getAutor_secundario() {
        return autor_secundario;
    }

    public void setAutor_secundario(Autor autor_secundario) {
        this.autor_secundario = autor_secundario;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    @Override
    public String toString(){
        return String.format("%s con id %d\n"
                + "Autor Principal: %s\n"
                + "Autor Secundario: %s"
                + "", super.getClass().getSimpleName(),getId(),getAutor_principal(),getAutor_secundario());
    }
    
}
