
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Suitcase {
    private ArrayList<Item> suitcase = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : suitcase) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            suitcase.add(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }
        Item returnItem = suitcase.get(0);
        for (Item item : suitcase) {
            if (returnItem.getWeight() < item.getWeight()) {
                returnItem = item;
            } 
        }
        return returnItem;
    }   
    
    public void printItems() {
        for (Item item : suitcase) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public String toString() {
        int size = suitcase.size();
        int totalWeight = this.totalWeight();
        if (size == 0) {
            return "no items (0 kg)";
        }
        if (size == 1) {
            return "" + size + " item (" + totalWeight + " kg)";
        } else {
            return "" + size + " items (" + totalWeight + " kg)";
        }
    }
}
