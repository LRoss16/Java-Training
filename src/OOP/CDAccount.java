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
public class CDAccount extends BankAccount{
    Double interestRate;
    
    void Compound(){
        Double interest = interestRate * balance;
        System.out.println("Compounding interest: £" + interest );
    }
    
}
