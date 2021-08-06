
import java.util.ArrayList;

public class Statistics {
    private ArrayList<Integer> list = new ArrayList<>();
    private int count = 0;
    
    public void addNumber(int number) {
        list.add(number);
        count++;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        int sum = 0;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            } 
        }
        return sum;
    }
    
    public double average() {
        double avg = 0;
        if (count != 0) {
            avg = this.sum() * 1.0 / count;
        }
        return avg;
    }
}
