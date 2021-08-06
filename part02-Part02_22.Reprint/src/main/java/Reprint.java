
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int times = scanner.nextInt();
        int count = 0;
        while (true) {
            printText();
            count++;
            if (count == times) {
                break;
            }
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
