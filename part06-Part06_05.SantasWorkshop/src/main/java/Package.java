
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
public class Package {
    private ArrayList<Gift> giftpack;
    
    public Package() {
        giftpack = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        giftpack.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift : giftpack) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
    
}
