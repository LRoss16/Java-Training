/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Lewis
 */
public class StudentDatabaseApp {
    public static void main(String[] args){
   
       StudentDatabase s1 = new StudentDatabase("Lewis Ross", "12245789491");
       StudentDatabase s2 = new StudentDatabase("Jamie Fox", "28563782922");
       
      s1.setPhoneNumber("07742371939");
      s1.setCity("Inverurie");
      s1.setCounty("Aberdeenshire");
      
       
       s1.topUpBalance(30000);
       s1.checkBalance();
       s1.pay();
       s1.enroll("Computing");
       s1.enroll(" Physics");
       s1.enroll(" French");
       s1.showCourses();
       System.out.println(s1.toString());
    
       
       
       s2.setCity("Mastrick");
       s2.setCounty("Aberdeen");
       s2.setPhoneNumber("07184671829");
       s2.topUpBalance(1200);
       s2.checkBalance();
       s2.pay();
       s2.enroll("German");
       s2.enroll(" Biology");
       s2.enroll(" Information Systems");
       s2.showCourses();
       System.out.println(s2.toString());
    }
    
   
    
    
    
    
}
