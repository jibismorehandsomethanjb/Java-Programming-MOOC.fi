/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Container {
    private int value = 0;
    private int limit = 100;
    
    public Container() {
    }

    public int getValue() {
        return value;
    }

    public int getLimit() {
        return limit;
    }
    
    public void setValue(int amount) {
        this.value = amount;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            setValue(getValue() + amount);
            if (getValue() > getLimit()) {
                setValue(getLimit());
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            setValue(getValue() - amount);
            if (getValue() < 0) {
                setValue(0);
            }
        }
    }
    
}
