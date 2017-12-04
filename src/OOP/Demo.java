/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Lewis
 * 
 * 
 */

 class Person {
            String name;
            String email;
            String phone;
            
            void walk(){
                    System.out.println(name + " is walking");
                    
                
            }
            
            void eat(){
                System.out.println(name + " is eating");
                
        }
            void sleep(){
                System.out.println(name + " is sleeping");
                
                
}
            
        }
    
public class Demo {
    public static void main(String[] args){
        
        //instantiating an object
        Person person1 = new Person();
        
        //define some properties
        person1.name = "Lewis";
        person1.email = "lewisross_23@hotmail.co.uk";
        person1.phone = "07742371939";
        
        //abstraction
        person1.eat();
        person1.sleep();
        person1.walk();
        
        Person person2 = new Person();
        person2.name = "Nicole";
        
        person2.sleep();
            
        
        //person-
        
        //attributes, varibles, ajectives, descriptors
       /* String name = "Lewis";
        String email = "lewisross_23@hotmail.co.uk";
        String number = "07742371939";
        
        //action, activity, behaviour
        System.out.println(name + " is walking");
        System.out.println(name + " is eating");
        walking(name);
        
        //what if we wanted to do this for a different person?
        
        
         //attributes, varibles, ajectives, descriptors
        String name2 = "nicole";
        String email2 = "nicole@hotmail.co.uk";
        String number2 = "07742371938";
        
        //action, activity, behaviour
        walking(name2);
        System.out.println(name2 + " is walking");
        System.out.println(name2 + " is eating");
    }
        
        //enhance by adding functions to minimize code
        
        static void walking(String name){
            System.out.println(name + " is walking");
            
    
        }   
     */ 
        //what about binding attributes and properties together?
        
       
}
}