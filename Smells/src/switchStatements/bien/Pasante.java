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
public class Pasante extends Empleado{
    public Pasante(){
        super();
    }
    public Pasante(String name){
        super(name);
        super.cargo="Regular";
    }
}
