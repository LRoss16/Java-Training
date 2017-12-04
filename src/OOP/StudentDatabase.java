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
public class StudentDatabase {
    
    private String name;
    private String ssn;
    private String email;
    private static int id = 1000;
    private String userID;
    private String courses = "";
    private double balance = 0;
    private static final int tuitionFee = 400;
    private boolean tuitionPaid;
    private String phoneNumber;
    private String city;
    private String county;

   
    
    public StudentDatabase(String name, String ssn){
        id++;
        this.name = name;
        this.ssn = ssn;
        setEmail();
        setUserID();
        
    }
    private void setEmail(){
        email = name + "@aceuni.co.uk";
        System.out.println("Your student email is: " + email);
    }
    
    public String getEmail(){
        return email;
    }
        
    private void setUserID(){
        int max = 9000;
        int min = 1000;
        
        int random = (int)(Math.random()*((max - min)));
        random = random = + min;
        userID = id + "" + random + ssn.substring(7);
        System.out.println("Your user id is: " + userID);
        
        
    }
    
     public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
    
            
  
    
    
    public void enroll(String course){
        if (tuitionPaid == true){
        this.courses = this.courses + course;
        }else {
            System.out.println("You need to pay the tuition fee first before you can enroll");
        }
       
    }
    
    public void topUpBalance(double amount){
        balance = balance + amount;
        System.out.println("Your balance is : £ " + balance);
        
    }
    public void checkBalance(){
        System.out.println(balance);
        
    }
    
    public void pay(){
        if (tuitionFee > balance){
            tuitionPaid = false;
            System.out.println("I'm sorry you have insufficient funds for tuition");
           
        } else{
            balance = balance - tuitionFee;
            System.out.println("Thank you for your payment");
            System.out.println("Your new balance is: £ " + balance);
            tuitionPaid = true;
        }
        
       
        }
    public void showCourses(){
        System.out.println("Your courses are: " + courses);
    }
    
    public String toString(){
        return ("Your full details are: " + "name: " + name + " ssn: " + ssn + " email: " +
                getEmail() + " courses: " + courses + " userID: " + userID + " balance: " + balance
                + " city/town you live in: " + getCity() + " in county: " + getCounty() +
                " phone number: " + getPhoneNumber());
    }
      
}