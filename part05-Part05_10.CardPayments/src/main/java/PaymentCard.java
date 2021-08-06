
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean takeMoney(double amount) {
        if (balance >= amount) {
            setBalance(balance() - amount);
            return true;
        } else {
            return false;
        }
    }
}
