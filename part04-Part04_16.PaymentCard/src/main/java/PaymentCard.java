/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class PaymentCard {
    private double balance = 0.0;
    
    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }
    
    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        } else {
            balance += amount;
        } 
        
        if (balance > 150.0) {
             balance = 150.0;
        }
    }
    
    @Override
    public String toString() {
        return ("The card has a balance of " + balance + " euros");
    }
}
