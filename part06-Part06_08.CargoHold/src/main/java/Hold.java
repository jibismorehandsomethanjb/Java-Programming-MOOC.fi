
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
public class Hold {
    private ArrayList<Suitcase> hold = new ArrayList<>();
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : hold) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            hold.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        int size = hold.size();
        return "" + size + " suitcases (" + this.totalWeight() + " kg)";
    }
}