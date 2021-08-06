
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        
        while (!input.equals("")) {
            System.out.println(array[0]);
            input = scanner.nextLine();
            array = input.split(" ");
        }
    }
}
