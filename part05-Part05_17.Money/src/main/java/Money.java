
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int sumEuros = this.euros + addition.euros;
        int sumCents = this.cents + addition.cents;
        if (sumCents >= 100) {
            sumCents = sumCents % 100;
            sumEuros += 1;
        }
        Money newMoney = new Money(sumEuros, sumCents);
        return newMoney;
    }
    
    public Money minus(Money addition) {
//        int diffEuros = this.euros - addition.euros;
//        int diffCents = this.cents - addition.cents;
//        if (diffCents < 0 ) {
//            diffCents = Math.abs(diffCents);
//            diffEuros -= 1;
//        }
//        if (diffEuros < 0) {
//            diffEuros = 0;
//        }
        int thisToCents = this.euros * 100 + this.cents;
        int additionToCents = addition.euros * 100 + addition.cents;
        int difference = thisToCents - additionToCents;
        if (difference < 0) {
            difference = 0;
        }
        int newEuros = difference / 100;
        int newCents = difference % 100;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros < compared.euros) {
            return true;
        } else return this.cents < compared.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
