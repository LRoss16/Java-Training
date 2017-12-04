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
public class Strings {
    public static void main(String[] args){
        String bookTitle;
        bookTitle = "The Lord of the Rings";
        String wordChoice = "Ring";
        
      if(bookTitle.contains("Ring")){
          System.out.println("The book contains the word ring");
          
      }
      
      if (bookTitle.contains(wordChoice)){
          System.out.println("The book contains the word " + wordChoice);
      }
      
      String browser = "Chrome";
      if (browser.equalsIgnoreCase("chrome")){
      System.out.println("browser is chrome");
      }
      
      //Print initials plus last 4 digits of SSN
      String firstName = "Lewis";
      String lastName = "Ross";
      String SSN = "1501830";
      System.out.print(firstName.substring(0,1));
      System.out.print(lastName.substring(0,1));
      System.out.print(SSN.substring(3));
      
      System.out.println("\nThere are " + SSN.length() + " digits in your SSN");
      
      
    }
    
}
