/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Timer {
    private ClockHand milliSecond = new ClockHand(100);
    private ClockHand second = new ClockHand(60);
    
    public void advance() {
        milliSecond.advance();
        
        if (milliSecond.value() == 0) {
            second.advance();
        }
    }
    
    @Override
    public String toString() {
        return (String.format("%02d", second.value())) + ":" + (String.format("%02d", milliSecond.value()));
    }
    
}
