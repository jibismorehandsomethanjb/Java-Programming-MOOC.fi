/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Cube {
    int edgeLength;
    
    public Cube (int length) {
        edgeLength = length;
    }
    
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }
    
    public String toString() {
        int v = volume();
        return "The length of the edge is " + edgeLength + " and the volume " + v;
    }
}
