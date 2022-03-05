
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + this.weightOfItems() > this.capacity) {
            return;
        }
        
        this.items.add(item);
    }
    
    private int weightOfItems() {
        int weight = 0;
        for (Item item : this.items) {
            weight += item.getWeight();
        }
 
        return weight;
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
