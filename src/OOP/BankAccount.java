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
public class BankAccount implements IRate {
    
    String accountNumber;
   private static String routingNumber = "145678";
    private String name;
     private String ssn;
     private String accountTypes;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountTypes(String accountTypes) {
        this.accountTypes = accountTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    String accountType;
    double balance = 0;
    
    //Implementing interfaces
    
    @Override
    public void setRate(){
        System.out.println("Setting Rate");
        
    }
    
    @Override
    public void increaseRate(){
        System.out.println("Increasing Rate");
    }
    
//Constructor definitions: unique methods
    //1.They are used to define/setup/initialize properties of an object
    //2. Constructors are IMPLICITY called upon INSTANTIAION
    //3. The same name as the class itself 
    //4.Constructors have NO return type
    
    
    BankAccount(){
    System.out.println("New account created");
    
    

    }
    
    
    //Overloading: call same method name with different arguments
    
    BankAccount(String accountType){
        System.out.println("New Account: " + accountType);
        
        
        
    }

    BankAccount(String accountType, int initDeposit){
        //accountType, initDeposit, Msg are all local variables
        System.out.println("Brand New Account: " + accountType);
        System.out.println("Initial balance: £" + initDeposit);
        String msg = null;
        if(initDeposit < 1000){
            msg = "ERROR. Initial deposit must be at least £1000. Cannot add deposit";
            
        } else {
            msg = "Thank you for your initial deposit of: £" + initDeposit;
        }
        System.out.println(msg);
        if (initDeposit > 1000){
        balance = balance + initDeposit;
        
         } else {
            balance = 0;
        }
        
    }

//define methods 
   public void deposit(double amount){
       balance = balance + amount;
       showActivity("DEPOSIT");
        
    }
    
    void withdraw(double withdrawal){
        if (withdrawal > balance){
            System.out.println("Insufficient funds");
            balance = balance;
            System.out.println(balance);
        } else {
        balance = balance - withdrawal;
        showActivity("WITHDRAWAL");
        }
    }
    //private: can only be called within class
    private void showActivity(String activity){
        System.out.println("Showing recent activity: " + activity);
        System.out.println("Your new balance is: £" + balance);
    }
    
    void checkBalance(){
        System.out.println(balance);
    }
    
    void getStatus(){
        
    }
    
    @Override
    public String toString(){
        return("account type: " + accountTypes + " account number: " + accountNumber + " name: " + getName() + " SSN Number: " + getSsn() + " balance £: " + balance);
    }
}
