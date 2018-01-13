/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatements.bien;


/**
 *
 * @author LULANB
 */
public class Administrador extends Empleado{
    public Administrador(){
        super();
    }
    public Administrador(String name){
        super(name);
        super.cargo="Administrador";
    }
}
