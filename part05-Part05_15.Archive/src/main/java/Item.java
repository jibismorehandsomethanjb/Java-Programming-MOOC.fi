/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Item {
    String id;
    String name;
    
    public Item (String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return this.id.equals(comparedItem.id);
    }
    
}
