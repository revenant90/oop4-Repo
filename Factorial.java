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
public class Factorial {
       
    public static int factorial( int n ) {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result1 = factorial(n-1); 
         int result2 = n * result1;
         return result2;
         //return n * factorial(n-1);
      }
   }
   public static void main(String args[]){
       int n = 5;
        int answer = Factorial.factorial(n);
        System.out.print(answer);
   }    
}
