
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        printNumbersInRange(numbers, -1, 6);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit +"]");
        for (int i = 0 ; i < numbers.size(); i++) {
            if (numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
