
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        for (int i = 0; i <= list.size() - 1; i++) {
            int temp = list.get(i);
            if (temp > max) {
                max = temp;
            }
        }
        
        System.out.println("The greatest number: " + max);

        // implement finding the greatest number in the list here
    }
}
