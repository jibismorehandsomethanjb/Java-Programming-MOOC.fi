
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        while (!(input == -1)) {
            if (input % 2 == 0) {
                all.addNumber(input);
                even.addNumber(input);
            } else {
                all.addNumber(input);
                odd.addNumber(input);
            }
            
            input = scanner.nextInt();
        }
        
        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " +odd.sum());
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
