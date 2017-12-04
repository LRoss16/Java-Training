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
public class Assignment {
    public static void main(String[] args){
     
        
        System.out.println(sum(5));
        
        System.out.println("factorial: " + factorial(10));
        int[] numbers = {5, -2 , 0, 234, -438, 63};
     System.out.println("Min: " + findMin(numbers));   
     System.out.println("Max: " + findMax(numbers));
     System.out.println("Average: " + findAverage(numbers));
    }
    

 //Write a function that takes a value n returns the sum of numbers 1 to n       
public static int sum(int n){
    int sum = 0;
    for (int i = 0; i<=n; i++){
        System.out.println(sum + " + " + i);
        sum = sum + i;
        System.out.println(" = " + sum);
        
    
}
return sum;
    
            
}

//Write a function that computes the factorial value
//Definition: n! = n*(n-1)! , where 0! = 1
//1! = 1
//2! = 2 * 1! = 2 * 1
//3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
//4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
    
public static int factorial(int n){
    if (n == 0){
        return 1;
         }
    
    else if (n == 1){
        return 1;
        
    }
    return factorial(n-1) * n;      
  

}


//Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.

public static int findMin(int[] array){
    int min = array[0];
   for (int i = 0; i < array.length; i++) {
       if(array[i]< min){
           min = array[i];
           
   }
        
    }
    return min;

}


public static int findAverage(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum = sum + array[i];
    }
    return sum / array.length;
}

public static int findMax(int[] array) {
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}

}