
public class Organism implements Movable{
    private int dx;
    private int dy;
    
    public Organism(int x, int y) {
        dx = x;
        dy = y;
    }
   
    public String toString() {
        return "x: " + this.dx + "; y: " + this.dy;
    }
    
    @Override
    public void move(int dx, int dy){
        this.dx += dx;
        this.dy += dy;
    }

}
