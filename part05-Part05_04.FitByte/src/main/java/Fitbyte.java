/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte (int age, int restinghr) {
        this.age = age;
        restingHeartRate = restinghr;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maxRate = 206.3 - (0.711 * age);
        double targetRate = (maxRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
        return targetRate;
    }
}
