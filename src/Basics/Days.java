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
public class Days {
    public static void main(String[] args){
        //Execute different block of code based on value of condtiont
        
        String dayOfWeek = "Tuesday";
        
        switch (dayOfWeek){
            case "Monday" : 
                System.out.println("Today is monday");
                break;
            case "Tuesday" : 
                System.out.println("Today is tuesday");
                break;
            case "Wednesday" : 
                System.out.println("Today is wednesday");
                break;
            case "Thursday" : 
                System.out.println("Today is thursday");
                break;
            case "Friday" : 
                System.out.println("Today is friday");
                break;
                
        }
    }
    
}
