
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int price() {
        return this.squares * this.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        int priceDiffer = this.price() - compared.price();
        return Math.abs(priceDiffer);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.price() > compared.price());
    }

}
