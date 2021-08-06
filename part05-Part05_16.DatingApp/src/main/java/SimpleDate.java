
public class SimpleDate {

    private int day;
    private int month;  //let's assume that each month have 30 days
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        this.advance(1);
    }
    
    public void advance(int howManyDay) {
        this.day += howManyDay;
        toValidFormat(); // method to adjust date and month in the limit
    }
   
    public void toValidFormat() {
        int dtemp = this.day;
        int mtemp = this.month;
        int ytemp = this.year;
        
        if (this.day > 30) {
            this.day = dtemp % 30;
            this.month += dtemp / 30;
        }
        if (this.month > 12) {
            this.month = (mtemp / 12) + (mtemp % 12);
            this.year += mtemp / 12;
        }
            
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        clone.advance(days);
        return clone;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}

