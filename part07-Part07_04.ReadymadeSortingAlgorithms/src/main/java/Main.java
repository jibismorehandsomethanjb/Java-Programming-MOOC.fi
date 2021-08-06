
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Geeks For Geeks");
        stringList.add("Friends");
        stringList.add("Dear");
        stringList.add("Is");
        stringList.add("Superb");
        
        sortStrings(stringList);
        System.out.println(stringList);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
            
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
