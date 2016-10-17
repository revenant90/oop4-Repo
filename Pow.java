/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_Recursion;

/**
 *
 * @author Joshua
 */
public class Pow {
    
    public static int pow(int x, int y){
        if (y == 0)
            return 1;
        else
            return x * pow(x, y-1);
        
        
            
        
    }
    
    public static void main(String args[]){
        
        int x = 6;
        int y = 5;
        int result = 1;
       // for(int i = 0; i<n; i++){
        //    result = result * x;
       // }
       result = pow(x,y);
       System.out.print(result);
        
        
        
    }
    
    
}
