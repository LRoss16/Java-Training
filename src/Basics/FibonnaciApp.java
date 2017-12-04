/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author Lewis
 */
public class FibonnaciApp {
    //Fibonnacci number is to find the sum of the 2 previous numbers
    //fib (0) = 0
    //fib (1) = 1
   //fib(2) = fib(1) + fib(0) = 1 + 0 =1
    //fib(3) = fib(2) + fib(1) = 1 + 1 = 2
    //fib(4) = fib(3) + fib(2) = 2 + 1 = 3
    //fib(5) = fib(4) + fib(3) = 3 + 2 = 5
    
    
    
    public static void main(String[] arg){
    
        System.out.println(fib(8));
        
    
    }
        public static int fib(int n){
            if (n == 0){
                return 0;
            }
            else if (n == 1){
                return 1;
            }
            return ( ((fib(n-1)) + fib(n-2)) );
                
        }
            
    }
    
    

