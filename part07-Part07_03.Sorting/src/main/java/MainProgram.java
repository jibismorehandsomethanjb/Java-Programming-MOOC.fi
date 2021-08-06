
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {6, 3, 0, -1, 4};
        System.out.println(indexOfSmallest(array));
        sort(array);
    }
    
    public static int smallest(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
    
    public static int indexOfSmallest(int[] array){
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = table[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (min > table[i]) {
                min = table[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {
            
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            
            index += 1;
        }

    }
}

