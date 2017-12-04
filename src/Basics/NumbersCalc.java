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
public class NumbersCalc {
    public static void main(String[] args){
        System.out.println("Program is starting");
        
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA,numB);
        System.out.println("The product of " + numA + " and " + numB + " is: " + multiplyNumbers(numA, numB));
        int products = multiplyNumbers(numA, numB);
        System.out.println("The product of " + numA + " and " + numB + " is: " + products);
    }
    
    
   static void  printName(){
       System.out.println("My name is Lewis");
   }
   
            
   static void addNumbers(int numberA, int numberB){
       //This function will add 2 numbers
       int sum = numberA + numberB;
       System.out.println("The sum of numbers " + numberA + " and " + numberB + " is: " + sum);
   
   }  
       
       
      static int multiplyNumbers(int valueA, int valueB){
          int product = valueA * valueB;
          addNumbers(product, product);
          return product;
      }
}

