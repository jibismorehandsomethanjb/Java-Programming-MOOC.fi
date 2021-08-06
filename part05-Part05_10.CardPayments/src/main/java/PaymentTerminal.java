
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        money = 1000.0;
        affordableMeals = 0;
        heartyMeals = 0;
    }

    public void terminalGain(double price) {
        this.money = money + price;
    }

    public void countAffordableMeals() {
        this.affordableMeals += 1;
    }

    public void countHeartyMeals() {
        this.heartyMeals += 1;
    }
    
    public double eatAffordably(double payment) {
        double affordablyPrice = 2.5;
        if (payment >= affordablyPrice) {
            terminalGain(affordablyPrice);
            countAffordableMeals();
            double change = payment - affordablyPrice;
            return change;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartilyPrice = 4.3;
        if (payment >= heartilyPrice) {
            terminalGain(heartilyPrice);
            countHeartyMeals();
            double change = payment - heartilyPrice;
            return change;
        }
        return payment;
    }
    
     public boolean eatAffordably(PaymentCard card) {
        double affordablePrice = 2.5;
        if (card.balance() >= affordablePrice) {
            double change = eatAffordably(card.balance());
            card.setBalance(change);
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartilyPrice = 4.3;
        if (card.balance() >= heartilyPrice) {
            double change = eatHeartily(card.balance());
            card.setBalance(change);
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            terminalGain(sum);
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
