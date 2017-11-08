/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Profesor extends Persona {
    private double sueldo;

    public Profesor(){
        super("Re","n",53);
    }
    
    public Profesor(double sueldo) {
        super("Re","n",53);
        setSueldo(sueldo);
    }
    
    public Profesor(double sueldo, String n, String a, int e) {
        super(n, a, e);
        setSueldo(sueldo);
    }
    
    @Override
    public void setEdad(int edad){
        if(edad<18)
            this.edad=18;
        else
            this.edad=edad;
    }
   
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return String.format("%s - sueldo: %.2f",super.toString(),getSueldo());
    }
}


