/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments.bien;

/**
 *
 * @author LULANB
 */
public class Empleado {
    String name;
    String cargo;
    double sueldo;
    
    public Empleado(){
    }
    public Empleado(String name){
        this.name = name;
    }
    
    public double getSueldoAnual(){
        return this.sueldo*12;
    }
}
