/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethod.mal;

/**
 *
 * @author LULANB
 */
public class EqCuadratica {
    public static void resolver(double a, double b, double c)
    {   
        double d = (b*b)-(4*a*c);
        
        if( d == 0 )
        {   
            double rsp = (-b)/(2*a);
            System.out.println("Unica Solucion Real");
            System.out.println("X1 = X2 = "+rsp);
        }else if( d > 0 )
        {
            double x1 = ((-b)+Math.sqrt(d))/(2*a);
            double x2 = ((-b)-Math.sqrt(d))/(2*a);
            System.out.println("Dos Soluciones Reales:");
            System.out.println("X1 = " + x1); 
            System.out.println("X2 = " + x2); 
            
        }else 
        {
            d*=-1;
            double xr = (-b)/(2*a);
            double xi = Math.sqrt(d)/(2*a);
            
            System.out.println("Dos Soluciones Imaginarias:");
            System.out.println("X1 = " + xr +"+"+ xi +"i"); 
            System.out.println("X1 = " + xr +"-"+ xi +"i"); 
            
        }
    }
}
