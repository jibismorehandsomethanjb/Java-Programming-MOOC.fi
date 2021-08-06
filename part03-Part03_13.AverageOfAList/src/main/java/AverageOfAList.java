
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        double result = (double) sum / list.size();
        System.out.println("Average: " + result);
    }
}
