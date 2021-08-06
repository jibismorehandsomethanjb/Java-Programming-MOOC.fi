/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation = 0;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }
    
    public void observed() {
        this. observation += 1;
    }
    
    public String toString() {
        return this.getName() + "(" + this.getLatinName() + "): " + this.getObservation() + " observations";
    }
}
