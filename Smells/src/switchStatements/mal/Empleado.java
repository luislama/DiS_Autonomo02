/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatements.mal;

/**
 *
 * @author LULANB
 */
public class Empleado {
    String name;
    //1 = administrador
    //2 = regular
    //3 = temporal
    //4 = pasante
    int tipo;
    String cargo;
    
    public Empleado(String name){
        this.name=name;
        this.cargo="regular";
    }
    public Empleado(String name,int tipo){
        this.name=name;
        switch(tipo){
            case 1:
                this.cargo="administrador";
                break;
            case 2:
                this.cargo="regular";
                break;
            case 3:
                this.cargo="temporal";
                break;
            case 4:
                this.cargo="pasante";
                break;               
        }
    }
}
