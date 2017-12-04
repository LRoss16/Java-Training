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
public class Cities {
    public static void main(String[] args){
        //Declare and define array
        
   String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
   System.out.println(cities[0]);
   System.out.println(cities[1]);
   System.out.println(cities[2]);
   System.out.println(cities[3]);
   
   System.out.println("**********************");
   
   
   //Declare and define the array(only size)
   String[] states = new String[5];
   states[0]= "California";
   states[1] = "Ohio";
   states[2] = "New Jersey";
   states[3] = "Texas";
   states[4] = "Utah";
   int i = 0;
   //Do loop enters the loop THEN tests condition
   do {
       System.out.println("STATES: " + states[i]);
       i = i + 1;
   } while (i <5);
    
//While loop, tests condition first then enters loop

int n = 0;
boolean stateFound = false;
while(!stateFound) {
    String state = states[n];
    System.out.println(state);
    if (state == "Texas"){
        System.out.println("State found");
        stateFound = true;
        
    }    
    
    n++;
    
}

//for loop: best structur for itirating through array
System.out.println("\nPrinting with for loop");

for(int x = 0; x<5; x++){
    System.out.println(states[x]);
    
}

  
System.out.println("*****************");
   System.out.println(states[0]);
   System.out.println(states[1]);
   System.out.println(states[2]);
   System.out.println(states[3]);
   System.out.println(states[4]);
   
   
   
   //Declare array
   String[] countries;
   
   //Define array
   countries = new String[3];
   countries[0] = "USA";
   countries[1] = "Canada";
   countries[2] = "Scotland";
   System.out.println(countries[2]);
   
}
   

}