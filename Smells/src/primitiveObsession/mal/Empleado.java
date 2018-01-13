/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveObsession.mal;

/**
 *
 * @author LULANB
 */
public class Empleado {
    String name;
    //1 = administrador
    //2 = regular
    int tipo;
    String cargo;
    
    public Empleado(String name){
        this.name=name;
        this.cargo="regular";
    }
    public Empleado(String name,int tipo){
        this.name=name;
        if(tipo == 1)
            this.cargo="administrador";
        else
            this.cargo="regular";
    }
}
