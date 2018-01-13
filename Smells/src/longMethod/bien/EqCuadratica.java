/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethod.bien;

/**
 *
 * @author LULANB
 */
public class EqCuadratica {
    //Para resolver --> a(X^2)+b(X)+c = 0
    public static void resolver(double a, double b, double c)
    {   
        double discriminante = (b*b)-(4*a*c);
        
        if(discriminante < 0)
            raicesComplejas(discriminante,a,b);
        else
            raicesReales(discriminante,a,b);   
    }
    
    private static void raicesComplejas(double discriminante, double a, double b) {
        discriminante*=-1;
        printTwoComplex((-b)/(2*a),Math.sqrt(discriminante)/(2*a));
    }
    private static void printTwoComplex(double xr, double xi) {
        System.out.println("Dos Soluciones Imaginarias:");
        System.out.println("X1 = " + xr +"+"+ xi +"i"); 
        System.out.println("X1 = " + xr +"-"+ xi +"i"); 
    }
    
    private static void raicesReales(double discriminante, double a, double b) {
        if( discriminante == 0 )
        {   
            printOneReal((-b)/(2*a));
        }else{
            printTwoReal(((-b)+Math.sqrt(discriminante))/(2*a),((-b)-Math.sqrt(discriminante))/(2*a));
        }
    }
    private static void printOneReal(double x){
        System.out.println("Unica Solucion Real");
        System.out.println("X1 = X2 = "+x);
    }
    private static void printTwoReal(double x1, double x2) {
        System.out.println("Dos Soluciones Reales:");
        System.out.println("X1 = " + x1); 
        System.out.println("X2 = " + x2); 
    }   
}