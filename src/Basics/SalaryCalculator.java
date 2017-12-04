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
public class SalaryCalculator {
    public static void main(String[] args){
        //create variable to define career
        
        //Declare a variable
        String career;
        System.out.println("program starting");
        
        //Define a variable
        career = "software engineer";
        System.out.println("My career is: " + career);
      
        
        //Declare and define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;
        career = "Software developer";
        
        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My salary as a: " + career + " at the rate of £:" + " per hour is £:" + salary + " per year");
        
        
        //computer our annual salary 
        //rate * hours per week * weeks per year
        
        
        
    }
}
