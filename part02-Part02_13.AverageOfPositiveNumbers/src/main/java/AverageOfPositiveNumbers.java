
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int positiveCount = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                sum = sum + num;
                positiveCount++;
            } else {
                continue;
            }
        }
        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / positiveCount);
        }

    }
}
