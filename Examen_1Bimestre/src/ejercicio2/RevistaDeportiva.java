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
public class RevistaDeportiva extends Publicacion{
    private String nombre;
    private String nombreDeporte;
    private Autor reportero;

    public RevistaDeportiva(String nombre, String nombreDeporte, Autor reportero, int id, Autor autor_principal, Autor autor_secundario, int numPaginas) {
        super(id, autor_principal, autor_secundario, numPaginas);
        this.nombre = nombre;
        this.nombreDeporte = nombreDeporte;
        this.reportero = reportero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public Autor getReportero() {
        return reportero;
    }

    public void setReportero(Autor reportero) {
        this.reportero = reportero;
    }
    
    @Override
    public String toString(){
        return String.format("Revista Deportiva con id %d\n" +
                            "Nombre: %S\n" +
                            "Autor Principal: %s\n" +
                            "Autor Secundario: %s\n" +
                            "Reportero: %s\n" +
                            "Revista vinculada al %S\n" +
                            "Número de páginas: %d\n",getId(),getNombre(),getAutor_principal(),getAutor_secundario(),getReportero(),getNombreDeporte(),getNumPaginas());
    }
}
