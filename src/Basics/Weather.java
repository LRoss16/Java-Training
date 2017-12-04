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
public class Weather {
    public static void main(String[] args){
        //This program will give suggestions what to wear based on the weather(temperature and sun condition)
        
        int temperature = 85;
        String sunCondition = "Overcast";
        
        
        if(temperature > 80){
            System.out.println("It's pleasant. Wear shorts and a t-shirt");
            
        }
        else if (temperature>60 && sunCondition != "Sunny"){
            System.out.println("It's a little cooler. Wear a long sleeve shirt and jeans");
            System.out.println("Wear a hat to keep sun out of eyes");
            
        }
        else if (temperature> 50 || (sunCondition == "Overcast")){
            System.out.println("This is a cool day. Make sure to wear warmer clothes");
        }
        else {
            System.out.println("Looks a cold day. Bring a sweater");
            
        }
        System.out.println("The process is ending");
        
    }
}
