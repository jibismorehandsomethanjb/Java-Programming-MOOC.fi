
import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> items;
    
    @Override
    public void add(Item item) {
        try {
            this.items.add(item);
        } catch (Exception e){
            
        }
        
    }
    
    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
