/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments.mal;

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
    //Funcion para calcular y retornar el valor del
    //sueldo anual.
    public double gSldYr(){
        return this.sueldo*12;
    }
}
