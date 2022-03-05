
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable {
    private List<Movable> herdList = new ArrayList<Movable>();
    
    public Herd() {
    }
    
    public void addToHerd(Movable movable) {
        herdList.add(movable);
    }
   
    public String toString() {
        String string = "";
        for (Movable herd : herdList) {
            string += herd.toString() + "\n";
        }
        return string;
    }
    
    @Override
    public void move(int dx, int dy){
        for (Movable herd : herdList) {
            herd.move(dx, dy);
        }
    }
}
