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
public class BankAccountApp {
    public static void main(String[] args){
        //creating a new bank account >> think instantiate an object
        
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "0145637";
       acc1.setName("Lewis Ross");
       acc1.setSsn("128890");
       acc1.setAccountTypes("Savings");
        acc1.balance = 100000;
        
        acc1.deposit(20000);
        acc1.deposit((300000));
        acc1.withdraw(12000);
        
        
        System.out.println(acc1.toString());
        
        /*
        BankAccount acc2 = new BankAccount("Checking account");
        acc2.accountNumber = "837279";
        
        BankAccount acc3 = new BankAccount("Savings account", 100000);
        acc3.accountNumber = "3538998";
        
        
        System.out.println(acc1.routingNumber);
        System.out.println(acc2.routingNumber);
        System.out.println(acc3.routingNumber);
        
        
        BankAccount acc4 = new BankAccount("Checking account", 500);
        
        BankAccount acc5 = new BankAccount("Savings account", 100000);
        
        acc4.checkBalance();
        
        acc5.checkBalance();
        
        CDAccount cd1 = new CDAccount();
        cd1.name = "Joe bloggs";
        cd1.accountNumber = "4791910";
        cd1.interestRate = 4.5;
        cd1.balance = 5000;
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());
        cd1.Compound();
        
     */   
        
    }
    //Demo for inheristance
    
  
    
   
   
    
    
    
}
