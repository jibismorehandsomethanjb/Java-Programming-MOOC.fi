
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
public class Grade {
    private ArrayList<Integer> list;
    
    public Grade() {
        list = new ArrayList<>();
    }
    
    public void add(int number){
        list.add(number);
    }
    
    public int size() {
        return list.size();
    }
    
    public int count(int number) {
        int count = 0;
        for (int received : list) {
            if (received == number) {
                count++;
            }
        }
        return count;
    }    
    
    public int total() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    
    public double average() {
        return 1.0 * this.total() / this.size();
    }
}
