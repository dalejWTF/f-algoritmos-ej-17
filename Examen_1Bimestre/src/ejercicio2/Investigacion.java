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
public class Investigacion extends Publicacion{
    private String universidad;
    private String areaInvestigacion;

    public Investigacion(String universidad, String areaInvestigacion, int id, Autor autor_principal, Autor autor_secundario, int numPaginas) {
        super(id, autor_principal, autor_secundario, numPaginas);
        this.universidad = universidad;
        this.areaInvestigacion = areaInvestigacion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getAreaInvestigacion() {
        return areaInvestigacion;
    }

    public void setAreaInvestigacion(String areaInvestigacion) {
        this.areaInvestigacion = areaInvestigacion;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "%s\n"
                + "Area de Investigacion: %s\n"
                + "Numero de Paginas: %d\n", super.toString(),getUniversidad(),getAreaInvestigacion(),super.getNumPaginas());
    }
    
}
