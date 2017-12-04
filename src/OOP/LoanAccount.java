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
public class LoanAccount implements IRate {

    @Override
    public void setRate() {
       System.out.println("Set rate");
       
    }

    @Override
    public void increaseRate() {
        System.out.println("Increasin rate");
    
    
}
}