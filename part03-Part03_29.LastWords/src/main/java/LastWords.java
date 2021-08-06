
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        
        while (!input.equals("")) {
            System.out.println(array[array.length - 1]);
            input = scanner.nextLine();
            array = input.split(" ");
        }


    }
}
